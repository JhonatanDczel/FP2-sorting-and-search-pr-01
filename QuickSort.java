import java.io.*;
public class QuickSort {
    public static void cui (Reader.Student[] s, int left, int right) {
        int piv = s[left].getCui();
        int i = left;
        int j = right;
        int aux;
        while (i < j) {
            while (s[i].getCui() <= piv && i < j) i++;
            while (s[j].getCui() > piv) j--;
            if (i < j) {
                aux = s[i].getCui();
                s[i].setCui(s[j].getCui()); 
                s[j].setCui(aux);
            }
        }
        s[left].setCui(s[j].getCui());
        s[j].setCui(piv);
        if (left < j - 1)  cui(s, left, j -1);
        if (j + 1< right) cui(s, j + 1, right);
    }
    public static void email (Reader.Student[] s, int left, int right) {
        String piv = s[left].getEmail();
        int i = left;
        int j = right;
        String aux;
        while (i < j) {
            while (smallerThan(s[i].getEmail(), piv) && i < j) i++;
            while (!smallerThan(s[j].getEmail(), piv)) j--;
            if (i < j) {
                aux = s[i].getEmail();
                s[i].setEmail(s[j].getEmail()); 
                s[j].setEmail(aux);
            }
        }
        aux = s[left].getEmail();
        s[left].setEmail(s[j].getEmail());
        s[j].setEmail(aux);
        if (left < j - 1)  email(s, left, j -1);
        if (j + 1< right) email(s, j + 1, right);
    }
    public static void name (Reader.Student[] s, int left, int right) {
        String piv = s[left].getName();
        int i = left;
        int j = right;
        String aux;
        while (i < j) {
            while (smallerThan(s[i].getName(), piv) && i < j) i++;
            while (!smallerThan(s[j].getName(), piv)) j--;
            if (i < j) {
                aux = s[i].getName();
                s[i].setName(s[j].getName()); 
                s[j].setName(aux);
            }
        }
        aux = s[left].getName();
        s[left].setName(s[j].getName());
        s[j].setName(aux);
        if (left < j - 1)  name (s, left, j -1);
        if (j + 1< right) name(s, j + 1, right);
    }
    public static void lastNameF (Reader.Student[] s, int left, int right) {
        String piv = s[left].getLastNameF();
        int i = left;
        int j = right;
        String aux;
        while (i < j) {
            while (smallerThan(s[i].getLastNameF(), piv) && i < j) i++;
            while (!smallerThan(s[j].getLastNameF(), piv)) j--;
            if (i < j) {
                aux = s[i].getLastNameF();
                s[i].setLastNameF(s[j].getLastNameF()); 
                s[j].setLastNameF(aux);
            }
        }
        aux = s[left].getLastNameF();
        s[left].setLastNameF(s[j].getLastNameF());
        s[j].setLastNameF(aux);
        if (left < j - 1)  lastNameF (s, left, j -1);
        if (j + 1< right) lastNameF(s, j + 1, right);
    }
    public static void lastNameM (Reader.Student[] s, int left, int right) {
        String piv = s[left].getLastNameM();
        int i = left;
        int j = right;
        String aux;
        while (i < j) {
            while (smallerThan(s[i].getLastNameM(), piv) && i < j) i++;
            while (!smallerThan(s[j].getLastNameM(), piv)) j--;
            if (i < j) {
                aux = s[i].getLastNameM();
                s[i].setLastNameM(s[j].getLastNameM()); 
                s[j].setLastNameM(aux);
            }
        }
        aux = s[left].getLastNameM();
        s[left].setLastNameM(s[j].getLastNameM());
        s[j].setLastNameM(aux);
        if (left < j - 1)  lastNameM (s, left, j -1);
        if (j + 1< right) lastNameM(s, j + 1, right);
    }
    public static void dateOfBirth (Reader.Student[] s, int left, int right) {
        String piv = s[left].getDateOfBirth();
        int i = left;
        int j = right;
        String aux;
        while (i < j) {
            while (smallerThan(s[i].getDateOfBirth(), piv) && i < j) i++;
            while (!smallerThan(s[j].getDateOfBirth(), piv)) j--;
            if (i < j) {
                aux = s[i].getDateOfBirth();
                s[i].setDateOfBirth(s[j].getDateOfBirth()); 
                s[j].setDateOfBirth(aux);
            }
        }
        aux = s[left].getDateOfBirth();
        s[left].setDateOfBirth(s[j].getDateOfBirth());
        s[j].setDateOfBirth(aux);
        if (left < j - 1)  dateOfBirth (s, left, j -1);
        if (j + 1< right) dateOfBirth(s, j + 1, right);
    }
    public static boolean smallerThan(String w1, String w2) {
        w1.toUpperCase();
        w2.toUpperCase();
        if (w1.compareTo(w2) <= 0) return true;
        return false;

    }
}
