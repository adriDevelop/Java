package org.avelcar.poo.clases.abstractas.form.validador;

public class NoNuloValidador extends Validador {
    protected String mensaje = "El campo no puede ser nulo";

    @Override
    public String getMensaje() {
        return this.mensaje;
    }

    @Override
    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }

    @Override
    public boolean esValidado(String valor) {
        return (valor != null);
    }
}
