package org.avelcar.pooherencia;

public class Alumno extends Persona {
    private String colegio;
    private double notaMatematicas;
    private double notaLengua;
    private double notaHistoria;

    public Alumno(String nombre, String apellidos, int edad, String direccion, String email, String colegio, double notaMatematicas, double notaLengua, double notaHistoria) {
        super(nombre, apellidos, edad, direccion, email);
        this.colegio = colegio;
        this.notaMatematicas = notaMatematicas;
        this.notaLengua = notaLengua;
        this.notaHistoria = notaHistoria;
    }

    public String getColegio() {
        return colegio;
    }

    public void setColegio(String colegio) {
        this.colegio = colegio;
    }

    public double getNotaMatematicas() {
        return notaMatematicas;
    }

    public void setNotaMatematicas(double notaMatematicas) {
        this.notaMatematicas = notaMatematicas;
    }

    public double getNotaLengua() {
        return notaLengua;
    }

    public void setNotaLengua(double notaLengua) {
        this.notaLengua = notaLengua;
    }

    public double getNotaHistoria() {
        return notaHistoria;
    }

    public void setNotaHistoria(double notaHistoria) {
        this.notaHistoria = notaHistoria;
    }

    @Override
    public String saludar() {
        return "Hola, soy Alumno y mi nombre es " + getApellidos();
    }

    @Override
    public String toString() {
        return super.toString() + " Colegio: " + this.getColegio() + " Nota Matematicas: " + this.getNotaMatematicas() + " Nota Lengua: " + this.getNotaLengua() + " Nota Historia: " + this.getNotaHistoria();
    }
}
