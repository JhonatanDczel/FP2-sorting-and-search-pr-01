import java.io.*;
import java.io.*;
public class main {
    public static void main(String[] args) {
        Student archivo = new Student();
        try {
          archivo.leerArchivos("data.csv");
        } catch (FileNotFoundException e){
            System.err.println("El archivo no se encontró: " + e.getMessage());
        } catch (IOException e) {
            System.err.println("Error al leer el archivo: " + e.getMessage());
        } 
    }
}


