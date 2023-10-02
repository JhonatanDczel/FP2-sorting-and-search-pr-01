import java.io.*;
import java.util.*;
public class Reader{
  private Student[] classmates;
  private ArrayList<Student> students = new ArrayList<>();

  public Student[] getData(){
    readDataFile();
    classmates = students.toArray(new Student[students.size()]);
    return classmates;
  }

  private void readDataFile(){
    BufferedReader reader = null;
    String line = "";
    String[] parts;
    try {
      FileReader fileReader = new FileReader("data.csv");
      reader = new BufferedReader(fileReader);
      while ((line = reader.readLine()) != null) {
        parts = line.split(",");
        Student student = new Student();
        student.setCui(Integer.parseInt(parts[0]));
        student.setEmail(parts[1]);
        student.setName(parts[2]);
        student.setLastNameF(parts[3]);
        student.setLastNameM(parts[4]);
        student.setDateOfBirth(parts[5]);
        student.setGender(parts[6]);
        student.setStatus(parts[7]);
        students.add(student);
      }
    }catch (Exception exception){
      exception.printStackTrace();
    }finally{
      try{
        reader.close();
      } catch (Exception exception){
      }
    }
  }

  public class Student{
    private int cui;
    private String email;
    private String name;
    private String lastNameF;
    private String lastNameM;
    private String dateOfBirth;
    private String gender;
    private String status;

    public int getCui(){
      return cui;
    }

    public void setCui(int cui){
      this.cui = cui;
    }

    public String getEmail(){
      return email;
    }

    public void setEmail(String email){
      this.email = email;
    }

    public String getName(){
      return name;
    }

    public void setName(String name){
      this.name = name;
    }

    public String getLastNameF(){
      return lastNameF;
    }

    public void setLastNameF(String lastNameF){
      this.lastNameF = lastNameF;
    }

    public String getLastNameM(){
      return lastNameM;
    }

    public void setLastNameM(String lastNameM){
      this.lastNameM = lastNameM;
    }

    public String getDateOfBirth(){
      return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth){
      this.dateOfBirth = dateOfBirth;
    }

    public String getGender(){
      return gender;
    }

    public void setGender(String gender){
      this.gender = gender;
    }

    public String getStatus(){
      return status;
    }

    public void setStatus(String status){
      this.status = status;
    }

    public void print(){
      System.out.println("CUI: " + cui + " Email: " + email + " Nombre: " + name + " Apellido Paterno: " + lastNameF
          + " Apellido Materno: " + lastNameM + " Fecha de Nacimiento: " + dateOfBirth + " Genero: " + gender
          + " Estado: " + status);
    }
  }
}
