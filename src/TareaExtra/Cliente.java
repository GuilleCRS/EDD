package TareaExtra;
/**
 * Created by guill on 01/05/2017.
 */
public class Cliente {
    String Nombrec,telefono;
    double Saldo;
    public Cliente(){}

    public Cliente(String nombrec, String telefono, double saldo) {
        Nombrec = nombrec;
        this.telefono = telefono;
        Saldo = saldo;
    }

    public String getNombrec() {
        return Nombrec;
    }

    public void setNombrec(String nombrec) {
        Nombrec = nombrec;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public double getSaldo() {
        return Saldo;
    }

    public void setSaldo(double saldo) {
        Saldo = saldo;
    }

    @Override
    public String toString() {
        return "Cliente{" + "Nombrec='" + Nombrec + '\'' + ", telefono='" + telefono + '\'' + ", Saldo=" + Saldo + '}'+"\n";
    }
}
