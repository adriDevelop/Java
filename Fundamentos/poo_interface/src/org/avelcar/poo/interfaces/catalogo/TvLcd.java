package org.avelcar.poo.interfaces.catalogo;

public class TvLcd extends Electronico{

    private int pulgada;

    public TvLcd(int precio, String fabricante, int pulgada) {
        super(precio, fabricante);
        this.pulgada = pulgada;
    }

    public int getPulgada() {
        return pulgada;
    }

    public void setPulgada(int pulgada) {
        this.pulgada = pulgada;
    }

    @Override
    public double getPrecioVenta() {
        return this.getPrecio();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder(super.toString());
        sb.append("\t").append(" Sus pulgadas son: ").append(this.getPulgada());
        return sb.toString();
    }
}
