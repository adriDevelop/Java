package org.avelcar.poo.interfaces.catalogo;

public abstract class Electronico extends Producto implements IElectronico {

    protected String fabricante;

    public Electronico(int precio, String fabricante) {
        super(precio);
        this.fabricante = fabricante;
    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }

    @Override
    public String getFabricante() {
        return this.fabricante;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder(super.toString());
        sb.append(" Su fabricante: ").append(this.getFabricante());
        return sb.toString();
    }
}
