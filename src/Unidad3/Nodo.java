package Unidad3;
/**
 * Created by ADM-PC on 27/03/2017.
 */
public class Nodo<T>
{
    public T Info;
    private Nodo<T>   Sig;
    public Nodo(T d)
    {  Info=d;
        Sig=null;
    }
    public Nodo<T> DameSig(){
        return Sig;
    }
    public void setSig(Nodo<T> Ap){
        Sig=Ap;
    }
}
