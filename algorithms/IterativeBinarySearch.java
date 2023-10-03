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
    
}
