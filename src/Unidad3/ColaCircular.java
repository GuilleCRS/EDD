package Unidad3;
/**
 * Created by ADM-PC on 22/03/2017.
 */
public class ColaCircular<T> {
    private int Frente;
    private int Fin;
    private int Max;
    public T   Dr;
    private T [] C;
    public T[] valor;
    public ColaCircular(){
        this(10);
    }

    public ColaCircular(int Tam){
        Max=Tam;
        Frente=Fin=-1;
        C=(T[]) new Object[Tam];
    }
    public boolean Inserta(T Dato){
        if(Llena())
            return false;
        if(Fin==Max-1)
            Fin=0;
        else
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
        if(Frente==Max-1)
            Frente=0;
        else
            Frente++;
        return true;
    }
    public boolean Llena(){
        return Frente==0 && Fin==Max-1 || Fin+1==Frente;
    }

    public boolean Vacia(){
        return Frente==-1;
    }

    public T RetornaFrente(){
        return C[Frente];
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
    public void Mostrar() {
    int i;
        if (Frente == Fin)
            System.out.println("Cola vacia ");
        else {
            i=Frente;
            do {
                System.out.println("Elemento: "+(i+1)+" : "+C[i]);
                i++;
                if(i==Max && Frente>Fin) i=0;
            }while(i!=Fin+1);
        }

    }
}


