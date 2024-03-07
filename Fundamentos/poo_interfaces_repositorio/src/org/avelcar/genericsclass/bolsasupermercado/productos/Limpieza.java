package org.avelcar.genericsclass.bolsasupermercado.productos;

public class Limpieza extends Producto{

    protected String componentes;
    protected double cantidadLitros;

    public Limpieza(String nombre, double precio, double cantidadLitros, String componentes) {
        super(nombre, precio);
        this.cantidadLitros = cantidadLitros;
        this.componentes = componentes;
    }

    public String getComponentes() {
        return componentes;
    }

    public double getCantidadLitros() {
        return cantidadLitros;
    }

}
