package algorithms;

import reader.Reader;

public class RecursiveBinarySearch {
  public static int cui (Reader.Student [] s, int x, int l, int r) {
    if (r >= l) {
      int m = l + (r - l) / 2;
      if (s[m].getCui() == x) return  m;
      if (s[m].getCui() > x) return cui(s, x, l, m -1);
      return cui(s, x, m + 1, r);
    }
    return -1;
  }
  public static int email (Reader.Student [] s, String x, int l, int r) {
    if (r >= l) {
      int m = l + (r - l) / 2;
      if (s[m].getEmail().equals(x)) return  m;
      if ( smallerThan(s[m].getEmail(), x) ) return email(s, x, m + 1, r);
      return email(s, x, l, m - 1);
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
