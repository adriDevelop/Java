package org.avelcar.poointerfaces.repositorio;

import org.avelcar.poointerfaces.modelo.Cliente;

import java.util.List;

public interface  CrudRepositorio {

    List<Cliente> listar();
    Cliente buscarId(Integer id);
    void crearCliente(Cliente cliente);
    void editarCliente(Cliente cliente);
    void eliminarCliente(Integer id);

}
