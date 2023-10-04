import java.util.Scanner;
import reader.Reader;
import algorithms.*;

public class Comparation{
  private static Reader rd = new Reader();
  private static Reader.Student[] students = rd.getData();
  private static Scanner sc = new Scanner(System.in);
  private static int[] casosDePrueba = new int[100];

  public static void main(String[] args){
    generarCasosDePrueba();
    menu(students);
  }
  public static void generarCasosDePrueba(){
    int datos = students.length;
    for(int i = 0; i < 100; i++){
      casosDePrueba[i] = (int) ((i / 100.0) * datos);
    }
  }
  public static void menu(Reader.Student[] s){
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

      switch (opcion) {
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
          System.exit(0);
          break;
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
  }
  public static void printStudents(Reader.Student [] s) {
    for (int i = 0; i < s.length; i++){
      System.out.println(s[i]);
    }

  }

}
