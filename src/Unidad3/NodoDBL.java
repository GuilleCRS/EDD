package Unidad3;

/**
 * Created by ADM-PC on 03/04/2017.
 */
public class NodoDBL<T> {
    private NodoDBL<T> Ant;
    public T Info;
    private NodoDBL<T> Sig;

    public NodoDBL(T D) {
        Info = D;
        Ant = null;
        Sig = null;
    }

    public NodoDBL<T> DameAnt() {
        return Ant;
    }

    public NodoDBL<T> DameSig() {
        return Sig;
    }

    public void setSiguiente(NodoDBL<T> Ap) {
        Sig = Ap;
    }

    public void setAnterior(NodoDBL<T> Ant) {
        this.Ant = Ant;
    }
}