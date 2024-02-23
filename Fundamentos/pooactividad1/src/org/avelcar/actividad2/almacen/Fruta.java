package org.avelcar.actividad2.almacen;

public class Fruta extends Producto{
    // ATRIBUTOS DE LA CLASE.
    private double peso;
    private String color;

    // CONTRUCTOR DE LA CLASE.
    public Fruta(String nombre, double precio, double peso, String color) {
        super(nombre, precio);
        this.peso = peso;
        this.color = color;
    }

    // GETTERS.
    public double getPeso() {
        return peso;
    }

    public String getColor() {
        return color;
    }

    // METODO TOSTRING().
    @Override
    public String toString() {
        return super.toString() + ", Peso: " + this.getPeso() + ", Color: " + this.getColor();
    }
}
