#!/bin/bash

# definimos el nombre de la imagen del grafico
outputFile="$1.png"

#Definimos el nombre por defecto en caso de no haber ingresado un nombre en el segundo parametro
if [ "$outputFile" == ".png" ]; then
	outputFile="Grafica.png"
fi

#Ahora definimos los nombres de los archivos
grafico1=$(echo "$2" | cut -c 7- | rev | cut -c 5- | rev)
grafico2=$(echo "$3" | cut -c 7- | rev | cut -c 5- | rev)
#Definimos la linea que se usara para la salida del plot
plotLine="plot \"$2\" w lp lw 3 lc rgb \"#62aeef\" pt 6 title \"$grafico1\""
if [[ $3 != "" ]]; then
	plotLine="$plotLine, \"$3\" w lp lw 3 lc rgb \"#ddf056\" pt 6 t \"$grafico2\""
fi

# aqui se ejecuta Gnuplot para generar el gráfico y exportarlo
gnuplot <<-EOF
	# Cambiamos el output de la terminal a png
	set terminal pngcairo enhanced
	set output "./imgs/$outputFile"

	set title "$1" textcolor rgb "white" font "helvetica,12"
	set key left box textcolor "white" font "helvetica,12"
	set object 1 rectangle from screen 0,0 to screen 1,1 behind noclip fc rgb "#32363d" fillstyle solid 1.0
	set border lc rgb "white" lw 2
	set xlabel "Data count" font "helvetica,12" textcolor "white"
	set ylabel "Time (ns)" font "helvetica,12" textcolor "white"
	set tics font "helvetica,11" textcolor rgb "#faf95d"

	# Se crea la grafica
	$plotLine
EOF

echo "El gráfico se ha generado como $outputFile"
