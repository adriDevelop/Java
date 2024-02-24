package org.avelcar.poo.clases.abstractas.form.elementos;

import org.avelcar.poo.clases.abstractas.form.elementos.select.Opcion;

import java.util.ArrayList;
import java.util.List;

public class SelectForm extends ElementoForm{
    // ATRIBUTOS DE LA CLASE.
    private List<Opcion> opciones;

    // CONSTRUCTOR DE LA CLASE.
    public SelectForm(String nombre) {
        super(nombre);
        this.opciones = new ArrayList<Opcion>();
    }

    public SelectForm(String nombre, List<Opcion> opciones) {
        super(nombre);
        this.opciones = opciones;
    }

    public SelectForm addOpcion(Opcion opcion){
        this.opciones.add(opcion);
        return this;
    }

    @Override
    public String dibujarHtml() {
        StringBuilder sb = new StringBuilder("<select ");
        sb.append("name =' ")
                .append(this.nombre)
                .append("'>");

        for(Opcion op: this.opciones){
            sb.append("<option value=' ")
                    .append(op.getValor())
                    .append("'");
            if(op.isSelected()){
                sb.append(" selected");
                this.valor = op.getValor();
            }
            sb.append(">")
                    .append(op.getNombre())
                    .append("</option>");
        }
        sb.append("</select>");
        return sb.toString();
    }
}
