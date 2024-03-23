package estructuras_de_datos_03;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ejercicio4 {
    /*
     * DIFICULTAD EXTRA (opcional):
     * Crea una agenda de contactos por terminal.
     * - Debes implementar funcionalidades de búsqueda, inserción, actualización
     *   y eliminación de contactos.
     * - Cada contacto debe tener un nombre y un número de teléfono.
     * - El programa solicita en primer lugar cuál es la operación que se quiere realizar,
     *   y a continuación los datos necesarios para llevarla a cabo.
     * - El programa no puede dejar introducir números de teléfono no númericos y con más
     *   de 11 dígitos (o el número de dígitos que quieras).
     * - También se debe proponer una operación de finalización del programa.
     */


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Contacto> contactos = new ArrayList<>();
        Agenda ag1 = new Agenda(contactos);
        int opcion = 0;
        while (opcion != 4){
            System.out.println("========== LISTA DE CONTACTOS ============");
            System.out.println(ag1.devuelveContactos());
            System.out.println("¿Que desea hacer?...");
            System.out.println("0.- Buscar un contacto en la agenda por nombre");
            System.out.println("1.- Insertar un nuevo contacto.");
            System.out.println("2.- Actualizar un contacto.");
            System.out.println("3.- Borrar un contacto.");
            System.out.println("4.- Salir.");
            opcion = sc.nextInt();
            switch (opcion){
                case 0:
                    System.out.println("============= BUSQUEDA DE CONTACTO POR NOMBRE ==============");
                    System.out.println("Introduzca el nombre del contacto a buscar:");
                    String nombreBusqueda = sc.next();
                    System.out.println(ag1.devuelveBusqueda(nombreBusqueda));
                    break;
                case 1:
                    System.out.println("============= CREACION DEL CONTACTO ==============");
                    System.out.println("Introduzca los valores correspondientes para poder crear un nuevo contacto:");
                    System.out.println("Introduzca el nombre:");
                    String nombreContacto = sc.next();
                    System.out.println("Introduzca el apellidos:");
                    String apellidosContacto = sc.next();
                    System.out.println("Introduzca el numero:");
                    String numeroContacto = sc.next();
                    Contacto newContacto = new Contacto(nombreContacto, apellidosContacto, numeroContacto);
                    try {
                        ag1.insertarNuevoContacto(newContacto);
                        System.out.println("Contacto creado correctamente.");
                    } catch (Exception e){
                        System.out.println("No ha podido añadir el contacto. " + e.getMessage());
                    }
                    break;
                case 2:
                    System.out.println("========== ACTUALIZAR CONTACTO ============");
                    System.out.println("Introduzca el nombre de la persona que quiere actualizar.");
                    String nombreActualizado = sc.next();
                    System.out.println("Introduzca el apellidos:");
                    String apellidosActualizado = sc.next();
                    System.out.println("Introduzca el numero:");
                    String numeroActualizado = sc.next();
                    Contacto contactoActualizado = new Contacto(nombreActualizado, apellidosActualizado, numeroActualizado);
                    System.out.println(ag1.actualizaContacto(contactoActualizado));
                    break;
                case 3:
                    System.out.println("========== ELIMINAR CONTACTO ============");
                    System.out.println("Introduzca el nombre de la persona que quiere eliminar de la Agenda:");
                    String nombreElimnado = sc.next();
                    Contacto nombreElimnar = ag1.devuelveBusqueda(nombreElimnado);
                    if (nombreElimnar != null){
                        System.out.println("Contacto eliminado: " + nombreElimnar);
                        ag1.eliminarContacto(nombreElimnar);
                    } else {
                        System.out.println("El nombre que nos has pasado no se ha encontrado.");
                    }
                    break;
            }
        }
    }
}
