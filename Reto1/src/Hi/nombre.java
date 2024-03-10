
package Hi;


public class nombre {
    private double identificador;
    private String nombre;

    public nombre() {
    }

    public nombre(double identificador, String nombre) {
        this.identificador = identificador;
        this.nombre = nombre;
    }

    public double getIdentificador() {
        return identificador;
    }

    public void setIdentificador(double identificador) {
        this.identificador = identificador;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
}
