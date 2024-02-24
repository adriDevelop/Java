package org.avelcar.poo.clases.abstractas.proyectomamiferos.mamiferos;

abstract class Canino extends Mamifero {
    // ATRIBUTOS.
    protected String color;
    protected double tamanioColmillos;


    // CONSTRUCTOR.
    public Canino(String habitat, double altura, double largo, double peso, String nombreCientifico, String color, double tamanioColmillos) {
        super(habitat, altura, largo, peso, nombreCientifico);
        this.color = color;
        this.tamanioColmillos = tamanioColmillos;
    }

    // GETTERS.
    public String getColor() {
        return color;
    }

    public double getTamanioColmillos() {
        return tamanioColmillos;
    }
}
