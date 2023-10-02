public class Main{
    public static void main(String[] args){
        Reader lector = new Reader();
        Reader.Student[] estudiantes = lector.getData();
        impr(estudiantes);
        QuickSort.Cui(estudiantes, 0, estudiantes.length - 1);
        impr(estudiantes);
            
    }
    public static void impr(Reader.Student[] s) {
        System.out.println("-----------------");
        for (int i = 0; i < s.length; i++){
            System.out.println(s[i].getCui());
        }
    }
}
