package org.avelcar.actividad1.compania;

public class Empleado extends Persona{
    // ATRIBUTOS DE LA CLASE.
    private int empleadoId;
    private double remuneracion;

    // CONSTRUCTOR DE LA CLASE.
    public Empleado(String nombre, String apellidos, String numeroFiscal, String direccion, int empleadoId, double remuneracion) {
        super(nombre, apellidos, numeroFiscal, direccion);
        this.empleadoId = empleadoId;
        this.remuneracion = remuneracion;
    }

    // GETTERS Y SETTERS.
    public int getEmpleadoId() {
        return empleadoId;
    }

    public double getRemuneracion() {
        return remuneracion;
    }

    // METODO TOSTRING().
    @Override
    public String toString() {
        return "Empleado Id: " + this.getEmpleadoId() + ", Remuneracion: " + this.getRemuneracion()
                + ", " + super.toString();
    }

    // METODO AUMENTAR REMUNERACION AUMENTA EL SUELDO DEL EMPLEADO SEGUN UN PORCENTAJE.
    public void aumentarRemuneracion(int porcentaje){
        this.remuneracion = ((porcentaje*remuneracion)/100) + this.getRemuneracion();
    }
}
