package TareaPEx;

/**
 * Created by GuilleCRS on 07/03/2017.
 */
public class Cuenta {
    private String nom;private String dom;private double saldo;
    public Cuenta(String nom,String dom,double saldo)
    {
        this.dom=dom;
        this.nom=nom;
        this.saldo=saldo;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getDom() {
        return dom;
    }

    public void setDom(String dom) {
        this.dom = dom;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    @Override
    public String toString() {
        return "Cuenta [" + "Nombre de Cliente: " + nom  + ", Domicilio: " + dom + ", Saldo: " + saldo + ']';
    }
}
