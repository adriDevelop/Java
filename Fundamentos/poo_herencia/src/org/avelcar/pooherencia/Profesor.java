package org.avelcar.pooherencia;

public class Profesor extends Persona{
    private String asignatura;

    public Profesor(String nombre, String apellidos, int edad, String direccion, String email, String asignatura) {
        super(nombre, apellidos, edad, direccion, email);
        this.asignatura = asignatura;
    }

    public String getAsignatura() {
        return asignatura;
    }

    public void setAsignatura(String asignatura) {
        this.asignatura = asignatura;
    }

    @Override
    public String saludar() {
        return "Hola, soy el profesor y mi nombre es " + this.getNombre() + " y mi asignatura es " + this.getAsignatura();
    }

    @Override
    public String toString() {
        return super.toString() + " Asignatura " + this.getAsignatura();
    }
}
