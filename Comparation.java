import reader.Reader;
import algorithms.*;

public class Comparation{
  public static void main(String[] args){
    Reader rd = new Reader();
    Reader.Student[] classmates = rd.getData();
    QuickSort.cui(classmates, 0, classmates.length - 1);
  }
}
