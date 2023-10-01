import java.io.*;
public class StudentFinal{
  private BufferedReader reader;
  private String line;
  private String[] parts;
  Student[] classmates = new Student[5];
  int i = 0;

  public void readFile(String file) throws FileNotFoundException, IOException {
    FileReader f = new FileReader(file);
    reader = new BufferedReader(f);

    while ((line = reader.readLine()) != null){
      parts = line.split(",");
      Student s = new Student();
      s.setCui(parts[0]);
      s.setEmail(parts[1]);
      s.setName(parts[2]);
      s.setLastNameF(parts[3]);
      s.setLastNameM(parts[4]);
      s.setDateOfBirth(parts[5]);
      s.setGender(parts[6]);
      s.setStatus(parts[7]);
      classmates[i] = s;
      i++;
    }

    for(Student s : classmates){
      System.out.println(s);
    }
  }
}