#!/bin/bash

# definimos el archivo que va a leer
dataFile="$1"

# definimos el nombre de la imagen del grafico
outputFile="$2.png"

#Definimos el nombre por defecto en caso de no haber ingresado un nombre en el segundo parametro
if [ "$outputFile" == ".png" ]; then
	outputFile="Grafica.png"
fi

# aqui se ejecuta Gnuplot para generar el gráfico y exportarlo
gnuplot <<-EOF
	    # Cambiamos el output de la terminal a ong
	    set terminal pngcairo enhanced
	    set output "./Grafica/Imagenes/$outputFile"

	    # Se crea la grafica
	    plot "$dataFile" with lines
EOF

echo "El gráfico se ha generado como $outputFile"
