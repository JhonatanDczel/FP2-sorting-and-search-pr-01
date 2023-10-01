import java.io.*;
public class QuickSort {
    public static void main(String[] args) {
        Student s = new Student();
        Student[] array;
        
        try {
            array = s.mkStulist("data.csv");
            impt(array);
            quicksort(array, 0, array.length - 1);
            System.out.println("----------");
            impt(array);
        } catch (FileNotFoundException e){
            System.err.println("El archivo no se encontró: " + e.getMessage());
        } catch (IOException e) {
            System.err.println("Error al leer el archivo: " + e.getMessage());
        } 

    }
    public static void impt (Student [] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i].getCui());
        }
    }
    public static void quicksort(Student array[], int izq, int der) {

  int pivote=array[izq].getCui(); // tomamos primer elemento como pivote
  int i=izq;         // i realiza la búsqueda de izquierda a derecha
  int j=der;         // j realiza la búsqueda de derecha a izquierda
  int aux;
 
  while(i < j){                          // mientras no se crucen las búsquedas                                   
     while(array[i].getCui() <= pivote && i < j) i++; // busca elemento mayor que pivote
     while(array[j].getCui() > pivote) j--;           // busca elemento menor que pivote
     if (i < j) {                        // si no se han cruzado                      
         aux= array[i].getCui();                      // los intercambia
         array[i].setCui(array[j].getCui());
         array[j].setCui(aux);
     }
   }
   
   array[izq].setCui(array[j].getCui());      // se coloca el pivote en su lugar de forma que tendremos                                    
   array[j].setCui(pivote);      // los menores a su izquierda y los mayores a su derecha
   
   if(izq < j-1)
      quicksort(array,izq,j-1);          // ordenamos subarray izquierdo
   if(j+1 < der)
      quicksort(array,j+1,der);          // ordenamos subarray derecho
   
}
}
