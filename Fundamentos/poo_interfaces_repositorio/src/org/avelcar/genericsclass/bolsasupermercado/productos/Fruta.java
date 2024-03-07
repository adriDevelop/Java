package org.avelcar.genericsclass.bolsasupermercado.productos;

public class Fruta extends Producto{

    protected String color;
    protected double peso;

    public Fruta(String nombre, double precio, String color, double peso) {
        super(nombre, precio);
        this.color = color;
        this.peso = peso;
    }

    public String getColor() {
        return color;
    }

    public double getPeso() {
        return peso;
    }
}
