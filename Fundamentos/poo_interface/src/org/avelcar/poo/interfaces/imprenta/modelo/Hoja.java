package org.avelcar.poo.interfaces.imprenta.modelo;

abstract public class Hoja implements Imprimible{
    // ATRIBUTOS DE LA CLASE.
    protected String contenido;

    // CONSTRUCTOR DE LA CLASE.
    public Hoja(String contenido) {
        this.contenido = contenido;
    }

    // METODO IMPRIMIR.
    abstract public String imprimir();
}
