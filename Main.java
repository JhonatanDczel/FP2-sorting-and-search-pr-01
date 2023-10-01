import java.io.*;
import java.io.*;
public class Main{
    public static void main(String[] args){
        StudentFinal archivo = new StudentFinal();
        try {
          archivo.readFile("data.csv");
        } catch (FileNotFoundException e){
            System.err.println("El archivo no se encontró: " + e.getMessage());
        } catch (IOException e) {
            System.err.println("Error al leer el archivo: " + e.getMessage());
        } 
    }
}
