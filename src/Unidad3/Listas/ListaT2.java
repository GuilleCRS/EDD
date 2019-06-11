package Unidad3.Listas;
import Unidad3.*;

import java.util.Random;

/**
 * Created by GuilleCRS on 28/03/2017.
 */
public class ListaT2 {
   static  Lista<Integer> lista1=new Lista<Integer>();
    public static void main(String[]a){
        int op;
        do
        {
            ListaT2 lista=new ListaT2();
            System.out.println("Que desea hacer? ");
            System.out.println("1-° Insertar Frente");
            System.out.println("2-° Insertar Fin");
            System.out.println("3-° Inserta Orden");
            System.out.println("4-° Mostrar lista");
            System.out.println("5-° Eliminar");
            System.out.println("6-° Estatus");
            System.out.println("7-° Numero de elementos");
            System.out.println("8-° Busqueda");
            System.out.println("9-° Salir.");
            op= Leer.datoInt();
            switch (op){
                case 1:
                    lista.InsertarFrente();
                    break;
                case 2:
                    lista.InsertaFin();
                    break;
                case 3:
                    lista.InsertaOrd();
                    break;
                case 4:
                    lista.MostrarTodo();
                    break;
                case 5:
                    lista.Eliminar();
                    break;
                case 6:
                    lista.Estatus();
                    break;
                case 7:
                    lista.NoElementos();
                    break;
                case 8:
                    lista.Busqueda();
                    break;
            }
        }while(op!=9);
    }

    private void MostrarTodo() {

        lista1.EstadoActual();
    }
    private void NoElementos(){
        lista1.NoElementos();
    }

    private void InsertaFin() {
        Random rn=new Random();
        int dato;
        dato=rn.nextInt(100 - 1) + 1;;
        System.out.println("Elemento a insertar: "+dato);
        if(lista1.InsertaFin(dato)){
            System.out.println("El elemento fue insertado correctamente");
        }
    }
    private void InsertarFrente() {
        Random rn=new Random();
        int dato;
        dato=rn.nextInt(100 - 1) + 1;;
        System.out.println("Elemento a insertar: "+dato);
        if(lista1.InsertaFrente(dato)){
            System.out.println("Elemento insertado correctamente");
        }
    }
    private void MuestraFrente(){

        System.out.println("Frente de la lista: "+lista1.DameFrente().Info);
    }
    private void MuestraFin(){
        System.out.println("Fin de la lista: "+lista1.DameFin().Info);
    }
    private void Eliminar(){
        System.out.println("Inserta dato a eliminar");
        int dato=Leer.datoInt();
        lista1.Eliminar(dato);
    }
    private void InsertaOrd(){
        Random rn=new Random();
        int dato;
        dato=rn.nextInt(100 - 1) + 1;
        System.out.println("Elemento a insertar: "+dato);
        if(lista1.InsertaOrd(dato)){
            System.out.println("Elemento insertado en orden correctamente");
        }
    }
    private void Estatus(){
        if(lista1.Estatus()==false){
            System.out.println("La lista esta vacia");
        }
        else{
            System.out.println("La lista contiene elementos");
        }
    }
    private void Busqueda(){
        System.out.println("Inserta elemento a buscar");
        int dato=Leer.datoInt();
        if(lista1.Busqueda(dato)==true) {
            System.out.println("El elemento se encuentra en la lista");
        }else{
            System.out.println("El elemento no se encuentra en la lista");
        }

    }
}

