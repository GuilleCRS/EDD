package Unidad3.Venta;
import Unidad3.*;
import java.util.*;
public class PilaVen {
    Hashtable<String ,Double> ht=new Hashtable<String,Double>();
    Pila<Venta> pila=new Pila<Venta>(10);
    public static void main(String []args){
        PilaVen pv=new PilaVen();
        int op;
        do
        {
            System.out.println();
            System.out.println();
            System.out.println("Que desea hacer? ");
            System.out.println("1-° Agregar  nueva venta");
            System.out.println("2-° Consultar ultima venta");
            System.out.println("3-° Mostrar todas las ventas");
            System.out.println("4-° Cerrar el dia");
            System.out.println("5-° Salir.");
            op= Proyecto.Leer.datoInt();
            switch (op){
                case 1:
                    pv.AVenta();
                    break;
                case 2:
                    pv.MostrarUva();
                    break;
                case 3:
                    pv.MostrarTELE();
                    break;
                case 4:
                    pv.CierreDia();
                    break;
            }
        }while(op!=5);
    }
    public void AVenta(){
        System.out.println("Introduzca el nombre del cliente");
        String nom=Leer.dato();
        System.out.println("Introduzca el numero de kilos");
        double nk=Leer.datoDouble();
        System.out.println("Introduzca el importe de la venta");
        double idv=Leer.datoDouble();
        Venta ven=new Venta(nom,nk,idv);
        if (pila.Inserta(ven))
        {
            System.out.println("Agregado exitosamente \n"+ven);
        }else System.out.println("Pila llena");
    }
    public void MostrarUva()
    {
        System.out.println(pila.MostrarT());
    }
    public void CierreDia(){
            if (pila.Vacia())
            {
                System.out.println("No hubo ventas en el dia");
            }else
            {
                do{
                    pila.Retira();
                    Venta venta=pila.Dr;
                    String x=venta.getNcliente();
                    if(ht.containsKey(venta.getNcliente())){
                        double importec=venta.getImporte();
                        double guardado=ht.get(x);
                        double total=importec+guardado;
                        ht.replace(x, total);
                    }else
                        ht.put(venta.getNcliente(),venta.getImporte());
                }while(pila.Vacia()==false);
            }
        Enumeration<String>rht=ht.keys();
        while (rht.hasMoreElements()) {
            String llave = (String) rht.nextElement();
            System.out.println("Nombre del cliente: " + llave + " Importe: " + ht.get(llave));

        }ht.clear();
        }
    public void MostrarTELE()
    {
        for(int i=0;i<10;i++)
        {
            if (pila.RecorrerE(i)==null)
                break;
            else{
                System.out.println(pila.RecorrerE(i));
            }
        }
    }
}
