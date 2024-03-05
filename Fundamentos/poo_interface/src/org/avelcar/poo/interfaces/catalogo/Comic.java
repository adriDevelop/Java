package org.avelcar.poo.interfaces.catalogo;

import java.util.Date;

public class Comic extends Libro{
    private String personaje;

    public Comic(int precio, Date fechaPublicacion, String autor, String titulo, String editorial, String personaje) {
        super(precio, fechaPublicacion, autor, titulo, editorial);
        this.personaje = personaje;
    }

    public String getPersonaje() {
        return personaje;
    }

    public void setPersonaje(String personaje) {
        this.personaje = personaje;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder(super.toString());
        sb.append("\t").append(" El personaje principal es: ").append(this.getPersonaje());
        return sb.toString();
    }
}
