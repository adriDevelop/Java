package org.avelcar.poo.clases.abstractas.form.validador;

public class NumeroValidador extends Validador{

    protected String mensaje = "El campo debe de ser un numero.";
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
        try{
            Integer.parseInt(valor);
            return true;
        } catch(NumberFormatException e){
            return false;
        }
    }
}
