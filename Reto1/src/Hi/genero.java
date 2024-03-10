
package Hi;


public class genero {
    private double identificador;
    private String genero;

    public genero() {
    }

    public genero(double identificador, String genero) {
        this.identificador = identificador;
        this.genero = genero;
    }

    public double getIdentificador() {
        return identificador;
    }

    public void setIdentificador(double identificador) {
        this.identificador = identificador;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }
    
}
