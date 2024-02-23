package org.avelcar.actividad1.compania;

public class Cliente extends Persona{
    // ATRIBUTOS DE LA CLASE.
    private int clienteId;

    // CONSTRUCTOR DE LA CLASE.
    public Cliente(String nombre, String apellidos, String numeroFiscal, String direccion, int clienteId) {
        super(nombre, apellidos, numeroFiscal, direccion);
        this.clienteId = clienteId;
    }

    // GETTERS Y SETTERS.
    public int getClienteId() {
        return clienteId;
    }

    // METODO TOSTRING().
    @Override
    public String toString() {
        return "Cliente Id: " + this.getClienteId() + ", " + super.toString();
    }
}
