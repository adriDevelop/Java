package org.avelcar.poointerfaces.repositorio;

import org.avelcar.poointerfaces.modelo.Cliente;

import java.util.List;

public interface PaginableRepositorio {
    List<Cliente> listar(int desde, int hasta);
}
