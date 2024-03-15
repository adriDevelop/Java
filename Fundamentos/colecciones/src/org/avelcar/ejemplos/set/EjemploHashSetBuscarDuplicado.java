package org.avelcar.ejemplos.set;

import java.util.HashSet;
import java.util.Set;

public class EjemploHashSetBuscarDuplicado {
    public static void main(String[] args) {

        String[] peces = {"Corvina", "Lenguado", "Pejerrey", "Robalo", "Atun", "Lenguado"};

        Set<String> unicos = new HashSet<>();
        Set<String> duplicados = new HashSet<>();
        for(String pez: peces){
            if(!unicos.add(pez)){
                System.out.println("Elemento duplicado: " + pez);
                duplicados.add(pez);
            }
        }

        System.out.println(unicos.size() + " elementos no duplicados " + unicos);
        System.out.println(duplicados.size() + " elementos duplicados " + duplicados);
    }
}
