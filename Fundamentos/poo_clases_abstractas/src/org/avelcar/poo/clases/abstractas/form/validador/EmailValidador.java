package org.avelcar.poo.clases.abstractas.form.validador;

public class EmailValidador extends Validador{

    protected String mensaje = "Formato email invalido.";
    private final static String EMAIL_REGEX = "^(.+)@(.+)$";
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
        return valor.matches(EMAIL_REGEX);
    }
}
