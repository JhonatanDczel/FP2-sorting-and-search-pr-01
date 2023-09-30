import java.util.*;
import java.io.*;
public class Student {
    // Atributos de objeto student
    private int cui;
    private String email;
    private String name;
    private String patSurname;
    private String matSurname;
    private String birthDate;
    private String gender;
    private String status;
    // Atributos de lectura de archivos
    private BufferedReader reader;
    private String line;
    private String parts [] = null;

    public void leerArchivos(String nArchivo) throws FileNotFoundException, IOException{
        FileReader arc = new FileReader(nArchivo);
        reader = new BufferedReader(arc);
        while (( line = reader.readLine() ) != null) {
            parts = line.split(",");
            imprimirLinea();
            System.out.println();
        }
    }
    private void imprimirLinea(){
        for (int i = 0; i < parts.length; i++) System.out.print(parts[i] + " | ");
    }

    public Student [] mkStulist (String filename) throws FileNotFoundException, IOException {
        FileReader file = new FileReader(filename);
        reader = new BufferedReader(file);
        List <Student> sList = new ArrayList <Student>();
        line = reader.readLine();
        while ((line = reader.readLine()) != null) {
            parts = line.split(",");
            if (parts.length < 4) break;
            Student s = new Student();
            sList.add(s);
            s.cui = Integer.valueOf( parts[0] );
            s.email = parts[1];
            s.name = parts[2];
            s.patSurname = parts[3];
            s.matSurname = parts[4];
            s.birthDate = parts[5];
            s.gender = parts[6];
            s.status = parts[7];
        }
        Student [] array = new Student[sList.size()];
        array = sList.toArray(array);
        return array;
    }

    public String getName () {
        return name;
    }
    public int  getCui () {
        return Integer.valueOf(cui);
    }
}
/*
   Necesitamos un método que nos cree un nuevo objeto student a partir del data.csv,
   Por medio del array que se obtiene, le declaramos en ese mismo método todos sus atributos

   Necesitamos que los algoritmos reciban un array de objetos, así accedemos a sus atributos
   De esa manera los ordenamos


   PENDIENTES ---------------------------------
   Realizar metodos de modificación y acceso al resto de atributos
*/
