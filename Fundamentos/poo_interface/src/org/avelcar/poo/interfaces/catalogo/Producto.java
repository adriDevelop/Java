package org.avelcar.poo.interfaces.catalogo;

public abstract class Producto implements IProducto{

    protected int precio;

    public Producto(int precio) {
        this.precio = precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    @Override
    public int getPrecio() {
        return this.precio;
    }

    @Override
    public String toString() {
        return "El precio del producto es: " + this.precio;
    }
}
