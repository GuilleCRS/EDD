package Unidad3;

/**
 * Created by ADM-PC on 03/04/2017.
 */
public class ListaDBL<T>
{  public NodoDBL Fre=null;
    public NodoDBL Fin=null;
    public T Dr;

    public boolean InsDblFre( T entrada)
    {
        NodoDBL<T> nuevo=new NodoDBL<T>(entrada);
        if(nuevo==null)
            return false;
        if(Fre==null)
        {
            Fre=nuevo;
            Fin=nuevo;
        }
        else
        {  nuevo.setSiguiente(Fre);
            Fre.setAnterior(nuevo);
            Fre=nuevo;
        }
        return true;
    }
    public boolean InsDblFin( T entrada)
    {
        NodoDBL<T> nuevo=new NodoDBL<T>(entrada);

        if(nuevo==null)
            return false;
        if(Fre==null)
        {
            Fre=nuevo;
            Fin=nuevo;
        }
        else
        {
            Fin.setSiguiente(nuevo);
            nuevo.setAnterior(Fin);
            Fin=nuevo;
        }
        return true;
    }
    public void EstadoActual( int Sentido)
    {
        //Sentido=1 (Fre a Fin), Sentido=2 (Fin a Fre)
        NodoDBL Aux=Fre;
        if (Sentido==2)
            Aux=Fin;
        while (Aux !=null)
        {
            String Informacion= Aux.Info.toString();
            System.out.println(Informacion);
            if (Sentido==1)
                Aux=Aux.DameSig();
            else
                Aux=Aux.DameAnt();
        }
    }
    public int CuentaEle(){
        boolean band = false;
        int num = 0;
        NodoDBL Aux = Fre;
        while (Aux != null) {
            num++;
            Aux = Aux.DameSig();
        }
        return num;

    }
    public boolean Retira(T Dato){
        String Idbusco= Dato.toString();
        NodoDBL<T> Aux =Fre;
        NodoDBL<T> Ant = null;
        boolean Bandera=false;

        while (Aux!=null){
            if(Idbusco.compareTo(Aux.Info.toString())==0){
                Bandera = true;
                Dr=Aux.Info;
                break;
            }
            Ant=Aux;
            Aux=Aux.DameSig();
        }
        if(!Bandera){return false;}
        //unico nodo
        if(Fre==Fin){
            Fre=Fin=null;
            return true;
        }
        //Inicio
        if(Aux==Fre){
            Fre=Fre.DameSig();
            Fre.setAnterior(null);
            return true;
        }
        //fin de la lista
        if(Aux==Fin){
            Fin=Ant;
            Fin.setSiguiente(null);
            return true;
        }
        Ant.setSiguiente(Aux.DameSig());
        Aux.DameSig().setAnterior(Ant);
        return true;
    }
    public boolean buscar(T Dato){
        String idbusco=Dato.toString();
    if (Fre!= null){
        NodoDBL<T> aux = Fre;
        while (aux != null){
            if (idbusco.compareTo(aux.Info.toString())==0){
                return true;
            }
            aux=aux.DameSig();
        }
    }
    return false;
    }
    public boolean estado(){
        if(Fre==null){
            return false;
        }
        else
            return true;
    }


}
