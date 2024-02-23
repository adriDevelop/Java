package org.avelcar.actividad2.almacen;

public class Lacteo extends Producto{
    // ATRIBUTOS DE LA CLASE.
    private int cantidad;
    private int proteinas;

    // CONSTRUCTOR DE LA CLASE.
    public Lacteo(String nombre, double precio, int proteinas) {
        super(nombre, precio);
        this.proteinas = proteinas;
    }

    // GETTERS.

    public int getCantidad() {
        return cantidad;
    }

    public int getProteinas() {
        return proteinas;
    }


    // METODO TOSTRING().
    @Override
    public String toString() {
        return super.toString() + ", Catidad: " + this.getCantidad() + ", Proteinas:" + this.getProteinas();
    }
}
