public class Insertion{
  public static void insertionAlgorithmCui(Student[] compañeritos){
    int lowest;
    Student pivot;
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
  public static void insertionAlgorithmEmail(Student[] compañeritos){
    int lowest;
    Student pivot;
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
  public static void insertionAlgorithmName(Student[] compañeritos){
    int lowest;
    Student pivot;
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
  public static void insertionAlgorithmLastNameP(Student[] compañeritos){
    int lowest;
    Student pivot;
    for(int i = 0; i < compañeritos.length; i++){
      lowest = i;
      pivot = compañeritos[i];
      while((lowest > 0) && (compareString(compañeritos[lowest - 1].getLastNameP(), pivot.getLastNameP()))){
	compañeritos[lowest] = compañeritos[lowest - 1];
	lowest--;
      }
      compañeritos[lowest] = pivot;
    }
  }
  public static void insertionAlgorithmLastNameM(Student[] compañeritos){
    int lowest;
    Student pivot;
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

  public static void insertionAlgorithmDateOfBirth(Student[] compañeritos){
    int lowest;
    Student pivot;
    for(int i = 0; i < compañeritos.length; i++){
      lowest = i;
      pivot = compañeritos[i];
      while((lowest > 0) && (convertion(compañeritos[lowest - 1].getDateOfBirth()) > convertion(pivot.getDateOfBirth()))){
        compañeritos[lowest] = compañeritos[lowest - 1];
        lowest--;
      }
      compañeritos[lowest] = pivot;
    }
  }

  public static void insertionAlgorithmGender(Student[] compañeritos){
    int lowest;
    Student pivot;
    for(int i = 0; i < compañeritos.length; i++){
      lowest = i;
      pivot = compañeritos[i];
      while((lowest > 0) && (comparString(compañeritos[lowest - 1].getDateOfBirth(), pivot.getDateOfBirth()))){
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
    String lower1 = word1.toLowerCase();
    String lower2 = word1.toLowerCase();
    int length = lower1.length();
    if(length > lower2.length()){
      length = lower2.length();	
    }
    int i = 0;
    while(i < length){
      if(lower1.charAt(i) == lower2.charAt(i)){
	i++;
      }else{
	if(lower1.charAt(i) > lower2.charAt(i)){
	  return true;
	}
	return false;
      }
    }
    return false;
  }

  public static int convertion(String one){
    int a = parseInteger(one.substring(0, 4) + one.substring(4,6) + one.substring(6,8));
    return a;
  }

}
