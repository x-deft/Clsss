package Hi;

public class Build {
    private materia subject;
    private nombre name;
    private genero gender;
    private double notas ;

    public Build() {
    }

    public Build(nombre name,genero gender, materia subject, double notas ) {
        this.subject = subject;
        this.name = name;
        this.gender = gender;
        this.notas = notas;
    }
    
    public Build(double idEstudiante,double idgenero,double idmateria,double notas){
        this.name = new nombre(idEstudiante, "");
        this.gender = new genero(idgenero, "");
        this.subject = new materia(idmateria, "");
        this.notas = notas;       
    }

    public materia getSubject() {
        return subject;
    }

    public void setSubject(materia subject) {
        this.subject = subject;
    }
    
    public nombre getName() {
        return name;
    }

    public void setName(nombre name) {
        this.name = name;
    }

    public genero getGender() {
        return gender;
    }

    public void setGender(genero gender) {
        this.gender = gender;
    }

    public double getNotas() {
        return notas;
    }

    public void setNotas(double notas) {
        this.notas = notas;
    }  
}
