package algorithms;

import reader.Reader;

public class Insertion{
  public static void insertionCui(Reader.Student[] classmates){
    int lowest;
    Reader.Student pivot;
    for(int i = 0; i < classmates.length; i++){
      lowest = i;
      pivot = classmates[i];
      while((lowest > 0) && (classmates[lowest - 1].getCui() > pivot.getCui())){
	classmates[lowest] = classmates[lowest - 1];
	lowest--;
      }
      classmates[lowest] = pivot;
    }
  }
  public static void insertionEmail(Reader.Student[] classmates){
    int lowest;
    Reader.Student pivot;
    for(int i = 0; i < classmates.length; i++){
      lowest = i;
      pivot = classmates[i];
      while((lowest > 0) && (compareEmail(classmates[lowest - 1].getEmail(), pivot.getEmail()))){
        classmates[lowest] = classmates[lowest - 1];
        lowest--;
      }
      classmates[lowest] = pivot;
    }
  }
  public static void insertionName(Reader.Student[] classmates){
    int lowest;
    Reader.Student pivot;
    for(int i = 0; i < classmates.length; i++){
      lowest = i;
      pivot = classmates[i];
      while((lowest > 0) && (compareString(classmates[lowest - 1].getName(), pivot.getName()))){
	classmates[lowest] = classmates[lowest - 1];
	lowest--;
      }
      classmates[lowest] = pivot;
    }
  }
  public static void insertionLastNameF(Reader.Student[] classmates){
    int lowest;
    Reader.Student pivot;
    for(int i = 0; i < classmates.length; i++){
      lowest = i;
      pivot = classmates[i];
      while((lowest > 0) && (compareString(classmates[lowest - 1].getLastNameF(), pivot.getLastNameF()))){
	classmates[lowest] = classmates[lowest - 1];
	lowest--;
      }
      classmates[lowest] = pivot;
    }
  }
  public static void insertionLastNameM(Reader.Student[] classmates){
    int lowest;
    Reader.Student pivot;
    for(int i = 0; i < classmates.length; i++){
      lowest = i;
      pivot = classmates[i];
      while((lowest > 0) && (compareString(classmates[lowest - 1].getLastNameM(), pivot.getLastNameM()))){
	classmates[lowest] = classmates[lowest - 1];
	lowest--;
      }
      classmates[lowest] = pivot;
    }
  }

  public static void insertionDateOfBirth(Reader.Student[] classmates){
    int lowest;
    Reader.Student pivot;
    for(int i = 0; i < classmates.length; i++){
      lowest = i;
      pivot = classmates[i];
      while((lowest > 0) && (compareString(classmates[lowest - 1].getDateOfBirth(), pivot.getDateOfBirth()))){
        classmates[lowest] = classmates[lowest - 1];
        lowest--;
      }
      classmates[lowest] = pivot;
    }
  }

  public static void insertionGender(Reader.Student[] classmates){
    int lowest;
    Reader.Student pivot;
    insertionLastNameF(classmates); //Al solo haber dos opciones se hace uso de este metodo para que además de separar por generos se mantenga un orden en cada conjunto
    for(int i = 0; i < classmates.length; i++){
      lowest = i;
      pivot = classmates[i];
      while((lowest > 0) && (classmates[lowest - 1].getGender().charAt(0) > pivot.getGender().charAt(0))){
        classmates[lowest] = classmates[lowest - 1];
        lowest--;
      }
      classmates[lowest] = pivot;
    }
  }

  public static void insertionStatus(Reader.Student[] classmates){
    int lowest;
    Reader.Student pivot;
	insertionLastNameF(classmates);
    for(int i = 0; i < classmates.length; i++){
      lowest = i;
      pivot = classmates[i];
      while((lowest > 0) && (classmates[lowest - 1].getStatus().charAt(0) > pivot.getStatus().charAt(0))){
        classmates[lowest] = classmates[lowest - 1];
        lowest--;
      }
      classmates[lowest] = pivot;
    }
  }
	
  private static boolean compareEmail(String word1, String word2){
    int index1 = word1.indexOf('@');
    int index2 = word2.indexOf('@');
    int length = word1.substring(0, index1).length();
    if(length > word2.substring(0, index2).length()){
      length = word2.substring(0, index2).length();
    }
    int i = 0;
    while(i < length){
      if(word1.charAt(i) == word2.charAt(i)){
        i++;
      }else{
	if(word1.charAt(i) > word2.charAt(i)){
	  return true;
	}
	return false;
      }
    }
    return false;
  }
  private static boolean compareString(String word1, String word2){
    //Suponemos que los datos no tienen mayusculas donde no deben. Además este método nos
    //sirve para ordenar según nacimiento, pues si convertimos a número, no cumple todos los casos
    int length = word1.length();
    if(length > word2.length()){
      length = word2.length();	
    }
    int i = 0;
    while(i < length){
      if(word1.charAt(i) == word2.charAt(i)){
	i++;
      }else{
	if(word1.charAt(i) > word2.charAt(i)){
	  return true;
	}
	return false;
      }
    }
    return false;
  }
}
