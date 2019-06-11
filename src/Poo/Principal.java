package Poo;
public class Principal {
    static Empleado emp[]=new Empleado[5];
    static Estimulos est[] = new Estimulos[5];
    static  int empleado=0;
    static int elementos;
    static int estimulos=0;
    public static void main(String []args){
        int op;
        do
        {
            Principal p=new Principal();
            System.out.println("Que desea hacer? ");
            System.out.println("1-° Agregar estimulo");
            System.out.println("2-° Agregar empleado");
            System.out.println("3-° Mostrar todos");
            System.out.println("4-° Num");
            System.out.println("5-° Salir.");
            op= Proyecto.Leer.datoInt();
            switch (op){
                case 1:
                    p.Agestimulo();
                    break;
                case 2:
                    p.Agempleado();
                    break;
                case 3:
                    p.DesplegarD();

                    break;
                case 4:
                    p.num();

                    break;
            }
        }while(op!=5);
    }

    public void num() {
       for(int i=0;i<100;i++)
        {
            elementos++;
            System.out.println(elementos);
        }
    }

    public void Agestimulo(){
        if(estimulos<est.length){
            System.out.println("Introduce la clave del estimulo");
            int cest=Leer.datoInt();
            System.out.println("Introduce el importe ");
            double importe=Leer.datoDouble();
            est[estimulos]=new Estimulos(cest,importe);
            System.out.println("Estimulo dado de alta correctamente");
            System.out.println(estimulos);
            estimulos++;
            System.out.println(estimulos);
        }

    }
    public void Agempleado(){
        System.out.println("Nombre del empleado");
        String nome=Leer.dato();
        System.out.println("Numero del empleado");
        int nume=Leer.datoInt();
        System.out.println("Clave estimulo");
        int cestimulo=Leer.datoInt();
        for(int i=0;i<est.length;i++){
            if(cestimulo==est[i].getCestimulo());
            {
                emp[empleado]=new Empleado(nume,cestimulo,nome);
                System.out.println("Empleado dado de alta correctamente");
                empleado++;
                return;

            }
        }
    }
    public void DesplegarD() {
        for(int i=0;i<emp.length;i++){
            System.out.print("Clave del empleado: "+emp[i].getNempleado()+" Nombre del empleado: "+emp[i].getNomempleado()+" " +
                    "Clave Estimulo: "+emp[i].getCestimulo());
            for (int j=0;j<emp.length;i++){
                if(emp[i].getCestimulo()==est[j].getCestimulo()){
                    System.out.println(" Importe "+est[i].getImporte());
                }
            }



        }
    }
}
