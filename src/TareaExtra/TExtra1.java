package TareaExtra;
import java.util.LinkedList;
import java.util.ListIterator;


/**
 * Created by guill on 01/05/2017.
 */
public class TExtra1 {
    Cliente cl = new Cliente();
    LinkedList<Cliente> ll=new LinkedList<Cliente>();
    ListIterator<Cliente> iter2=ll.listIterator();
    public static void main(String []Args){
              TExtra1 t=new TExtra1();
        int op;
        do
        {
            System.out.println("Que desea hacer? ");
            System.out.println("1-° Dar de alta un cliente");
            System.out.println("2-° Agregar/retirar Saldo");
            System.out.println("3-° Consultar cliente");
            System.out.println("4-° Mostrar todos los clientes");
            System.out.println("5-° Eliminar un cliente");
            System.out.println("6-° Eliminar todos los clientes");
            System.out.println("7-° Salir.");
            op= Proyecto.Leer.datoInt();
            switch (op){
                case 1:
                    t.AltaC();
                    break;
                case 2:
                    t.ARSaldo();
                    break;
                case 3:
                    t.ConsultaC();
                    break;
                case 4:
                    t.MostrarTodo();
                    break;
                case 5:
                    t.EliminaC();
                    break;
                case 6:
                    t.EliminaTodo();
            }
        }while(op!=7);
    }
    private void AltaC(){
        System.out.println("Inserta nombre del cliente");
        String nomc=Leer.dato();
        if(nomc!=null){
            System.out.println("Inserta telefono del cliente");
            String tel=Leer.dato();
            if(tel!=null){
              System.out.println("Inserta saldo del cliente");
              double saldo=Leer.datoDouble();
              if(saldo>0){
                  if(ll.isEmpty())
                  {
                      Cliente cliente = new Cliente(nomc.toUpperCase(), tel, saldo);
                      ll.add(cliente);

                  }
                  else {
                      ListIterator<Cliente> iter=ll.listIterator();
                      while (iter.hasNext()) {
                          Cliente clon=iter.next();
                          if (clon.getNombrec().equals(nomc.toUpperCase())) {
                              System.out.println("El nombre ya es existente");
                              double saldant=clon.getSaldo();
                              double saldoact=saldant+saldo;
                              clon.setSaldo(saldoact);
                              System.out.println("Se agrego el saldo a la cuenta ya existente con ese nombre");
                              break;
                          } else if(!iter.hasNext()){
                              Cliente cliente = new Cliente(nomc.toUpperCase(), tel, saldo);
                              ll.add(cliente);
                              break;
                          }
                      }
                  }

              }else{
                  System.out.println("El saldo no puede ser menor o igual a cero");
              }
            }else{
                System.out.println("El telefono no puede quedar en blanco");
            }
        }else {
            System.out.println("El nombre no puede quedar en blanco");
        }
    }
    private void ARSaldo(){
        System.out.println("Desea agregar o retirar saldo");
        System.out.println("1° Agregar");
        System.out.println("2° Retirar");
        int opt=Leer.datoInt();
        if(opt==1){
            System.out.println("Cliente al que desea agregar saldo");
            String clientelm=Leer.dato();
            System.out.println("Cuanto saldo desea agregar");
            double saldoag=Leer.datoDouble();
            ListIterator<Cliente> iter=ll.listIterator();
            while(iter.hasNext()){
                Cliente clmn=iter.next();
                if(clmn.getNombrec().equals(clientelm.toUpperCase())){
                    double saldoact = (saldoag+clmn.getSaldo());
                    clmn.setSaldo(saldoact);
                    System.out.println("Saldo agregado correctamente");

                    return;
                }
                else if (!iter.hasNext()) {
                    System.out.println("Cliente no se pudo encontrar,verifique el nombre");
                }


            }
        }
        if(opt==2){
            System.out.println("Cliente al que desea retirar saldo");
            String clientelm=Leer.dato();
            System.out.println("Cuanto saldo desea retirar");
            double saldoar=Leer.datoDouble();

            ListIterator<Cliente> iter=ll.listIterator();
            while(iter.hasNext()){
                Cliente clmn=iter.next();
                if(clmn.getNombrec().equals(clientelm.toUpperCase())){
                    double saldoact = (clmn.getSaldo()-saldoar);
                    if(saldoact>=0) {
                        clmn.setSaldo(saldoact);
                        System.out.println("Saldo retirado correctamente");
                    }else{
                        System.out.println("Error al retirar saldo no puede quedar la cuenta en negativo" );
                    }
                    return;
                }
                else if (!iter.hasNext()) {
                    System.out.println("Cliente no se pudo encontrar,verifique el nombre");
                }


            }
        }
        else{
            System.out.println("Opcion inexistente");
        }
    }
    private void ConsultaC(){
        System.out.println("Cliente que desea consultar");
        String clientelm=Leer.dato();
        ListIterator<Cliente> iter=ll.listIterator();
        while(iter.hasNext()){
            Cliente clmn=iter.next();
            if(clmn.getNombrec().equals(clientelm.toUpperCase())){
                System.out.println(clmn.toString());

                break;
            }
            else if (!iter.hasNext()) {
                System.out.println("Cliente no se pudo encontrar,verifique el nombre");
            }


        }
    }
    private void MostrarTodo(){

        System.out.println(ll.toString());
    }
    private void EliminaC() {
        System.out.println("Cliente que desea eliminar");
        String clientelm=Leer.dato();
        ListIterator<Cliente> iter=ll.listIterator();
        while(iter.hasNext()){
            Cliente clmn=iter.next();
           if(clmn.getNombrec().equals(clientelm.toUpperCase())){
               iter.remove();
               System.out.println("Cliente retirado del sistema");
               break;
           }
           else if (!iter.hasNext()) {
               System.out.println("Cliente no se pudo retirar,verifique el nombre");
           }


        }
    }
    private void EliminaTodo() {
     System.out.println("Esta seguro que desea purgar la lista de clientes");
     System.out.println("1° Si");
     System.out.println("2° No");
     int opt=Leer.datoInt();
     if(opt==1){
         ll.clear();
         System.out.println("Clientes eliminados del sistema");
         return;
     }
     if(opt==2){
         return;
     }
     else{
         System.out.println("Opcion no existe");
         return;
     }
        }
}

