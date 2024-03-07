package org.avelcar.poointerfaces.repositorio;

import org.avelcar.poointerfaces.modelo.Cliente;

import java.util.List;

public interface PaginableRepositorio<T> {
    List<T> listar(int desde, int hasta);
}
