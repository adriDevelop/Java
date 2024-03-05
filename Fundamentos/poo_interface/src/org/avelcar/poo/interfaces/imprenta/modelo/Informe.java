package org.avelcar.poo.interfaces.imprenta.modelo;

public class Informe extends Hoja implements Imprimible{
    // ATRIBUTOS DE LA CLASE.
    private String autor;
    private String revisor;

    // CONSTRUCTOR DE LA CLASE.
    public Informe(String autor, String revisor, String contenido) {
        super(contenido);
        this.autor = autor;
        this.revisor = revisor;
    }

    // METODO DE LA CLASE.
    @Override
    public String imprimir() {
        return "Informe escrito por " + autor
                + " Revisado por: " + revisor
                + "\n" + this.contenido;
    }
}
