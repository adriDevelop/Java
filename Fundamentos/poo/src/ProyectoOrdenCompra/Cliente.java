package ProyectoOrdenCompra;

public class Cliente {
    private String nombre;
    private String apellidos;

    // CONSTRUCTOR.
    public Cliente(String nombre, String apellidos) {
        this.nombre = nombre;
        this.apellidos = apellidos;
    }

    // GETTERS.
    public String getNombre() {
        return nombre;
    }

    public String getApellidos() {
        return apellidos;
    }


}
