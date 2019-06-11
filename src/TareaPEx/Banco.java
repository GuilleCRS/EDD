package TareaPEx;
import java.util.*;
/**
 * Created by GuilleCRS on 07/03/2017.
 */
public class Banco {
    Hashtable<Integer,Cuenta> ht=new Hashtable<Integer,Cuenta>();
    public static void main(String[]Args)
    {
        Banco bn=new Banco();
        int op=0;
        do{
            System.out.println("Menú del banco");
            System.out.println("1°-Dar de alta una cuenta");
            System.out.println("2°-Consulta de saldos");
            System.out.println("3°-Mostrar todas las cuentas");
            System.out.println("4°-Depositar");
            System.out.println("5°-Retirar");
            System.out.println("6°-Salir");
            op=Leer.datoInt();
            switch(op){
                case 1:
                    bn.altac();
                    break;
                case 2:
                    bn.consultas();
                    break;
                case 3:
                    bn.mcuentas();
                    break;
                case 4:
                    bn.depositar();
                    break;
                case 5:
                    bn.retirar();
                    break;
            }
        }while (op!=6);
    }
    public void altac(){
       System.out.println("Introduzca la clave del cliente");
       int cl=Leer.datoInt();
       if (ht.containsKey(cl)){
           System.out.println("Esa clave ya existe");
           return;
       }else{
           System.out.println("Introduzca el nombre del cliente");
           String nom=Leer.dato();
           if((nom.equals("")|| nom.equals(null)|| nom==null)){
               System.out.println("No puedes dejar el nombre en blanco");
               return;
           }else{
               System.out.println("Introduce el domicilio del cliente");
               String dom=Leer.dato();
               if ((dom.equals("")|| dom.equals(null)|| dom==null)){
                   System.out.println("El domicilio no puede estar en blanco");
                   return;
               }else{
                   System.out.println("Introduce el importe de apertura del cliente");
                   double ida=Leer.datoDouble();
                   if((ida==0|| ida<0|| ida==Double.NaN)){
                       System.out.println("No puedes dejar un dato negativo o igual a cero");
                       return;
                   }else{
                       Cuenta cuen=new Cuenta(nom.toUpperCase(),dom.toUpperCase(),ida);
                       ht.put(cl,cuen);
                       System.out.println("Dado de alta exitosamente");
                   }
               }
           }

       }
    }
    public void consultas() {
        System.out.println("Introduzca la clave del cliente");
        int cl = Leer.datoInt();
        if (ht.containsKey(cl)){
            Cuenta cuen = ht.get(cl);
            System.out.println("El saldo del cliente " + cuen.getNom() + " es de " + cuen.getSaldo());

        }else {
            System.out.println("Cliente inexistente");
        }
    }
    public void mcuentas(){
        Enumeration<Integer>rht=ht.keys();
        while (rht.hasMoreElements()){
            Integer llave=(Integer)rht.nextElement();
            System.out.println("Clave: "+llave+" Elemento: "+ht.get(llave));
        }

    }
    public void depositar(){
        System.out.println("Introduzca la clave del cliente");
        int cl=Leer.datoInt();
        if (ht.containsKey(cl)){
            Cuenta cuen=ht.get(cl);
            System.out.println("Cuanto saldo desea depositar a la cuenta "+cl);
            double ags=Leer.datoDouble();
            if (ags>0){
                double sdc=cuen.getSaldo();
                cuen.setSaldo(ags+sdc);
                System.out.println("Saldo añadido correctamente");
            }else{
                System.out.println("Error al añadir saldo");
            }
        }else{
            System.out.println("Cliente inexistente");
        }

    }
    public void retirar(){
        System.out.println("Introduzca la clave del cliente");
        int cl=Leer.datoInt();
        if (ht.containsKey(cl)){
            Cuenta cuen=ht.get(cl);
            System.out.println("Cuanto saldo desea retirar de la cuenta "+cl);
            double ags=Leer.datoDouble();
            if (ags>0&&ags<=cuen.getSaldo()){
                double sdc=cuen.getSaldo();
                cuen.setSaldo(sdc-ags);
                System.out.println("Saldo retirado correctamente");
            }else{
                System.out.println("Error al retirar saldo");
            }
        }else{
            System.out.println("Cliente inexistente");
        }

    }


}
