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
        char piv = s[left].getEmail().charAt(0);
        int i = left;
        int j = right;
        String aux;
        while (i < j) {
            while (s[i].getEmail().charAt(0) <= piv && i < j) i++;
            while (s[j].getEmail().charAt(0) > piv) j--;
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
        char piv = s[left].getName().charAt(0);
        int i = left;
        int j = right;
        String aux;
        while (i < j) {
            while (s[i].getName().charAt(0) <= piv && i < j) i++;
            while (s[j].getName().charAt(0) > piv) j--;
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

}
