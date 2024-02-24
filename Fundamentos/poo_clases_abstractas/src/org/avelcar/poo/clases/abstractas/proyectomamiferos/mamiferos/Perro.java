package org.avelcar.poo.clases.abstractas.proyectomamiferos.mamiferos;

public class Perro extends Canino{
    // ATRIBUTOS DE LA CLASE.
    private int fuerzaMordida;

    // CONSTRUCTOR DE LA CLASE.
    public Perro(String habitat, double altura, double largo, double peso, String nombreCientifico, String color, double tamanioColmillos, int fuerzaMordida) {
        super(habitat, altura, largo, peso, nombreCientifico, color, tamanioColmillos);
        this.fuerzaMordida = fuerzaMordida;
    }

    // GETTERS.
    public int getFuerzaMordida() {
        return fuerzaMordida;
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
