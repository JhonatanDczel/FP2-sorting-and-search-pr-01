import java.util.*;
import java.io.*;
import java.lang.*;
import reader.Reader;
import algorithms.*;

public class Comparation{
  private static Scanner sc = new Scanner(System.in);
  private static Reader rd = new Reader();
  private static Reader.Student[] students = rd.getData();
  private static Reader.Student[] studentsG = rd.getData();
  private static int[] testCases = new int[100];

  public static void main(String[] args){
    getTestCases();
    menu(students);
  }

  public static void printStudents(Reader.Student [] s) {
    for (int i = 0; i < s.length; i++){
      System.out.println(s[i]);
    }
  }

  public static void getTestCases(){
    int datos = students.length;
    for(int i = 1; i < 101; i++){
      testCases[i - 1] = (int) ((i / 100.0) * datos);
      if(testCases[i - 1] == 0)
        testCases[i] = 1;
    }
  }

  public static void menu(Reader.Student[] s){
    int ri;
    String rs;
    int o1 = 0;
    int o2 = 0;
    while (true) {
      System.out.println("\n=======Menu Principal========");
      System.out.println("1. Ordenamiento por Inserción");
      System.out.println("2. Ordenamiento por Quicksort");
      System.out.println("3. Búsqueda Binaria Recursiva");
      System.out.println("4. Búsqueda Binaria Iterativa");
      System.out.println("5. Comparar Rendimientos");
      System.out.println("6. Salir");
      System.out.print("Seleccione una opción: ");
      int opcion = sc.nextInt();
      o1 = opcion;

      switch (opcion) {
//========================case 1
        case 1:
          System.out.println("\n=======Ordenar por:========");
          System.out.println("1. cui");
          System.out.println("2. email");
          System.out.println("3. name");
          System.out.println("4. apellido paterno");
          System.out.println("5. apellido materno");
          System.out.println("6. F. nacimiento");
          System.out.println("7. Genero");
          System.out.println("8. Status");
          opcion = sc.nextInt();
          o2 = opcion;
          switch (opcion) {
            case 1:
              InsertionSort.cui(s);
              printStudents(s);
              Test.runAlgorithm(o1, o2);
              break;
            case 2:
              InsertionSort.email(s);
              printStudents(s);
              break;
            case 3:
              InsertionSort.name(s);
              printStudents(s);
              break;
            case 4:
              InsertionSort.lastNameF(s);
              printStudents(s);
              break;
            case 5:
              InsertionSort.lastNameM(s);
              printStudents(s);
              break;
            case 6:
              InsertionSort.dateOfBirth(s);
              printStudents(s);
              break;
            case 7:
              InsertionSort.gender(s);
              printStudents(s);
              break;
            case 8:
              InsertionSort.status(s);
              printStudents(s);
              break;
            default:
              System.out.println("Opción no válida. Por favor, seleccione una opción válida.");
          }
          System.exit(0);
          break;
//========================case 2
        case 2:
          System.out.println("\n=======Ordenar por:========");
          System.out.println("1. cui");
          System.out.println("2. email");
          System.out.println("3. name");
          System.out.println("4. apellido paterno");
          System.out.println("5. apellido materno");
          System.out.println("6. F. nacimiento");
          System.out.println("7. Genero");
          System.out.println("8. Status");
          opcion = sc.nextInt();
          o2 = opcion;
          switch (opcion) {
            case 1:
              QuickSort.cui(s, 0, s.length - 1);
              printStudents(s);
              break;
            case 2:
              QuickSort.email(s, 0, s.length - 1);
              printStudents(s);
              break;
            case 3:
              QuickSort.name(s, 0, s.length - 1);
              printStudents(s);
              break;
            case 4:
              QuickSort.lastNameF(s, 0, s.length - 1);
              printStudents(s);
              break;
            case 5:
              QuickSort.lastNameM(s, 0, s.length - 1);
              printStudents(s);
              break;
            case 6:
              QuickSort.dateOfBirth(s, 0, s.length - 1);
              printStudents(s);
              break;
            case 7:
              QuickSort.gender(s, 0, s.length - 1);
              printStudents(s);
              break;
            case 8:
              QuickSort.status(s, 0, s.length - 1);
              printStudents(s);
              break;
            default:
              System.out.println("Opción no válida. Por favor, seleccione una opción válida.");
          }
          System.exit(0);
          break;
//========================case 3
        case 3:
          System.out.println("\n=======Buscar por========");
          System.out.println("1. cui");
          System.out.println("2. email");
          System.out.println("3. name");
          System.out.println("4. apellido paterno");
          System.out.println("5. apellido materno");
          System.out.println("6. F. nacimiento");
          opcion = sc.nextInt();
          o2 = opcion;
          switch (opcion) {
            case 1:
              QuickSort.cui(s, 0, s.length - 1);
              System.out.println("Ingrese el valor a buscar");
              ri = sc.nextInt();
              ri = RecursiveBinarySearch.cui(s, ri, 0, s.length - 1);
              if (ri != -1) System.out.println(s[ri]);
              else System.out.println("No encontrado");
              break;
            case 2:
              QuickSort.email(s, 0, s.length - 1);
              System.out.println("Ingrese el valor a buscar");
              sc.nextLine();
              rs = sc.nextLine();
              ri = RecursiveBinarySearch.email(s, rs, 0, s.length - 1);
              if (ri != -1 ) System.out.println(s[ri]);
              else System.out.println("No encontrado");

              break;
            case 3:
              QuickSort.name(s, 0, s.length - 1);
              System.out.println("Ingrese el valor a buscar");
              sc.nextLine();
              rs = sc.nextLine();
              ri = RecursiveBinarySearch.name(s, rs, 0, s.length - 1);
              if (ri != -1 ) System.out.println(s[ri]);
              else System.out.println("No encontrado");
              break;
            case 4:
              QuickSort.lastNameF(s, 0, s.length - 1);
              System.out.println("Ingrese el valor a buscar");
              sc.nextLine();
              rs = sc.nextLine();
              ri = RecursiveBinarySearch.lastNameF(s, rs, 0, s.length - 1);
              if (ri != -1 ) System.out.println(s[ri]);
              else System.out.println("No encontrado");

              break;
            case 5:
              QuickSort.lastNameM(s, 0, s.length - 1);
              System.out.println("Ingrese el valor a buscar");
              sc.nextLine();
              rs = sc.nextLine();
              ri = RecursiveBinarySearch.lastNameM(s, rs, 0, s.length - 1);
              if (ri != -1 ) System.out.println(s[ri]);
              else System.out.println("No encontrado");

              break;
            case 6:
              QuickSort.dateOfBirth(s, 0, s.length - 1);
              System.out.println("Ingrese el valor a buscar");
              sc.nextLine();
              rs = sc.nextLine();
              ri = RecursiveBinarySearch.dateOfBirth(s, rs, 0, s.length - 1);
              if (ri != -1 ) System.out.println(s[ri]);
              else System.out.println("No encontrado");

              break;
            default:
              System.out.println("Opción no válida. Por favor, seleccione una opción válida.");
          }
          System.exit(0);
          break;
//========================case 4
        case 4:
          System.out.println("\n=======Buscar por========");
          System.out.println("1. cui");
          System.out.println("2. email");
          System.out.println("3. name");
          System.out.println("4. apellido paterno");
          System.out.println("5. apellido materno");
          System.out.println("6. F. nacimiento");
          opcion = sc.nextInt();
          o2 = opcion;
          switch (opcion) {
            case 1:
              QuickSort.cui(s, 0, s.length - 1);
              System.out.println("Ingrese el valor a buscar");
              ri = sc.nextInt();
              ri = IterativeBinarySearch.cui(s, ri);
              if (ri != -1) System.out.println(s[ri]);
              else System.out.println("No encontrado");
              break;
            case 2:
              QuickSort.email(s, 0, s.length - 1);
              System.out.println("Ingrese el valor a buscar");
              sc.nextLine();
              rs = sc.nextLine();
              ri = IterativeBinarySearch.email(s, rs);
              if (ri != -1 ) System.out.println(s[ri]);
              else System.out.println("No encontrado");

              break;
            case 3:
              QuickSort.name(s, 0, s.length - 1);
              System.out.println("Ingrese el valor a buscar");
              sc.nextLine();
              rs = sc.nextLine();
              ri = IterativeBinarySearch.name(s, rs);
              if (ri != -1 ) System.out.println(s[ri]);
              else System.out.println("No encontrado");
              break;
            case 4:
              QuickSort.lastNameF(s, 0, s.length - 1);
              System.out.println("Ingrese el valor a buscar");
              sc.nextLine();
              rs = sc.nextLine();
              ri = IterativeBinarySearch.lastNameF(s, rs);
              if (ri != -1 ) System.out.println(s[ri]);
              else System.out.println("No encontrado");

              break;
            case 5:
              QuickSort.lastNameM(s, 0, s.length - 1);
              System.out.println("Ingrese el valor a buscar");
              sc.nextLine();
              rs = sc.nextLine();
              ri = IterativeBinarySearch.lastNameM(s, rs);
              if (ri != -1 ) System.out.println(s[ri]);
              else System.out.println("No encontrado");

              break;
            case 6:
              QuickSort.dateOfBirth(s, 0, s.length - 1);
              System.out.println("Ingrese el valor a buscar");
              sc.nextLine();
              rs = sc.nextLine();
              ri = IterativeBinarySearch.dateOfBirth(s, rs);
              if (ri != -1 ) System.out.println(s[ri]);
              else System.out.println("No encontrado");

              break;
            default:
              System.out.println("Opción no válida. Por favor, seleccione una opción válida.");
          }
          System.exit(0);
          break;
//========================case 5
        case 5:
          break;
//========================case 6
        case 6:
          System.out.println("Saliendo del programa...");
          System.exit(0);
          break;
        default:
          System.out.println("Opción no válida. Por favor, seleccione una opción válida.");
      }
    }
  }


