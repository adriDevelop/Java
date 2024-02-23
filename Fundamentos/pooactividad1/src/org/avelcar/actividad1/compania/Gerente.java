package org.avelcar.actividad1.compania;

public class Gerente extends Empleado{
    // ATRIBUTOS DE LA CLASE.
    private double presupuesto;

    // CONSTRUCTOR.
    public Gerente(String nombre, String apellidos, String numeroFiscal, String direccion, int empleadoId, double remuneracion, double presupuesto) {
        super(nombre, apellidos, numeroFiscal, direccion, empleadoId, remuneracion);
        this.presupuesto = presupuesto;
    }

    // GETTERS Y SETTERS.
    public double getPresupuesto() {
        return presupuesto;
    }

    public void setPresupuesto(double presupuesto) {
        this.presupuesto = presupuesto;
    }

    // METODO TOSTRING().
    @Override
    public String toString() {
        return super.toString() + ", Presupuesto: " + this.getPresupuesto();
    }
}
