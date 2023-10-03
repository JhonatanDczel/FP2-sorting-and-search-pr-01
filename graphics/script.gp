set key left box textcolor "white" font "helvetica,12"
set object 1 rectangle from screen 0,0 to screen 1,1 behind noclip fc rgb "#32363d" fillstyle solid 1.0
set border lc rgb "white" lw 2
set xlabel "Data count" font "helvetica,12" textcolor "white"
set ylabel "Time (ns)" font "helvetica,12" textcolor "white"
set tics font "helvetica,11" textcolor rgb "#faf95d"
plot "exampleData.dat" with lp lw 3 lc rgb "#62aeef" pt 6 title "Sorting", "exampleData2.dat" w lp lw 3 lc rgb "#ddf056" pt 6 t "Sorting 2"
