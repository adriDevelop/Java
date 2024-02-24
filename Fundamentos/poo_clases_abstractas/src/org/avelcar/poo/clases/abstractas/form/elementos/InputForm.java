package org.avelcar.poo.clases.abstractas.form.elementos;

public class InputForm extends ElementoForm{
    // ATRIBUTOS DE LA CLASE.
    private String tipo = "text";

    // CONSTRUCTOR DE LA CLASE.
    public InputForm(String tipo) {
        this.tipo = tipo;
    }

    public InputForm(String nombre, String tipo) {
        super(nombre);
        this.tipo = tipo;
    }

    @Override
    public String dibujarHtml() {
        return "<input type=\"" + this.tipo
                +"\" name=\"" + this.nombre
                + "\" value=\"" + this.valor + "\">";
    }
}
