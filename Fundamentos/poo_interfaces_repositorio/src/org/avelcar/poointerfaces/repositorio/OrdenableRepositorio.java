package org.avelcar.poointerfaces.repositorio;

import org.avelcar.poointerfaces.modelo.Cliente;

import java.util.List;

public interface OrdenableRepositorio {
    List<Cliente> listar(String campo, Direccion direccion);
}
