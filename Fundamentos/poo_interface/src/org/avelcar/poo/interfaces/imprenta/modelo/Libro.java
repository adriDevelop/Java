package org.avelcar.poo.interfaces.imprenta.modelo;

import java.sql.Array;
import java.util.ArrayList;
import java.util.List;

public class Libro implements Imprimible{

    private List<Hoja> paginas;
    private String autor;
    private String titulo;
    private Genero genero;

    public Libro(String autor, String titulo, Genero genero) {
        this.paginas = new ArrayList<>();
        this.autor = autor;
        this.titulo = titulo;
        this.genero = genero;
    }

    public Libro addPagina(Hoja pagina){
        paginas.add(pagina);
        return this;
    }

    public String imprimir(){
        StringBuilder sb = new StringBuilder("Titulo: ");
        sb.append(this.titulo).append("\n")
                .append("Autor: ")
                .append(this.autor)
                .append("\n")
                .append("Genero: ")
                .append(this.genero)
                .append("\n");
        for(Hoja pag: this.paginas){
            sb.append(pag.imprimir()).append("\n");
        }
        return sb.toString();
    }
}
