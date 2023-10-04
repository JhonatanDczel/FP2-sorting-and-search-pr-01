import java.util.*;
import java.io.*;
import java.lang.*;
import reader.Reader;
import algorithms.*;

public class Comparation{
  private static Scanner sc = new Scanner(System.in);
  private static Reader rd = new Reader();
  private static Reader.Student[] students = rd.getData();
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
    for(int i = 0; i < 100; i++){
      testCases[i] = (int) ((i / 100.0) * datos);
      if(testCases[i] == 0)
        testCases[i] = 1;
    }
  }

  public static void runAlgorithm(int option){
    switch (option) {
      case 1:
        Test.runAlgorithm();
        break;
      case 2:
        break;
      case 3:
        break;
      case 4:
        break;
      case 5:
        break;
      case 6:
        System.out.println("Saliendo del programa...");
        System.exit(0);
        break;
      default:
        System.out.println("Opción no válida. Por favor, seleccione una opción válida.");
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
          //System.exit(0);
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
//========================case 7
        case 7:
          Test.runAlgorithm();
          break;
        default:
          System.out.println("Opción no válida. Por favor, seleccione una opción válida.");
      }
    }
  }


  public class Test{
    static private Reader.Student[] sujetosPrueba = Arrays.copyOf(students, students.length);
    static public void runAlgorithm(){
      quicksort();
    }
    static public void quicksort(){
      String data = "";
      for(int i = 0; i < 100; i++){
        Reader.Student[] muestra = Arrays.copyOf(sujetosPrueba, testCases[i]);
        long startTime = System.nanoTime();
        QuickSort.cui(muestra, 0, muestra.length - 1);
        long endTime = System.nanoTime();
        String time = Long.toString(endTime - startTime);
        data = data + "\n" + String.valueOf(testCases[i]) + "\t" + time;
      }
      try (BufferedWriter bw = new BufferedWriter(new FileWriter("./graphics/input/data.dat"))) {
        bw.write(data);
      } catch (IOException e) {
        e.printStackTrace();
      }
      try {
          String comando = "./graphics/graficar.sh \"Grafica QuickSort CUI\" ./graphics/input/data.dat";
          ProcessBuilder builder = new ProcessBuilder();
          builder.command("sh", "-c", comando);
          Process proceso = builder.start();
      } catch (IOException e) {
          e.printStackTrace();
          System.out.println("fallo");
      }
    }

  }
}
