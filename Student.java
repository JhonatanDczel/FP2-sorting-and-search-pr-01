import java.io.*;
public class Student {
    private BufferedReader lector;
    private String linea;
    private String partes [] = null;

    public void leerArchivos(String nArchivo) throws FileNotFoundException, IOException{
        FileReader arc = new FileReader(nArchivo);
        lector = new BufferedReader(arc);
        while (( linea = lector.readLine() ) != null) {
            partes = linea.split(",");
            imprimirLinea();
            System.out.println();
        }
    }
    private void imprimirLinea(){
        for (int i = 0; i < partes.length; i++) System.out.print(partes[i] + " | ");
    }

}
