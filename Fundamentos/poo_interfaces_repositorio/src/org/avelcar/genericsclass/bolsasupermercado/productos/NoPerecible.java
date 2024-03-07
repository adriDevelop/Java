package org.avelcar.genericsclass.bolsasupermercado.productos;

public class NoPerecible extends Producto{

    protected String contenido;
    protected int calorias;

    public NoPerecible(String nombre, double precio, String contenido, int calorias) {
        super(nombre, precio);
        this.contenido = contenido;
        this.calorias = calorias;
    }

    public String getContenido() {
        return contenido;
    }

    public int getCalorias() {
        return calorias;
    }
}
