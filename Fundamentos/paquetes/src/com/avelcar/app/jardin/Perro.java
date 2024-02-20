package com.avelcar.app.jardin;

import com.avelcar.app.hogar.Persona;

public class Perro {
    protected String nombre;
    protected String raza;
    protected String jugar(Persona persona){
        return persona.lanzarPelota();
    }
}
