package org.avelcar.poo.clases.abstractas.form.validador;

abstract public class Validador {
    protected String mensaje;
    abstract public String getMensaje();
    abstract public void setMensaje(String mensaje);
    abstract public boolean esValidado(String valor);
}
