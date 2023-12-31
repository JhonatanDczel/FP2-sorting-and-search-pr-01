package algorithms;

import reader.Reader;
import java.io.*;
public class QuickSort {



  // Importante: Se debe de usar Quicksort con el parametro rigth de este manera:
  // rigth = array.length - 1 => Se debe poner la longitud del array menos 1
  

    public static void cui (Reader.Student[] s, int left, int right) {
        int piv = s[left].getCui();
        int i = left;
        int j = right;
        Reader.Student aux;
        while (i < j) {
            while (s[i].getCui() <= piv && i < j) i++;
            while (s[j].getCui() > piv) j--;
            if (i < j) {
                aux = s[i];
                s[i] = s[j]; 
                s[j] = aux;
            }
        }
        aux = s[left];
        s[left] = s[j];
        s[j] = (aux);
        if (left < j - 1)  cui(s, left, j -1);
        if (j + 1< right) cui(s, j + 1, right);
    }
    public static void email (Reader.Student[] s, int left, int right) {
        String piv = s[left].getEmail();
        int i = left;
        int j = right;
        Reader.Student aux;
        while (i < j) {
            while (smallerThan(s[i].getEmail(), piv) && i < j) i++;
            while (!smallerThan(s[j].getEmail(), piv)) j--;
            if (i < j) {
                aux = s[i];
                s[i] = s[j]; 
                s[j] = aux;
            }
        }
        aux = s[left];
        s[left] = s[j];
        s[j] = (aux);
        if (left < j - 1)  email(s, left, j -1);
        if (j + 1< right) email(s, j + 1, right);
    }
    public static void name (Reader.Student[] s, int left, int right) {
        String piv = s[left].getName();
        int i = left;
        int j = right;
        Reader.Student aux;
        while (i < j) {
            while (smallerThan(s[i].getName(), piv) && i < j) i++;
            while (!smallerThan(s[j].getName(), piv)) j--;
            if (i < j) {
                aux = s[i];
                s[i] = s[j]; 
                s[j] = aux;
            }
        }
        aux = s[left];
        s[left] = s[j];
        s[j] = (aux);
        if (left < j - 1)  name (s, left, j -1);
        if (j + 1< right) name(s, j + 1, right);
    }
    public static void lastNameF (Reader.Student[] s, int left, int right) {
        String piv = s[left].getLastNameF();
        int i = left;
        int j = right;
        Reader.Student aux;
        while (i < j) {
            while (smallerThan(s[i].getLastNameF(), piv) && i < j) i++;
            while (!smallerThan(s[j].getLastNameF(), piv)) j--;
            if (i < j) {
                aux = s[i];
                s[i] = s[j]; 
                s[j] = aux;
            }
        }
        aux = s[left];
        s[left] = s[j];
        s[j] = (aux);
        if (left < j - 1)  lastNameF (s, left, j -1);
        if (j + 1< right) lastNameF(s, j + 1, right);
    }
    public static void lastNameM (Reader.Student[] s, int left, int right) {
        String piv = s[left].getLastNameM();
        int i = left;
        int j = right;
        Reader.Student aux;
        while (i < j) {
            while (smallerThan(s[i].getLastNameM(), piv) && i < j) i++;
            while (!smallerThan(s[j].getLastNameM(), piv)) j--;
            if (i < j) {
                aux = s[i];
                s[i] = s[j]; 
                s[j] = aux;
            }
        }
        aux = s[left];
        s[left] = s[j];
        s[j] = (aux);
        if (left < j - 1)  lastNameM (s, left, j -1);
        if (j + 1< right) lastNameM(s, j + 1, right);
    }
    public static void dateOfBirth (Reader.Student[] s, int left, int right) {
        String piv = s[left].getDateOfBirth();
        int i = left;
        int j = right;
        Reader.Student aux;
        while (i < j) {
            while (smallerThan(s[i].getDateOfBirth(), piv) && i < j) i++;
            while (!smallerThan(s[j].getDateOfBirth(), piv)) j--;
            if (i < j) {
                aux = s[i];
                s[i] = s[j]; 
                s[j] = aux;
            }
        }
        aux = s[left];
        s[left] = s[j];
        s[j] = (aux);
        if (left < j - 1)  dateOfBirth (s, left, j -1);
        if (j + 1< right) dateOfBirth(s, j + 1, right);
    }
    public static void gender (Reader.Student[] s, int left, int right) {
        int piv = s[left].getGender();
        int i = left;
        int j = right;
        Reader.Student aux;
        while (i < j) {
            while (s[i].getGender() <= piv && i < j) i++;
            while (s[j].getGender() > piv) j--;
            if (i < j) {
                aux = s[i];
                s[i] = s[j]; 
                s[j] = aux;
            }
        }
        aux = s[left];
        s[left] = s[j];
        s[j] = (aux);
        if (left < j - 1)  gender(s, left, j -1);
        if (j + 1< right) gender(s, j + 1, right);
    }
    public static void status (Reader.Student[] s, int left, int right) {
        int piv = s[left].getStatus();
        int i = left;
        int j = right;
        Reader.Student aux;
        while (i < j) {
            while (s[i].getStatus() <= piv && i < j) i++;
            while (s[j].getStatus() > piv) j--;
            if (i < j) {
                aux = s[i];
                s[i] = s[j]; 
                s[j] = aux;
            }
        }
        aux = s[left];
        s[left] = s[j];
        s[j] = (aux);
        if (left < j - 1)  status(s, left, j -1);
        if (j + 1< right) status(s, j + 1, right);
    }
    public static boolean smallerThan(String w1, String w2) {
        w1.toUpperCase();
        w2.toUpperCase();
        if (w1.compareTo(w2) <= 0) return true;
        return false;

    }
}
