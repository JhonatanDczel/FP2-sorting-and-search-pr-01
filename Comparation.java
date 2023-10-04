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
    menu();
  }

  public static void getTestCases(){
    int datos = students.length;
    for(int i = 0; i < 100; i++){
      testCases[i] = (int) ((i / 100.0) * datos);
      if(testCases[i] == 0)
        testCases[i] = 2;
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
      int option = sc.nextInt();
      runAlgorithm(option);
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
