package org.avelcar.actividad1.ejemplo;

import org.avelcar.actividad1.compania.Gerente;

public class EjemploComania {
    public static void main(String[] args) {
        // Creo el gerente.
        Gerente g1 = new Gerente("Adrian", "Velasco Carrasco", "123456789A",
                "Ronda Ronda", 1, 2000, 3000);

        // Muestro al gerente por pantalla con todos los atributos.
        g1.aumentarRemuneracion(14);

        System.out.println("============ METODOS HEREDADOS DE LA CLASE EMPLEADO ================");
        System.out.println(g1.getEmpleadoId() + ", " + g1.getNombre() + ", " + g1.getApellidos() + ", " + g1.getNumeroFiscal() + ", " + g1.getDireccion() + ", " + g1.getRemuneracion());
        System.out.println("============ METODOS HEREDADOS DE LA CLASE GERENTE ================");
        System.out.println(g1.getPresupuesto());


    }
}
