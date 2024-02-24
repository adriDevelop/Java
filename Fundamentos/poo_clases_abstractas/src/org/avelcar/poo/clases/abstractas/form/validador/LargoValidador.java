package org.avelcar.poo.clases.abstractas.form.validador;

public class LargoValidador extends Validador{

    protected String mensaje = "Debe de tener minimo %d caracteres y maximo %d caracteres.";
    private int min;
    private int max = Integer.MAX_VALUE;

    public LargoValidador() {
    }

    public LargoValidador(int min, int max) {
        this.min = min;
        this.max = max;
    }

    public void setMin(int min) {
        this.min = min;
    }

    public void setMax(int max) {
        this.max = max;
    }

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
        this.mensaje = String.format(this.mensaje, this.min, this.max);
        if (valor == null){
            return true;
        }

        int largo = valor.length();
        return (largo >= min && largo <= max);
    }
}
