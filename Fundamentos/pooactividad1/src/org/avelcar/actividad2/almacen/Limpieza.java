package org.avelcar.actividad2.almacen;

public class Limpieza extends Producto{
    // ATRIBUTOS DE LA CLASE.
    private String componentes;
    private double litros;

    // CONSTRUCTOR DE LA CLASE.
    public Limpieza(String nombre, double precio, String componentes, double litros) {
        super(nombre, precio);
        this.componentes = componentes;
        this.litros = litros;
    }

    // GETTERS.
    public String getComponentes() {
        return componentes;
    }

    public double getLitros() {
        return litros;
    }

    // METODO TOSTRING().

    @Override
    public String toString() {
        return super.toString() + ", Componentes: " + this.getComponentes() + ", Litros: " + this.getLitros();
    }
}
