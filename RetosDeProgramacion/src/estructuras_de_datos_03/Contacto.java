package estructuras_de_datos_03;

import java.util.List;

public class Contacto {
    private String nombre;
    private String apellidos;
    private String numTelefono;

    public Contacto(String nombre, String apellidos, String numTelefono) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.numTelefono = numTelefono;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public String getNumTelefono() {
        return numTelefono;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public void setNumTelefono(String numTelefono) {
        this.numTelefono = numTelefono;
    }

    @Override
    public String toString() {
        return "nombre='" + nombre + '\'' +
                ", apellidos='" + apellidos + '\'' +
                ", numTelefono='" + numTelefono + '\'';
    }
}
