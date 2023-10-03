package algorithms;

import reader.Reader;
import java.io.*;
public class IterativeBinarySearch {
  public static int cui (Reader.Student [] s, int x) {
    int l, r;
    l = 0;
    r = s.length - 1;
    while (l <= r) {
      int m = l + ( r - l ) / 2;
      if (s[m].getCui() == x) return m;
      if (s[m].getCui() < x) l = m + 1;
      else r = m - 1;
    }
    return -1;
  }
  public static int email (Reader.Student [] s, String x) {
    int l = 0, r = s.length - 1;
    while (l <= r) {
      int m = l + (r - l) / 2; 
      if (s[m].getEmail().equals(x)) return m;
      if (smallerThan(s[m].getEmail(), x)) l = m + 1;
      else r = m - 1;
    }
    return -1;
  }
  
  public static boolean smallerThan(String w1, String w2) {
      w1.toUpperCase();
      w2.toUpperCase();
      if (w1.compareTo(w2) <= 0) return true;
      return false;

    }
    
}
