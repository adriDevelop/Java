package org.avelcar.poointerfaces.modelo;

public class ClientePremium extends Cliente{

    public ClientePremium(String nombre, String apellidos) {
        super(nombre, apellidos);
    }

    @Override
    public Integer getId() {
        return super.getId();
    }

    @Override
    public void setId(Integer id) {
        super.setId(id);
    }

    @Override
    public String getNombre() {
        return super.getNombre();
    }

    @Override
    public void setNombre(String nombre) {
        super.setNombre(nombre);
    }

    @Override
    public String getApellidos() {
        return super.getApellidos();
    }

    @Override
    public void setApellidos(String apellidos) {
        super.setApellidos(apellidos);
    }
}
