package Unidad3.Venta;
/**
 * Created by GuilleCRS on 05/03/2017.
 */
public class Venta {
    private String ncliente;private double nkilos;private double importe;
    public Venta(){}
    public Venta(String ncliente,double nkilos,double importe)
    {
        this.ncliente=ncliente;
        this.nkilos=nkilos;
        this.importe=importe;
    }

    public String getNcliente() {
        return ncliente;
    }

    public void setNcliente(String ncliente) {
        this.ncliente = ncliente;
    }

    public double getNkilos() {
        return nkilos;
    }

    public void setNkilos(double nkilos) {
        this.nkilos = nkilos;
    }

    public double getImporte() {
        return importe;
    }

    public void setImporte(double importe) {
        this.importe = importe;
    }
    @Override
    public String toString() {
        return "Venta[" + "Cliente='" + ncliente + '\'' + ", Numero de Kilos=" + nkilos + ", Importe=" + importe + ']';
    }
}
