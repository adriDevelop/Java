package org.avelcar.poo.clases.abstractas.proyectomamiferos.mamiferos;

abstract class Felino extends Mamifero{
    // ATRIBUTOS.
    protected double tamanioGarras;
    protected int velocidad;

    // CONSTRUCTOR.
    public Felino(String habitat, double altura, double largo, double peso, String nombreCientifico, double tamanioGarras, int velocidad) {
        super(habitat, altura, largo, peso, nombreCientifico);
        this.tamanioGarras = tamanioGarras;
        this.velocidad = velocidad;
    }

    // GETTERS.
    public double getTamanioGarras() {
        return tamanioGarras;
    }

    public int getVelocidad() {
        return velocidad;
    }
}
