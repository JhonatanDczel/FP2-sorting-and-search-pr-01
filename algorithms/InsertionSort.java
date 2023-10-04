package algorithms;

import reader.Reader;

public class InsertionSort{
  public static void cui(Reader.Student[] classmates){
    int j;
    Reader.Student pivot;
    for(int i = 1; i < classmates.length; i++){
      j = i - 1;
      pivot = classmates[i];
      while(j >= 0 && classmates[j].getCui() > pivot.getCui()){
	classmates[j + 1] = classmates[j];
	j--;
      }
      classmates[j + 1] = pivot;
    }
  }
  public static void email(Reader.Student[] classmates){
    int j;
    Reader.Student pivot;
    for(int i = 0; i < classmates.length; i++){
      j = i - 1;
      pivot = classmates[i];
      while(j >= 0 && compareString(classmates[j].getEmail(), pivot.getEmail())){
        classmates[j + 1] = classmates[j];
        j--;
      }
      classmates[j + 1] = pivot;
    }
  }
  public static void name(Reader.Student[] classmates){
    int j;
    Reader.Student pivot;
    for(int i = 0; i < classmates.length; i++){
      j = i - 1;
      pivot = classmates[i];
      while(j >= 0 && compareString(classmates[j].getName(), pivot.getName())){
	classmates[j + 1] = classmates[j];
	j--;
      }
      classmates[j + 1] = pivot;
    }
  }
  public static void lastNameF(Reader.Student[] classmates){
    int j;
    Reader.Student pivot;
    for(int i = 0; i < classmates.length; i++){
      j = i - 1;
      pivot = classmates[i];
      while(j >= 0 && compareString(classmates[j].getLastNameF(), pivot.getLastNameF())){
	classmates[j + 1] = classmates[j];
	j--;
      }
      classmates[j + 1] = pivot;
    }
  }
  public static void lastNameM(Reader.Student[] classmates){
    int j;
    Reader.Student pivot;
    for(int i = 0; i < classmates.length; i++){
      j = i - 1;
      pivot = classmates[i];
      while(j >= 0 && compareString(classmates[j].getLastNameM(), pivot.getLastNameM())){
	classmates[j + 1] = classmates[j];
	j--;
      }
      classmates[j + 1] = pivot;
    }
  }

  public static void dateOfBirth(Reader.Student[] classmates){
    int j;
    Reader.Student pivot;
    for(int i = 0; i < classmates.length; i++){
      j = i - 1;
      pivot = classmates[i];
      while(j >= 0 && compareString(classmates[j].getDateOfBirth(), pivot.getDateOfBirth())){
        classmates[j + 1] = classmates[j];
        j--;
      }
      classmates[j + 1] = pivot;
    }
  }

  public static void gender(Reader.Student[] classmates){
    int j;
    Reader.Student pivot;
    for(int i = 0; i < classmates.length; i++){
      j = i - 1;
      pivot = classmates[i];
      while(j >= 0 && classmates[j].getGender() > pivot.getGender()){
        classmates[j + 1] = classmates[j];
        j--;
      }
      classmates[j + 1] = pivot;
    }
  }

  public static void status(Reader.Student[] classmates){
    int j;
    Reader.Student pivot;
    for(int i = 0; i < classmates.length; i++){
      j = i - 1;
      pivot = classmates[i];
      while(j >= 0 && classmates[j].getStatus() > pivot.getStatus()){
        classmates[j + 1] = classmates[j];
	j--;
      }
      classmates[j + 1] = pivot;
    }
  }
  private static boolean compareString(String word1, String word2){
    word1 = word1.toUpperCase();
    word2 = word2.toUpperCase();
    if (word1.compareTo(word2) <= 0) return false;
    return true;
  }
}
