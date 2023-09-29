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
}
