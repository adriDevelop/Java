package org.avelcar.poo.clases.abstractas.proyectomamiferos.mamiferos;

public abstract class Mamifero {
    // ATRIBUTOS.
    protected String habitat;
    protected double altura;
    protected double largo;
    protected double peso;
    protected String nombreCientifico;

    // CONSTRUCTOR.
    public Mamifero(String habitat, double altura, double largo, double peso, String nombreCientifico) {
        this.habitat = habitat;
        this.altura = altura;
        this.largo = largo;
        this.peso = peso;
        this.nombreCientifico = nombreCientifico;
    }

    // GETTERS.
    public String getHabitat() {
        return habitat;
    }
    public double getAltura() {
        return altura;
    }
    public double getLargo() {
        return largo;
    }
    public double getPeso() {
        return peso;
    }
    public String getNombreCientifico() {
        return nombreCientifico;
    }
    // METODOS.
    abstract public String comer();
    abstract public String dormir();
    abstract public String correr();
    abstract public String comunicarse();

}
