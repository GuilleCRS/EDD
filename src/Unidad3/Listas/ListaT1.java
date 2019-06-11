package Unidad3.Listas;
import Unidad3.*;
/**
 * Created by ADM-PC on 27/03/2017.
 */
public class ListaT1 {
    public static void main (String []args){
        Lista<Integer> lista=new Lista<Integer>();

        lista.InsertaFin(1000);
        lista.InsertaFin(2000);
        lista.InsertaFin(3000);
        lista.InsertaFin(4000);
        System.out.println("Fin de la lista: "+lista.DameFin().Info);
        System.out.println("Frente de la lista: "+lista.DameFrente().Info);
        lista.EstadoActual();
    }
}
