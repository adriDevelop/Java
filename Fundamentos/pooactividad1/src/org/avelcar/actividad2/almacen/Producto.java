package org.avelcar.actividad2.almacen;

public class Producto {
    // ATRIBUTOS DE LA CLASE.
    private String nombre;
    private double precio;

    // CONSTRUCTOR DE LA CLASE.
    public Producto(String nombre, double precio) {
        this.nombre = nombre;
        this.precio = precio;
    }

    // GETTERS.
    public String getNombre() {
        return nombre;
    }

    public double getPrecio() {
        return precio;
    }

    // METODO TOSTRING().
    @Override
    public String toString() {
        return "Nombre: " + this.getNombre() + ", Percio: " + this.getPrecio();
    }
}
