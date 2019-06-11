package ProySS;
/**
 * Created by guill on 17/04/2017.
 */
public class Aspirantes {
    String nombre,escueladep;
    double promedio;
    public Aspirantes(){}

    public Aspirantes(String nombre, String escueladep, double promedio) {
        this.nombre = nombre;
        this.escueladep = escueladep;
        this.promedio = promedio;

    }
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEscueladep() {
        return escueladep;
    }

    public void setEscueladep(String escueladep) {
        this.escueladep = escueladep;
    }

    public double getPromedio() {
        return promedio;
    }

    public void setPromedio(double promedio) {
        this.promedio = promedio;
    }

    @Override
    public String toString() {
        return "[ Nombre: "+nombre+" ][ Escuela de procedencia: "+escueladep+" ][Promedio: "+promedio+"]";
    }
}
