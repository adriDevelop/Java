package ProyectoOrdenCompra;

import java.util.Arrays;
import java.util.Date;

public class OrdenCompra {
    private int id;
    private String descripcion;
    private Date fecha;
    private Cliente cliente;
    private Producto[] productos;
    private int sizeProductos;
    public static int ultimoId;


    // CONSTRUCTOR.
    public OrdenCompra(String descripcion) {
        this.id = ultimoId++;
        this.productos = new Producto[5];
        this.descripcion = descripcion;
    }

    // GETTERS && SETTERS.
    public int getId() {
        return id;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public Date getFecha() {
        return fecha;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    // METODO QUE ME PERMITE ANADIR UN PRODUCTO.
    public void addProducto(Producto producto){
        this.productos[sizeProductos++] = producto;
    }

    // METODO QUE DEVUELVE EL TOTAL DE LA COMPRA.
    public double devolverTotal(){
        double total = 0.0;
        for (Producto p: productos){
            total += p.getPrice();
        }
        return total;
    }

    // METODO QUE DEVUELVE LOS PRODUCTOS.
    public String devuelveProductos(Producto[] productos){
        String producto = "";
        for (Producto p : productos){
            producto += p.getPrice() + " " + p.getNombre() + " " + p.getFabricante() + "\n";
        }
        return producto;
    }

    // METODO TOSTRING().
    @Override
    public String toString() {
        return "OrdenCompra{" +
                "id = " + id +
                ", descripcion = '" + descripcion + '\'' +
                ", fecha = " + fecha +
                ", cliente = " + cliente.getNombre() + ", " +
                "productos = \n" + devuelveProductos(this.productos) +
                ", numero de productos = " + sizeProductos +
                ", total Compra = " + this.devolverTotal() +
                '}';
    }
}
