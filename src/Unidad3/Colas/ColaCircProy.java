package Unidad3.Colas;
import Unidad3.*;
import java.util.*;
/**
 * Created by ADM-PC on 23/03/2017.
 */
public class ColaCircProy {
    int numel=10;
    ColaCircular cc=new ColaCircular(numel);
    public static void main(String []args){
        ColaCircProy ccp=new ColaCircProy();
        int op;
        do
        {
            System.out.println("Que desea hacer? ");
            System.out.println("1-° Agregar Elementos");
            System.out.println("2-° Retirar Elementos");
            System.out.println("3-° Imprimir todo");
            System.out.println("4-° Estatus");
            System.out.println("5-° Salir.");
            op= Proyecto.Leer.datoInt();
            switch (op){
                case 1:
                    ccp.AgregaE();
                    break;
                case 2:
                    ccp.RetiraE();
                    break;
                case 3:
                    ccp.ImprimeE();
                    break;
                case 4:
                    ccp.Estatus();
                    break;
            }
        }while(op!=5);
    }
    public void AgregaE(){
        Random rn=new Random();
        int num;
        num=rn.nextInt(100 - 1) + 1;;
        System.out.println("Numero aleatorio: "+num);
        if (!cc.Llena()){
            cc.Inserta(num);
            System.out.println("Numero insertado correctamente");
        }else if(cc.Llena()){
            System.out.println("Cola llena");
        }
    }
    public void RetiraE(){
        if (!cc.Vacia()){
            System.out.println("El valor a retirar es: "+cc.RetornaFrente());
            System.out.println("Desea eliminarlo?");
            System.out.println("Si o No");
            String elm= Leer.dato();
            if (elm.toUpperCase().equals("SI")){
                cc.Retira();
                System.out.println("El dato se ha retirado");
            }else{
                System.out.println("El dato no se ha retirado");
            }
        }else if(cc.Vacia()){
            System.out.println("Cola vacia");
        }

    }
    public void ImprimeE(){
        cc.Mostrar();
    }
    public void Estatus(){
        if(cc.Llena()){
            System.out.println("La cola esta llena");
        }else if(cc.Vacia()){
            System.out.println("La cola esta vacia");
        }else if(!cc.Vacia()){
            System.out.println("La cola contiene elementos");
        }

    }

}
