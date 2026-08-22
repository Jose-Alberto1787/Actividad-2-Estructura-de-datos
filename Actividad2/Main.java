import java.util.Scanner;
public class Main{
    public static void menu(){
        System.out.println("=====CENTRO DE OPERACIONES=====");
        System.out.println("1. Registrar accion");
        System.out.println("2. Deshacer ultima accion");
        System.out.println("3. Ver ultima accion");
        System.out.println("4. Mostrar historial");
        System.out.println(" ");
        System.out.println("5. Agregar tarea");
        System.out.println("6. Procesar siguiente tarea");
        System.out.println("7. Ver siguiente tarea");
        System.out.println("8. Monstrar tareas pendientes");
        System.out.println(" ");
        System.out.println("9. Mostrar estado del sistema");
        System.out.println("10. Salir");
        System.out.println("Escoga una opcion(Ingrese el numero)");
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Queue tareas = new Queue();
        Queue entregas = new Queue();
        Stack acciones = new Stack();
        int eleccion=0;
        String Libro;
        while(eleccion !=10){
            menu();
            eleccion= sc.nextInt();
            sc.nextLine();
            if(eleccion==1){
                System.out.println("Accion que desea realizar");
                String accion = sc.nextLine(); 
                acciones.push(accion);
            }
            if(eleccion==2){
                System.out.println(acciones.pop());
            }
            if(eleccion==3){
                System.out.println("Accion mas reciente:\n" + acciones.peek());
            }
            if(eleccion==4){
                System.out.println("Historial:");
                System.err.println(acciones.size());
            }
            if(eleccion==5){
                System.out.println("Escriba la tarea que desea agregar");
                String Tarea = sc.nextLine();
                tareas.enqueue(Tarea);
                System.out.println("Tarea registrada con exito");
            }
            if(eleccion==6){
                String tarea_e = tareas.dequeue();
                if (tarea_e.equals("1")){
                    System.out.println("Lista de tareas vacia");
                }
                else{
                    entregas.enqueue(tarea_e);
                    System.out.println("Tarea entregada con exito");
                }
            }
            if(eleccion==7){
                System.out.println("Mostrando siguiente tarea:");
                System.out.println(tareas.peek());
            }
            if(eleccion==8){
                System.out.println("Lista de tareas:");
                System.out.println(tareas.size());
            }
            if(eleccion==9){
                System.out.println("Lista de tareas pendientes:");
                System.out.println(tareas.size());
                System.out.println("Lista de tareas entregadas:");
                System.out.println(entregas.size());
            }
            if(eleccion==10){
                System.out.println("SALIR");
            }
        }
        sc.close();
    }
}
