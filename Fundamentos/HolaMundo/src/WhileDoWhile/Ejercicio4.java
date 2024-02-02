package WhileDoWhile;

import javax.swing.*;
import java.util.HashMap;
import java.util.Map;

public class Ejercicio4 {
    public static void main(String[] args) {
        int opcionIndice = 0;

        Map<String, Integer> opciones = new HashMap();
        opciones.put("Actualizar", 1);
        opciones.put("Eliminar", 2);
        opciones.put("Agregar", 3);
        opciones.put("Listar", 4);
        opciones.put("Salir", 5);


        Object[] opArreglo = opciones.keySet().toArray();

        Object opcion = JOptionPane.showInputDialog(null,
                "Seleccione un Opción",
                "Mantenedor de Productos",
                JOptionPane.INFORMATION_MESSAGE, null, opArreglo, opArreglo[0]);


        if (opcion == null) {
            JOptionPane.showMessageDialog(null, "Debe seleccionar una operación");
        } else {
            opcionIndice = opciones.get(opcion.toString());

            switch (opcionIndice){
                case 1 -> {
                    JOptionPane.showInputDialog(null,
                            "Usuario actualizado correctamente.");
                }
                case 2 -> {
                    JOptionPane.showInputDialog(null,
                            "Usuario eliminado correctamente.");
                }
                case 3-> {
                    JOptionPane.showInputDialog(null,
                            "Usuario agregado correctamente.");
                }
                case 4-> {
                    JOptionPane.showInputDialog(null,
                            "Usuarios listados correctamente.");
                }

            }

        }while (opcionIndice != 5);
        JOptionPane.showInputDialog(null,
                "Has salido con exito!");

    }
}
