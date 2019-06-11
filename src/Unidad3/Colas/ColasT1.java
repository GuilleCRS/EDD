package Unidad3.Colas;
/**
 * Created by ADM-PC on 16/03/2017.
 */
import java.util.*;
import Unidad3.*;
public class ColasT1 {
    int tamx=5;
    Cola<String> cola=new Cola<String>(tamx);
    public static void main(String []args){
        ColasT1 ct1=new ColasT1();
        int op;
        do
        {

            System.out.println("Que desea hacer? ");
            System.out.println("1-° Agregar");
            System.out.println("2-° Eliminar");
            System.out.println("3-° Mostrar todos");
            System.out.println("4-° Estatus");
            System.out.println("5-° Salir.");
            op= Proyecto.Leer.datoInt();
            switch (op){
                case 1:
                    ct1.AgregaC();
                    break;
                case 2:
                    ct1.Elimina();
                    break;
                case 3:
                    ct1.MostrarT();
                    break;
                case 4:
                    ct1.Estatus();
                    break;
            }
        }while(op!=5);

    }
    public void AgregaC(){
        System.out.println("Dato a agregar");
        String dato=Leer.dato();
        if (cola.Inserta(dato)){
            System.out.println("Dato agregado correctamente");
        }else {
            System.out.println("Cola llena");
        }
    }
    public void Elimina(){
        if(!cola.Vacia()){
            cola.Retira();
            System.out.println("Elemento retirado: "+cola.Dr);
        }else{
            System.out.println("Cola vacia");
        }
    }
    public void MostrarT(){
        if (!cola.Vacia()){
            for (int i=0;i<tamx;i++)
                if (cola.Recorrer(i)!=null)
                System.out.println("Elemento "+(i+1)+": "+cola.Recorrer(i));


        }else if(cola.Vacia()){
            System.out.println("Cola Vacia");
        }
        System.out.println();


    }
    public void Estatus(){
        if (cola.Vacia()){
            System.out.println("Cola vacia");
        }
        if (cola.Llena()){
            System.out.println("Cola llena");
        }
        else if(!cola.Vacia()){
            System.out.println("La cola tiene elementos");
        }

    }
}

