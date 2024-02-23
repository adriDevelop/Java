package org.avelcar.actividad1.compania;

public class Persona {
    // ATERIBUTOS DE LA CLASE.
    private String nombre;
    private String apellidos;
    private String numeroFiscal;
    private String direccion;

    // CONSTRUCTOR DE LA CLASE.
    public Persona(String nombre, String apellidos, String numeroFiscal, String direccion) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.numeroFiscal = numeroFiscal;
        this.direccion = direccion;
    }

    // GETTERS Y SETTERS.
    public String getNombre() {
        return nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public String getNumeroFiscal() {
        return numeroFiscal;
    }

    public String getDireccion() {
        return direccion;
    }

    // METODO TOSTRING().
    @Override
    public String toString() {
        return "Nombre: " + this.getNombre() + ", Apellidos: " + this.getApellidos() +
                ", Numero fiscal: " + this.getNumeroFiscal() + ", Direccion: " + this.getDireccion();
    }
}
