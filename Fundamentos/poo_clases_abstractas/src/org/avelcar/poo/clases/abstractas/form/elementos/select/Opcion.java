package org.avelcar.poo.clases.abstractas.form.elementos.select;

public class Opcion {
    // ATRIBUTOS DE LA CLASE.
    private String valor;
    private String nombre;
    private boolean selected;

    // CONSTRUCTOR DE LA CLASE.
    public Opcion(String valor, String nombre) {
        this.valor = valor;
        this.nombre = nombre;
    }

    public Opcion(String valor, String nombre, boolean selected) {
        this.valor = valor;
        this.nombre = nombre;
        this.selected = selected;
    }

    // GETTERS.
    public String getValor() {
        return valor;
    }

    public void setSelected(Boolean selected) {
        this.selected = selected;
    }

    public String getNombre() {
        return nombre;
    }

    public boolean isSelected() {
        return selected;
    }
}