  public class Test{
    static public String name;
    static private Reader.Student[] sujetosPrueba = Arrays.copyOf(studentsG, studentsG.length);
    static public void selectUser(int o1, int o2, Reader.Student[] muestra){
      int option = o1 * 10 + o2;
      switch (option) {
        case 11:
          QuickSort.cui(muestra, 0, muestra.length - 1);
          name = "CUI";
          break;
        case 12:
          QuickSort.email(muestra, 0, muestra.length - 1);
          name = "Email";
          break;
        case 13:
          QuickSort.name(muestra, 0, muestra.length - 1);
          name = "Nombre";
          break;
        case 14:
          QuickSort.lastNameF(muestra, 0, muestra.length - 1);
          name = "Apellido Paterno";
          break;
        case 15:
          QuickSort.lastNameM(muestra, 0, muestra.length - 1);
          name = "Apellido Materno";
          break;
        case 16:
          QuickSort.dateOfBirth(muestra, 0, muestra.length - 1);
          name = "Fecha de nacimiento";
          break;
        case 17:
          QuickSort.gender(muestra, 0, muestra.length - 1);
          name = "Genero";
          break;
        case 18:
          QuickSort.status(muestra, 0, muestra.length - 1);
          name = "Estado";
          break;
        case 21:
          InsertionSort.cui(muestra);
          name = "CUI";
          break;
        case 22:
          InsertionSort.email(muestra);
          name = "Email";
          break;
        case 23:
          InsertionSort.name(muestra);
          name = "Nombre";
          break;
        case 24:
          InsertionSort.lastNameF(muestra);
          name = "Apellido Paterno";
          break;
        case 25:
          InsertionSort.lastNameM(muestra);
          name = "Apellido Materno";
          break;
        case 26:
          InsertionSort.dateOfBirth(muestra);
          name = "Fecha de nacimiento";
          break;
        case 27:
          InsertionSort.gender(muestra);
          name = "Genero";
          break;
        case 28:
          InsertionSort.status(muestra);
          name = "Estado";
          break;
        default:
          break;
      }
    }
    static public void runAlgorithm(int o1, int o2){
      String data = "";
      for(int i = 0; i < 100; i++){
        Reader.Student[] muestra = Arrays.copyOf(sujetosPrueba, testCases[i]);
        long startTime = System.nanoTime();
        selectUser(o1, o2, muestra);
        long endTime = System.nanoTime();
        String time = Long.toString(endTime - startTime);
        data = data + "\n" + String.valueOf(testCases[i]) + "\t" + time;
      }
      try (BufferedWriter bw = new BufferedWriter(new FileWriter("./graphics/input/data.dat"))) {
        bw.write(data);
      } catch (IOException e) {
        e.printStackTrace();
      }
      String comando = "./graphics/graficar.sh \"" + name + "\" ./graphics/input/data.dat";
      System.out.println("Grafica generada satisfactoriamente, corre el siguiente comando:\n" + comando);
    }
  }
}
