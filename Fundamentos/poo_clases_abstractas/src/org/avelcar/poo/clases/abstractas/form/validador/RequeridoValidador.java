package org.avelcar.poo.clases.abstractas.form.validador;

public class RequeridoValidador extends Validador{

    protected String mensaje = " El campo es requerido";
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
        return (valor != null && !valor.isBlank());
    }
}
