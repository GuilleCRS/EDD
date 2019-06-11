
package Unidad4.Grafos;
import java.util.*;

public class Grafos1<T> {

    Vector<Nodo> vec;
    public Grafos1()
    {
        vec= new Vector<Nodo>();
    }
    public boolean agregaNodo(T info)
    {
       Nodo<T> nvo=new Nodo<T>(info);
       if(!ValidaNodosDup(info)) {
           vec.add(nvo);
           return true;
       }
       else {
           return false;
       }
    }
    public boolean ValidaNodosDup(T info)
    {
        for(int i=0;i<vec.size();i++){
            if(vec.elementAt(i).Info.equals(info)){
                return true;
            }
        }
        return false;
    }
    public boolean agregaArista(T nodo,T Nvo)
    {
        if (vacio())
            return false;
        Nodo<T> nvo=new Nodo<T>(Nvo);
        if (nvo==null)
            return false;
        for(int i=0;i<vec.size();i++)
        {
            if (vec.elementAt(i).Info.equals(nodo))
            {   Nodo ele= vec.elementAt(i);
                Nodo ant=null;
                 while(ele!=null)
                 {
                     if(ele.Info.toString().compareTo(nvo.Info.toString())==0){
                         return false;
                     }
                     ant=ele;
                     ele=ele.DameSig();
                 }
                 ant.setSig(nvo);
                 return true;
            }
        }
       return false;
    }
    
    public boolean vacio()
    {
        return vec.isEmpty();
    }
    
    public void ImprimeAdyacentes(T nodo)
    {
        if (vacio())
        {
            System.out.println("No hay Elementos");
            return;
        }
        for(int i=0;i<vec.size();i++)
        {
            if (vec.elementAt(i).Info.equals(nodo))
            {
                System.out.println("Adyacentes de "+vec.elementAt(i).Info);
                Nodo ele= vec.elementAt(i);
                ele=ele.DameSig();
                 while(ele!=null)
                 {
                     System.out.println(ele.Info);
                     ele=ele.DameSig();
                 }
            }
        }    
    }
    public  void Recorrer(){
        for(int x=0;x<vec.size();x++){
            ImprimeAdyacentes((T) vec.elementAt(x).Info.toString());
        }
    }
    public void eliminavert(T nodo){
        boolean band=false;
        if(vacio()){
            System.out.println("No hay elementos");
            return;
        }
        for(int i=0;i<vec.size();i++)
        {
            if (vec.elementAt(i).Info.equals(nodo))
            {
                Nodo ele= vec.elementAt(i);
                ele=ele.DameSig();
                Nodo Aux=ele;
                if(ele==null){
                    vec.remove(i);
                    System.out.println("Eliminado correctamente");
                    return;
                }
                else{
                    while(Aux!=null)
                    {
                        ele= vec.elementAt(i);
                        Aux=Aux.DameSig();
                        ele.setSig(null);
                        ele=ele.DameSig();
                    }
                    for(int x=0;x<vec.size();x++){
                        Nodo ele2=vec.elementAt(x);
                        Nodo ant=ele2;
                        Nodo aux2=ele2.DameSig();
                        while(aux2!=null)
                        {
                            if(aux2.Info.equals(nodo)){
                                ant.setSig(null);
                            }
                            ant=aux2;
                            aux2=aux2.DameSig();
                        }
                    }
                    eliminavert(nodo);
                }
            }
        }
    }
    public void eliminAris(T nodo,T nodosec){
        for(int x=0;x<vec.size();x++){
            Nodo ele2=vec.elementAt(x);
            Nodo ant=ele2;
            Nodo aux2=ele2.DameSig();
            if(vacio()){
                System.out.println("Grafo vacio");
                return;
            }
            else if(vec.elementAt(x).Info.equals(nodo)) {
                while (aux2 != null) {
                    if (aux2.Info.equals(nodosec)) {
                        ant.setSig(null);
                        return;
                    }
                    ant = aux2;
                    aux2 = aux2.DameSig();
                }
            }
        }
    }
}



