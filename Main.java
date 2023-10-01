public class Main{
    public static void main(String[] args){
        Reader lector = new Reader();
        Reader.Student[] estudiantes = lector.getData();
        for (int i = 0; i < estudiantes.length; i++){
            Reader.Student x = estudiantes[i];
            System.out.println(x);
        }
    }
}