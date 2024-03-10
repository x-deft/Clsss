
package Hi;

public class materia {
    private double identificador;
    private String materia;

    public materia() {
    }

    public materia(double identificador, String materia) {
        this.identificador = identificador;
        this.materia = materia;
    }

    public double getIdentificador() {
        return identificador;
    }

    public void setIdentificador(double identificador) {
        this.identificador = identificador;
    }

    public String getMateria() {
        return materia;
    }

    public void setMateria(String materia) {
        this.materia = materia;
    }
    
    
}
