package Poo;

/**
 * Created by GuilleCRS on 28/03/2017.
 */

public class Empleado {
    int nempleado,cestimulo;
    String nomempleado;

    public Empleado(int nempleado, int cestimulo, String nomempleado) {
        this.nempleado = nempleado;
        this.cestimulo = cestimulo;
        this.nomempleado = nomempleado;
    }

    public int getNempleado() {
        return nempleado;
    }

    public void setNempleado(int nempleado) {
        this.nempleado = nempleado;
    }

    public int getCestimulo() {
        return cestimulo;
    }

    public void setCestimulo(int cestimulo) {
        this.cestimulo = cestimulo;
    }

    public String getNomempleado() {
        return nomempleado;
    }

    public void setNomempleado(String nomempleado) {
        this.nomempleado = nomempleado;
    }


}
