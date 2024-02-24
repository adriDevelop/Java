package org.avelcar.poo.clases.abstractas.form.elementos;

public class TextAreaForm extends ElementoForm{
    // ATRIBUTOS QUE VA A DEFINIR EL TAMANIO DE NUESTRO TEXTAREA.
    private int filas;
    private int columnas;

    // CONSTRUCTORES DE LA CLASE.
    public TextAreaForm(int filas) {
        this.filas = filas;
    }

    public TextAreaForm(String nombre, int filas, int columnas) {
        super(nombre);
        this.filas = filas;
        this.columnas = columnas;
    }

    @Override
    public String dibujarHtml() {
        return "<textarea name=\"" + this.nombre
                + "\" cols=\" " + this.columnas
                + "\" rows=\" " + this.filas
                + "\" > " + this.valor
                + "</textarea>";
    }
}
