package Unidad3;
/**
 * Created by ADM-PC on 16/03/2017.
 */
public class Cola<T> {
    private int Frente;
    private int Fin;
    private int Max;
    public T   Dr;
    private T [] C;
    public Cola(){
        this(10);
    }
    public Cola(int Tam){
        Max=Tam;
        Frente=Fin=-1;
        C=(T[]) new Object[Tam];
    }
    public boolean Inserta(T Dato){
        if(Llena())
            return false;
        Fin++;
        C[Fin]=Dato;
        if(Frente==-1)
            Frente=0;
        return true;
    }
    public boolean Retira(){
        if(Vacia())
            return false;
        Dr=C[Frente];
        C[Frente]=null;
        if(Frente==Fin)
            Frente=Fin=-1;
        else
            Frente++;
        return true;
    }
    public boolean Llena(){
        return Fin==Max-1;
    }
    public boolean Vacia(){
        return Frente==-1;
    }
    public T Recorrer(int i){
        T mn=null;
        if (Vacia()){
            return mn;
        }
        else {
                return C[i];

        }
    }

}
