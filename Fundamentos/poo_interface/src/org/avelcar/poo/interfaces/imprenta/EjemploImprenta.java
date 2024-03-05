package org.avelcar.poo.interfaces.imprenta;

import org.avelcar.poo.interfaces.imprenta.modelo.*;
import static org.avelcar.poo.interfaces.imprenta.modelo.Genero.*;

public class EjemploImprenta {
    public static void main(String[] args) {

        Curriculum cv = new Curriculum("Jhon Doe", "Ingeniero de Sistemas", "Resuemen Laboral...");
        cv.addExperiencia("Java");
        cv.addExperiencia("Oracle DBA");
        cv.addExperiencia("Spring Framework");
        cv.addExperiencia("Desarrollador FullStack");
        cv.addExperiencia("Angular");

        Libro libro = new Libro("Erich Gamma", "Patrones de diseño: Elem. Reusables POO", PROGRAMACION);

        libro.addPagina(new Pagina("Patron Singleton"))
                .addPagina(new Pagina("Patron Observador"))
                .addPagina(new Pagina("Patron Factory"))
                .addPagina(new Pagina("Patron Composite"))
                .addPagina(new Pagina("Patron Fascade"));

        Informe informe = new Informe("Estudio sobre microservicios", "Martin Fowler", "James");

        imprimir(cv);
        imprimir(informe);
        imprimir(libro);

    }

    public static void imprimir(Imprimible imprimible){
        System.out.println(imprimible.imprimir());
    }
}
