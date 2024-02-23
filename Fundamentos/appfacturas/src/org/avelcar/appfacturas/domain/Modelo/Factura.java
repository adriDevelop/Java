package org.avelcar.appfacturas.domain.Modelo;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Factura {
    private int idFactura;
    private String descripcion;
    private Date fecha;
    private Cliente cliente;
    private ItemFactura[] items;
    private int indiceItems;
    private static final int MAX_ITEMS = 10;
    private static int ultimoId;

    public Factura(String descripcion, Cliente cliente) {
        idFactura = ++ultimoId;
        this.descripcion = descripcion;
        this.cliente = cliente;
        this.items = new ItemFactura[MAX_ITEMS];
        this.fecha = new Date();
    }

    public Cliente getCliente() {
        return cliente;
    }

    public int getIdFactura() {
        return idFactura;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Date getFecha() {
        return fecha;
    }

    public ItemFactura[] getItems() {
        return items;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    // METODO PARA ANADIR FACTURA AL ARRAY.
    public void addItemFactura(ItemFactura item) {
        if (indiceItems < MAX_ITEMS) {
            this.items[indiceItems++] = item;
        }
    }

    // METODO QUE CALCULA EL TOTAL.
    public double calcularTotal() {
        double total = 0;
        for (ItemFactura item : this.items) {
            if (item != null) {
                total += item.calcularImporte();
            }
        }
        return total;
    }

    // METODO QUE GENERA EL DETALLE DE LA COMPRA.
    public String generarDetalle() {
        StringBuilder sb = new StringBuilder("Factura No:");
        sb.append(idFactura)
                .append("\n Cliente: ")
                .append(this.cliente.getNombre())
                .append("\t")
                .append("NIF Cliente: ")
                .append(this.cliente.getNif())
                .append("\n")
                .append("Descripcion: ")
                .append(this.getDescripcion())
                .append("\n")
                .append("\n#\tNombre\t$\tCant.\tTotal\n");

        SimpleDateFormat df = new SimpleDateFormat("dd/MM/yyyy");
        sb.append("Fecha emision: ")
                .append(df.format(this.getFecha()))
                .append("\n");

        for(ItemFactura item: this.items){
            if (item == null) {
                continue;
            }
                sb.append(item.getProducto().getCodigo())
                        .append("\t")
                        .append(item.getProducto().getNombre())
                        .append("\t")
                        .append(item.getProducto().getPrecio())
                        .append("\t")
                        .append(item.getCantidad())
                        .append("\t")
                        .append(item.calcularImporte())
                        .append("\n");
        }
        sb.append("\nGran total:")
                .append(calcularTotal());

        return sb.toString();
    }
}
