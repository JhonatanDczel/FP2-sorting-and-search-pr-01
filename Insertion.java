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
      while((lowest > 0) && (compareEmail(compañeritos[i].getEmail(), pivot.getEmail()))){
        compañeritos[lowest] = compañeritos[lowest - 1];
        lowest--;
      }
      compañeritos[lowest] = pivot;
    }
  }
  public static boolean compareEmail(String word1, String word2){
    int indexWord1 = word1.indexOf('@');
    int indexWord2 = word2.indexOf('@');
    int length = word1.substring(0, indexWord1).length();
    if(length > word2.substring(0, indexWord2).length()){
      length = word2.substring(0, indexWord2).length();
    }
    int i = 0;
    while(i < length){
      if(word1.charAt(i) == word2.charAt(i)){
        continue;
      }
      if(word1.charAt(i) > word2.charAt(i)){
        return true;
      }
    }
    return false;
  }
}
