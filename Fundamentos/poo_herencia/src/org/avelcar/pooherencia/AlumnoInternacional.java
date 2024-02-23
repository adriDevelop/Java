package org.avelcar.pooherencia;

public class AlumnoInternacional extends Alumno{
    private String pais;
    private double notaIdiomas;

    public AlumnoInternacional(String nombre, String apellidos, int edad, String direccion, String email, String colegio, double notaMatematicas, double notaLengua, double notaHistoria, String pais, double notaIdiomas) {
        super(nombre, apellidos, edad, direccion, email, colegio, notaMatematicas, notaLengua, notaHistoria);
        this.pais = pais;
        this.notaIdiomas = notaIdiomas;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public double getNotaIdiomas() {
        return notaIdiomas;
    }

    public void setNotaIdiomas(double notaIdiomas) {
        this.notaIdiomas = notaIdiomas;
    }

    @Override
    public String saludar() {
        return "Hola, soy un alumno extranjero del Pais " + this.getPais() + " y mi nombre es " + this.getNombre();
    }

    @Override
    public String toString() {
        return super.toString() + " Pais de origen: " + this.getPais() + " Nota idiomas: " + this.getNotaIdiomas();
    }
}
