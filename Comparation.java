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
    menu();
  }
  public static void generarCasosDePrueba(){
    int datos = students.length;
    for(int i = 0; i < 100; i++){
      casosDePrueba[i] = (int) ((i / 100.0) * datos);
    }
  }
  public static void menu(){
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
  }
}
