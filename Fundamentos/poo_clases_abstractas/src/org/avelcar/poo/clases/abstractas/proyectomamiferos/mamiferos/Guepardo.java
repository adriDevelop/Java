package org.avelcar.poo.clases.abstractas.proyectomamiferos.mamiferos;

public class Guepardo extends Felino{
    // CONSTRUCTOR DE LA CLASE.
    public Guepardo(String habitat, double altura, double largo, double peso, String nombreCientifico, double tamanioGarras, int velocidad) {
        super(habitat, altura, largo, peso, nombreCientifico, tamanioGarras, velocidad);
    }

    @Override
    public String comer() {
        StringBuilder sb = new StringBuilder(this.nombreCientifico);
        sb.append(" se encuentra comiendo en su habitat natural que es ")
                .append(this.getHabitat());
        return sb.toString();
    }

    @Override
    public String dormir() {
        StringBuilder sb = new StringBuilder(this.nombreCientifico);
        sb.append(" se encuentra durmiendo en su habitat natural que es ")
                .append(this.getHabitat());
        return sb.toString();
    }

    @Override
    public String correr() {
        StringBuilder sb = new StringBuilder(this.nombreCientifico);
        sb.append(" se encuentra corriendo en su habitat natural que es ")
                .append(this.getHabitat());
        return sb.toString();
    }

    @Override
    public String comunicarse() {
        StringBuilder sb = new StringBuilder(this.nombreCientifico);
        sb.append(" se encuentra comunicandose en su habitat natural que es ")
                .append(this.getHabitat());
        return sb.toString();
    }
}
