package ProyectoOrdenCompra;

public class Producto {
    private String fabricante;
    private String nombre;
    private double price;

    // CONSTRUCTOR.
    public Producto(String fabricante, String nombre, double price) {
        this.fabricante = fabricante;
        this.nombre = nombre;
        this.price = price;
    }

    // GETTERS && SETTERS.
    public String getFabricante() {
        return fabricante;
    }

    public String getNombre() {
        return nombre;
    }

    public double getPrice() {
        return price;
    }
}
