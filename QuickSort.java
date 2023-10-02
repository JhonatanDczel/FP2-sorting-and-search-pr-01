import java.io.*;
public class QuickSort {
    public static void Cui (Reader.Student[] s, int left, int right) {
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
        if (left < j - 1)  Cui(s, left, j -1);
        if (j + 1< right) Cui(s, j + 1, right);
        
    }

}
