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
      else if (s[m].getCui() < x){ l = m + 1;}
      else{ r = m - 1;}
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
  
  public static int name (Reader.Student [] s, String x) {
    int l = 0, r = s.length - 1;
    while (l <= r) {
      int m = l + (r - l) / 2; 
      if (s[m].getName().equals(x)) return m;
      if (smallerThan(s[m].getName(), x)) l = m + 1;
      else r = m - 1;
    }
    return -1;
  }

  public static int lastNameF (Reader.Student [] s, String x) {
    int l = 0, r = s.length - 1;
    while (l <= r) {
      int m = l + (r - l) / 2; 
      if (s[m].getLastNameF().equals(x)) return m;
      if (smallerThan(s[m].getLastNameF(), x)) l = m + 1;
      else r = m - 1;
    }
    return -1;
  }
  public static int lastNameM (Reader.Student [] s, String x) {
    int l = 0, r = s.length - 1;
    while (l <= r) {
      int m = l + (r - l) / 2; 
      if (s[m].getLastNameM().equals(x)) return m;
      if (smallerThan(s[m].getLastNameM(), x)) l = m + 1;
      else r = m - 1;
    }
    return -1;
  }

  public static int dateOfBirth (Reader.Student [] s, String x) {
    int l = 0, r = s.length - 1;
    while (l <= r) {
      int m = l + (r - l) / 2; 
      if (s[m].getDateOfBirth().equals(x)) return m;
      if (smallerThan(s[m].getDateOfBirth(), x)) l = m + 1;
      else r = m - 1;
    }
    return -1;
  }
  public static int status (Reader.Student [] s, int x) {
    int l, r;
    l = 0;
    r = s.length - 1;
    while (l <= r) {
      int m = l + ( r - l ) / 2;
      if (s[m].getStatus() == x) return m;
      if (s[m].getStatus() < x) l = m + 1;
      else r = m - 1;
    }
    return -1;
  }

  public static int gender (Reader.Student [] s, int x) {
    int l, r;
    l = 0;
    r = s.length - 1;
    while (l <= r) {
      int m = l + ( r - l ) / 2;
      if (s[m].getGender() == x) return m;
      if (s[m].getGender() < x) l = m + 1;
      else r = m - 1;
    }
    return -1;
  }

  public static boolean smallerThan(String w1, String w2) {
      w1 = w1.toUpperCase();
      w2 = w2.toUpperCase();
      if (w1.compareTo(w2) <= 0) return true;
      return false;

  }
    
}
