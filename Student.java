public class Student{
    private String cui;
    private String email;
    private String name;
    private String lastNameF;
    private String lastNameM;
    private String dateOfBirth;
    private String gender;
    private String status;

    public String getCui(){
        return cui;
    }

    public void setCui(String cui){
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

    public String toString(){
        return "CUI: " + cui + " Email: " + email + " Nombre: " + name + " Apellido Paterno: " + lastNameF + " Apellido Materno: " + lastNameM + " Fecha de Nacimiento: " + dateOfBirth + " Genero: " + gender + " Estado: " + status;
    }
}
