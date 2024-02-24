package org.avelcar.poo.clases.abstractas.proyectomamiferos;

import org.avelcar.poo.clases.abstractas.proyectomamiferos.mamiferos.*;

import java.util.ArrayList;
import java.util.List;

public class EjemploMamiferos {
    public static void main(String[] args) {

        List<Mamifero> mamiferos = new ArrayList<>();

        mamiferos.add(new Leon("Sabana", 1.10, 2.0, 80, "Leonidus felinus", 20, 40, 2, 60));
        mamiferos.add(new Tigre("Antartida", 1.00, 2.2, 80, "Tigrus felinus", 20, 40, "Tigre blanco"));
        mamiferos.add(new Guepardo("Selva", 1.00, 2.0, 70, "Guepardo felinus", 10, 120));
        mamiferos.add(new Lobo("Polo norte", 1.10, 2.0, 80, "lobus caninus", "Blanco", 40, 2, "Albino"));
        mamiferos.add(new Perro("Hogar", 0.8, 1.10, 20, "perrus caninus", "Marron", 5, 2));

        for(Mamifero m : mamiferos){
            System.out.println("=================================");
                if (m instanceof Leon) System.out.println(m.correr() + "\n" + m.comer() + "\n" + m.comunicarse() + "\n" + m.dormir() + "\n");
                else if (m instanceof Tigre) System.out.println(m.correr() + "\n" + m.comer() + "\n" + m.comunicarse() + "\n" + m.dormir() + "\n");
                else if(m instanceof Guepardo) System.out.println(m.correr() + "\n" + m.comer() + "\n" + m.comunicarse() + "\n" + m.dormir() + "\n");
                else if(m instanceof Lobo) System.out.println(m.correr() + "\n" + m.comer() + "\n" + m.comunicarse() + "\n" + m.dormir() + "\n");
                else if(m instanceof Perro) System.out.println(m.correr() + "\n" + m.comer() + "\n" + m.comunicarse() + "\n" + m.dormir() + "\n");
        }
    }
}
