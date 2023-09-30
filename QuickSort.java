import java.util.*;
import java.io.*;
public class QuickSort {
    public static void main(String[] args) {
        impt(mkStulist("data.csv"));
    }
    public static void impt (Student [] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i].cui);
        }
    }
}
