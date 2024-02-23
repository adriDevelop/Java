package org.avelcar.ejemplo;

import org.avelcar.pooherencia.Alumno;
import org.avelcar.pooherencia.AlumnoInternacional;
import org.avelcar.pooherencia.Profesor;

public class EjemploHerencia {
    public static void main(String[] args) {
        Profesor profe = new Profesor("Adrian", "Velasco Carrasco", 24, "Ronda del Carmen", "adridevelop11@gmail.com", "Matematicas");

        Alumno alumn = new Alumno("Xavier", "Velasco Carrasco", 18, "Ronda del Carmen", "xaveca2005@gmail.com", "IES Mario Lopez", 8.0, 6.0, 5.0);

        AlumnoInternacional alumnInt = new AlumnoInternacional("Mike", "Wasowsky", 17, "Street Journal Edition", "velascoad@gmail.com", "IES Mario Lopez",  6.5, 6.2, 5.8, "Australia", 6.8);

        // MOSTRAMOS LOS DATOS QUE LES HEMOS AGREGADO A NUESTROS OBJECTOS PROFESOR Y ALUMNO MEDIANTE HERENCIA.
        System.out.println(alumn.toString());

        System.out.println(profe.toString());

        System.out.println(alumnInt.toString());


        // METODO QUE NOS SIRVE PARA MOSTRAR EL ARBOL GENEALOGICO DEL QUE HEREDAN CADA UNA DE LAS CLASES.
        Class claseAlumnInt = alumnInt.getClass();
        while(claseAlumnInt.getSuperclass() != null){
            String hija = claseAlumnInt.getName();
            String padre = claseAlumnInt.getSuperclass().getName();

            System.out.println("padre e hija = " + padre + ", " + hija);
            claseAlumnInt = claseAlumnInt.getSuperclass();
        }

        System.out.println(alumn.saludar());
        System.out.println(alumnInt.saludar());
        System.out.println(profe.saludar());
    }

}
