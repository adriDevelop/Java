public class Rueda {

    private String fabricante;
    private int llanta;
    private double ancho;

    public Rueda(String fabricante, int llanta, double ancho) {
        this.fabricante = fabricante;
        this.llanta = llanta;
        this.ancho = ancho;
    }

    public String getFabricante() {
        return fabricante;
    }

    public int getLlanta() {
        return llanta;
    }

    public double getAncho() {
        return ancho;
    }
}
