package com.avelcar.app.jardin;

import com.avelcar.app.hogar.Persona;

import static com.avelcar.app.hogar.Persona.saludar;

public class EjemploPaquetes {
    public static void main(String[] args) {

        Persona p = new Persona();
        p.setNombre("Adrian");
        p.setApellidos("Velasco Carrasco");

        System.out.println(p.getNombre());

        Perro perro = new Perro();
        perro.nombre = "Toby";
        perro.raza = "Toby";

        String jugando = perro.jugar(p);
        System.out.println("jugando = " + jugando);

        String saludo = saludar();
        System.out.println("saludo = " + saludo);
    }
}
