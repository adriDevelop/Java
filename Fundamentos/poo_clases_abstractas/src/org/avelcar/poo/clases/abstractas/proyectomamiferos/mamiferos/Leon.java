package org.avelcar.poo.clases.abstractas.proyectomamiferos.mamiferos;

public class Leon extends Felino{
    // ATRIBUTOS DE LA CLASE.
    private int numManada;
    private double rugidoDecibelios;

    // CONSTRUCTOR DE LA CLASE.
    public Leon(String habitat, double altura, double largo, double peso, String nombreCientifico, double tamanioGarras, int velocidad, int numManada, double rugidoDecibelios) {
        super(habitat, altura, largo, peso, nombreCientifico, tamanioGarras, velocidad);
        this.numManada = numManada;
        this.rugidoDecibelios = rugidoDecibelios;
    }

    // GETTERS.
    public int getNumManada() {
        return numManada;
    }

    public double getRugidoDecibelios() {
        return rugidoDecibelios;
    }

    @Override
    public String comer() {
        StringBuilder sb = new StringBuilder(this.getNombreCientifico());
        sb.append(" se encuentra comiendo en su habitat natural que es ")
                .append(this.getHabitat());
        return sb.toString();
    }

    @Override
    public String dormir() {
        StringBuilder sb = new StringBuilder(this.getNombreCientifico());
        sb.append(" se encuentra durmiendo en su habitat natural que es ")
                .append(this.getHabitat());
        return sb.toString();
    }

    @Override
    public String correr() {
        StringBuilder sb = new StringBuilder(this.getNombreCientifico());
        sb.append(" esta corriendo en su habitat natural que es ")
                .append(this.getHabitat())
                .append(" con su manada, que en total son ")
                .append(this.getNumManada())
                .append(" en la manada.");
        return sb.toString();
    }

    @Override
    public String comunicarse() {
        StringBuilder sb = new StringBuilder(this.getNombreCientifico());
        sb.append(" se esta comunicando en su habitat natural que es ")
                .append(this.getHabitat());
        return sb.toString();
    }
}
