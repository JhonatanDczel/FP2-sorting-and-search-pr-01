import algorithms.*;
import reader.*;
public class Main{
    public static void main(String[] args){
        Reader lector = new Reader();
        Reader.Student[] students = lector.getData();
        Insertion.insertionEmail(students);
        impr(students);
        int idx = IterativeBinarySearch.email(students,"jgarciafernandez@unsa.edu.pe");
        System.out.println(idx);
        System.out.println(students[idx]);
/*
	    long first, end;
	
    	first = System.nanoTime();
        QuickSort.Cui(students, 0, students.length - 1);
    	end = System.nanoTime();
        impr(students);
	    System.out.println("\nTiempo: " + (end - first));
	
	    first = System.nanoTime();
	    Insertion.insertionStatus(students);
	    end = System.nanoTime();
	    impr(students);
	    System.out.println("\nTiempo: " + (end - first));
        */
    }
    public static void impr(Reader.Student[] s) {
        System.out.println("-----------------");
        for (int i = 0; i < s.length; i++){
            System.out.println(s[i].getEmail());
        }
    }
}
