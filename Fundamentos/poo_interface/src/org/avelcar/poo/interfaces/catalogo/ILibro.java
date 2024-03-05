package org.avelcar.poo.interfaces.catalogo;

import java.util.Date;

public interface ILibro {
    // ATRIBUTOS DE LA INTERFAZ.
    public Date getFechaPublicacion();
    public String getAutor();
    public String getTitulo();
    public String getEditorial();

}
