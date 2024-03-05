package org.avelcar.poo.interfaces.catalogo;

public class IPhone extends Electronico implements IProducto{

    private String color;
    private String modelo;

    public IPhone(int precio, String fabricante, String color, String modelo) {
        super(precio, fabricante);
        this.color = color;
        this.modelo = modelo;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    @Override
    public double getPrecioVenta() {
        return this.getPrecio();
    }

     public String toString(){
        StringBuilder sb = new StringBuilder(super.toString());
        sb.append(" El modelo del producto es: ").append(this.getModelo())
                .append("\t").append(" Y su color es: ").append(this.getColor());
        return sb.toString();
     }
}
