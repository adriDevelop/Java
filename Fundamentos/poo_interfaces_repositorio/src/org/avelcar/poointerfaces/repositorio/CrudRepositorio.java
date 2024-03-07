package org.avelcar.poointerfaces.repositorio;

import org.avelcar.poointerfaces.modelo.Cliente;

import java.util.List;

public interface CrudRepositorio <T>{

    List<T> listar();
    T buscarId(Integer id);
    void crearCliente(T cliente);
    void editarCliente(T cliente);
    void eliminarCliente(Integer id);

}
