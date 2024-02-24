package org.avelcar.poo.clases.abstractas.proyectomamiferos.mamiferos;

public class Tigre extends Felino{
    // ATRIBUTOS DE LA CLASE.
    private String especie;

    // CONSTRUCTOR DE LA CLASE.
    public Tigre(String habitat, double altura, double largo, double peso, String nombreCientifico, double tamanioGarras, int velocidad, String especie) {
        super(habitat, altura, largo, peso, nombreCientifico, tamanioGarras, velocidad);
        this.especie = especie;
    }

    // GETTERS.
    public String getEspecie() {
        return especie;
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
        sb.append(" se encuentra corriendo en su habitat natural que es ")
                .append(this.getHabitat());
        return sb.toString();
    }

    @Override
    public String comunicarse() {
        StringBuilder sb = new StringBuilder(this.getNombreCientifico());
        sb.append(" se encuentra comunicandose en su habitat natural que es ")
                .append(this.getHabitat());
        return sb.toString();
    }
}
