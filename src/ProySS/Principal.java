package ProySS;

import java.util.Random;

/**
 * Created by guill on 17/04/2017.
 */
public class Principal {
    Aspirantes Dr=null;
    Cola<Aspirantes> cola=new Cola<>(5);
    Aspirantes aspirante=new Aspirantes();
    Lista<Aspirantes> lista=new Lista<>();

    public static void main(String []args){
        Principal s=new Principal();
        int op;
        do
        {
            System.out.println("Que desea hacer? ");
            System.out.println("1-° Agregar Aspirante");
            System.out.println("2-° Realizar Sorteo");
            System.out.println("3-° Anunciar Ganadores");
            System.out.println("4-° Consultar Ganadores");
            System.out.println("5-° Consultar Aspirantes");
            op= Proyecto.Leer.datoInt();
            switch (op){
                case 1:
                    s.AgregaA();
                    break;
                case 2:
                    s.RealizarS();
                    break;
                case 3:
                    s.Anuncia();
                    break;
                case 4:
                    s.ConsultaG();
                    break;
                case 5:
                    s.ConsultaA();
            }
        }while(op!=6);
    }

    private void ConsultaA() {
        System.out.println("Aspirantes");
        lista.EstadoActual();

    }

    private void ConsultaG() {
    System.out.println("Ganadores ");
        for (int i=0;i<5;i++){
            System.out.println(cola.Recorrer(i));
        }
    }

    private void Anuncia() {
        System.out.println("Los seleccionados son");
        for (int i=0;i<5;i++){
            cola.Retira();
            System.out.println(cola.Dr.toString());
        }
    }

    private void RealizarS() {
        int dato,dato2;
        dato = (int) (Math.random() * lista.NoElementos())+1 ;//Numero random entre 1 y el numero de aspirantes
        System.out.println(dato);
        lista.EliminarRandom(dato);//Agregue un metodo a la lista
        Dr=lista.Dr;
        if(Dr.getPromedio()<90){
            lista.Eliminar(Dr);
            System.out.println("El aspirante seleccionado fue: "+Dr.toString()+" pero su promedio es menor a 90");
            System.out.println("por lo tanto no puede ser seleccionado en el sorteo y ha sido eliminado de la lista");
        }
        else if(Dr.getPromedio()>=90){
            System.out.println("Aspirante seleccionado: "+ Dr.toString());
            if(!cola.Llena()){
                cola.Inserta(Dr);
            }
            else{
                System.out.println("La pila de ganadores puede estar llena anuncielos para volver a hacer otro sorteo");
            }
        }
    }

    private void AgregaA() {
        System.out.println("Se va agregar un aspirante");
        System.out.println("Introduzca el nombre del aspirante");
        String nombrea=Leer.dato();
        if(!nombrea.equals("")){
            System.out.println("Introduzca la escuela de procedencia");
            String escuelap=Leer.dato();
            if(!escuelap.equals("")){
                System.out.println("Introduzca el promedio del aspirante");
                double promedio=Leer.datoDouble();
                if(promedio>0 && promedio<=100){
                    aspirante=new Aspirantes(nombrea.toUpperCase(),escuelap.toUpperCase(),promedio);
                    if(aspirante!=null){
                        lista.InsertaFin(aspirante);
                        System.out.println("Aspirante insertado correctamente");
                    }
                }
                else{
                    System.out.println("El promedio debe estar entre 1 y 10");
                }
            }
            else{
                System.out.println("Dato Erroneo");
            }
        }
        else{
            System.out.println("Dato Erroneo");
        }

    }
}
