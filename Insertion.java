public class Insertion{
  public static void insertionCui(Reader.Student[] compañeritos){
    int lowest;
    Reader.Student pivot;
    for(int i = 0; i < compañeritos.length; i++){
      lowest = i;
      pivot = compañeritos[i];
      while((lowest > 0) && (compañeritos[lowest - 1].getCui() > pivot.getCui())){
	compañeritos[lowest] = compañeritos[lowest - 1];
	lowest--;
      }
      compañeritos[lowest] = pivot;
    }
  }
  public static void insertionEmail(Reader.Student[] compañeritos){
    int lowest;
    Reader.Student pivot;
    for(int i = 0; i < compañeritos.length; i++){
      lowest = i;
      pivot = compañeritos[i];
      while((lowest > 0) && (compareEmail(compañeritos[lowest - 1].getEmail(), pivot.getEmail()))){
        compañeritos[lowest] = compañeritos[lowest - 1];
        lowest--;
      }
      compañeritos[lowest] = pivot;
    }
  }
  public static void insertionName(Reader.Student[] compañeritos){
    int lowest;
    Reader.Student pivot;
    for(int i = 0; i < compañeritos.length; i++){
      lowest = i;
      pivot = compañeritos[i];
      while((lowest > 0) && (compareString(compañeritos[lowest - 1].getName(), pivot.getName()))){
	compañeritos[lowest] = compañeritos[lowest - 1];
	lowest--;
      }
      compañeritos[lowest] = pivot;
    }
  }
  public static void insertionLastNameF(Reader.Student[] compañeritos){
    int lowest;
    Reader.Student pivot;
    for(int i = 0; i < compañeritos.length; i++){
      lowest = i;
      pivot = compañeritos[i];
      while((lowest > 0) && (compareString(compañeritos[lowest - 1].getLastNameF(), pivot.getLastNameF()))){
	compañeritos[lowest] = compañeritos[lowest - 1];
	lowest--;
      }
      compañeritos[lowest] = pivot;
    }
  }
  public static void insertionLastNameM(Reader.Student[] compañeritos){
    int lowest;
    Reader.Student pivot;
    for(int i = 0; i < compañeritos.length; i++){
      lowest = i;
      pivot = compañeritos[i];
      while((lowest > 0) && (compareString(compañeritos[lowest - 1].getLastNameM(), pivot.getLastNameM()))){
	compañeritos[lowest] = compañeritos[lowest - 1];
	lowest--;
      }
      compañeritos[lowest] = pivot;
    }
  }

  public static void insertionDateOfBirth(Reader.Student[] compañeritos){
    int lowest;
    Reader.Student pivot;
    for(int i = 0; i < compañeritos.length; i++){
      lowest = i;
      pivot = compañeritos[i];
      while((lowest > 0) && (compareString(compañeritos[lowest - 1].getDateOfBirth(), pivot.getDateOfBirth()))){
        compañeritos[lowest] = compañeritos[lowest - 1];
        lowest--;
      }
      compañeritos[lowest] = pivot;
    }
  }

  public static void insertionGender(Reader.Student[] compañeritos){
    int lowest;
    Reader.Student pivot;
    for(int i = 0; i < compañeritos.length; i++){
      lowest = i;
      pivot = compañeritos[i];
      while((lowest > 0) && (compañeritos[lowest - 1].getGender().charAt(i) > pivot.getGender().charAt(i))){
        compañeritos[lowest] = compañeritos[lowest - 1];
        lowest--;
      }
      compañeritos[lowest] = pivot;
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
