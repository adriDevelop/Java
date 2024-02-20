package com.avelcar.app.hogar;

public class Persona {
    private String nombre;
    private String apellidos;

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

    public String lanzarPelota(){
        return "Lanza la pelota al perro";
    }

    public static String saludar(){
        return "Hola, buenas tardes.";
    }
}
