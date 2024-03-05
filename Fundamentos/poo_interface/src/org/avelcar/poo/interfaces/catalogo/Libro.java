package org.avelcar.poo.interfaces.catalogo;

import java.util.Date;

public class Libro extends Producto implements ILibro{

    private Date fechaPublicacion;
    private String autor;
    private String titulo;
    private String editorial;

    public Libro(int precio, Date fechaPublicacion, String autor, String titulo, String editorial) {
        super(precio);
        this.fechaPublicacion = fechaPublicacion;
        this.autor = autor;
        this.titulo = titulo;
        this.editorial = editorial;
    }

    @Override
    public Date getFechaPublicacion() {
        return this.fechaPublicacion;
    }

    @Override
    public String getAutor() {
        return this.autor;
    }

    @Override
    public String getTitulo() {
        return this.titulo;
    }

    @Override
    public String getEditorial() {
        return this.editorial;
    }

    @Override
    public double getPrecioVenta() {
        return this.getPrecio();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder(super.toString());
        sb.append("\t").append(" La fecha de publicacion: ").append(this.getFechaPublicacion())
                .append("\t").append(" Su autor: ").append(this.getAutor()).append("\t").append(" Su titulo: ").append(this.getTitulo())
                .append("\t").append(" Su editorial: ").append(this.getEditorial());
        return sb.toString();
    }
}
