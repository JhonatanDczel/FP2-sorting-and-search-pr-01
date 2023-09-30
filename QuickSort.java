import java.util.*;
import java.io.*;
public class QuickSort {
    public static void main(String[] args) {
        Student s = new Student();
        try {
            impt(s.mkStulist("data.csv"));
        } catch (FileNotFoundException e){
            System.err.println("El archivo no se encontró: " + e.getMessage());
        } catch (IOException e) {
            System.err.println("Error al leer el archivo: " + e.getMessage());
        } 

    }
    public static void impt (Student [] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i].getName());
            System.out.println(array[i].getCui());
        }
    }
}
