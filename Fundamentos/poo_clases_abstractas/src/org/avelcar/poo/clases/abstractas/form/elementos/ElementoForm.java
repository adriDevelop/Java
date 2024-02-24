package org.avelcar.poo.clases.abstractas.form.elementos;

import org.avelcar.poo.clases.abstractas.form.validador.Validador;

import java.util.ArrayList;
import java.util.List;

abstract public class ElementoForm {
    // Atributos de la clase.
    protected String valor;
    protected String nombre;

    private List<Validador> validadores;
    private List<String> errores;

    // Constructor.
    public ElementoForm() {
        this.validadores = new ArrayList<>();
        this.errores = new ArrayList<>();
    }

    public ElementoForm(String nombre) {
        this();
        this.nombre = nombre;
    }

    // Getter.
    public List<String> getErrores() {
        return errores;
    }

    // Setter.
    public void setValor(String valor) {
        this.valor = valor;
    }

    public ElementoForm addValidador(Validador validador){
        this.validadores.add(validador);
        return this;
    }

    public boolean esValido(){
        for(Validador v: this.validadores){
            if(!v.esValidado(this.valor)){
                this.errores.add(v.getMensaje());
            }
        }
        return this.errores.isEmpty();
    }

    // Metodos de la Clase.
    abstract public String dibujarHtml();
}
