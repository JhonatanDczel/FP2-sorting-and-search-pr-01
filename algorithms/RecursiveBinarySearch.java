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
  
  public static int name (Reader.Student [] s, String x, int l, int r) {
    if (r >= l) {
      int m = l + (r - l) / 2;
      if (s[m].getName().equals(x)) return  m;
      if ( smallerThan(s[m].getName(), x) ) return name(s, x, m + 1, r);
      return name(s, x, l, m - 1);
    }
    return -1;
  }
  
  public static int lastNameF (Reader.Student [] s, String x, int l, int r) {
    if (r >= l) {
      int m = l + (r - l) / 2;
      if (s[m].getLastNameF().equals(x)) return  m;
      if ( smallerThan(s[m].getLastNameF(), x) ) return lastNameF(s, x, m + 1, r);
      return lastNameF(s, x, l, m - 1);
    }
    return -1;
  }
  
  public static int lastNameM (Reader.Student [] s, String x, int l, int r) {
    if (r >= l) {
      int m = l + (r - l) / 2;
      if (s[m].getLastNameM().equals(x)) return  m;
      if ( smallerThan(s[m].getLastNameM(), x) ) return lastNameM(s, x, m + 1, r);
      return lastNameM(s, x, l, m - 1);
    }
    return -1;
  }
  
  public static int dateOfBirth (Reader.Student [] s, String x, int l, int r) {
    if (r >= l) {
      int m = l + (r - l) / 2;
      if (s[m].getDateOfBirth().equals(x)) return  m;
      if ( smallerThan(s[m].getDateOfBirth(), x) ) return dateOfBirth(s, x, m + 1, r);
      return dateOfBirth(s, x, l, m - 1);
    }
    return -1;
  }
  
  public static int gender (Reader.Student [] s, int x, int l, int r) {
    if (r >= l) {
      int m = l + (r - l) / 2;
      if (s[m].getGender() == x) return  m;
      if (s[m].getGender() > x) return gender(s, x, l, m -1);
      return gender(s, x, m + 1, r);
    }
    return -1;
  }
  
  public static int status (Reader.Student [] s, int x, int l, int r) {
    if (r >= l) {
      int m = l + (r - l) / 2;
      if (s[m].getStatus() == x) return  m;
      if (s[m].getStatus() > x) return status(s, x, l, m -1);
      return status(s, x, m + 1, r);
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
