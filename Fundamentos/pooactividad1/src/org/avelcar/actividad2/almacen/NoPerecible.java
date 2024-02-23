package org.avelcar.actividad2.almacen;

public class NoPerecible extends Producto{
    // ATRIBUTOS DE LA CLASE.
    private int contenido;
    private int calorias;

    // CONSTRUCTOR DE LA CLASE.
    public NoPerecible(String nombre, double precio, int contenido, int calorias) {
        super(nombre, precio);
        this.contenido = contenido;
        this.calorias = calorias;
    }

    // GETTERS.
    public int getContenido() {
        return contenido;
    }

    public int getCalorias() {
        return calorias;
    }

    // METODO TOSTRING().

    @Override
    public String toString() {
        return super.toString() + ", Contenido: " + this.getContenido() + ", Calorias: " + this.getCalorias();
    }
}
