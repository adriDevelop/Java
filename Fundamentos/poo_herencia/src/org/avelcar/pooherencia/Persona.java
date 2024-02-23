package org.avelcar.pooherencia;

public class Persona {
    private String nombre;
    private String apellidos;
    private int edad;
    private String direccion;
    private String email;

    public Persona(String nombre, String apellidos, int edad, String direccion, String email) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.edad = edad;
        this.direccion = direccion;
        this.email = email;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String saludar(){
        return "Hola que tal?";
    }

    @Override
    public String toString() {
        return "Nombre: " + this.nombre + " Apellidos " + this.apellidos;
    }
}
