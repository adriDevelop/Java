package org.avelcar.genericsclass.bolsasupermercado.productos;

public class Lacteo extends Producto{

    protected int cantidad;
    protected int proteinas;

    public Lacteo(String nombre, double precio, int cantidad, int proteinas) {
        super(nombre, precio);
        this.cantidad = cantidad;
        this.proteinas = proteinas;
    }

    public int getCantidad() {
        return cantidad;
    }

    public int getProteinas() {
        return proteinas;
    }
}
