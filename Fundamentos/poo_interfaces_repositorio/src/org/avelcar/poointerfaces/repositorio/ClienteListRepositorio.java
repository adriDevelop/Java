package org.avelcar.poointerfaces.repositorio;

import org.avelcar.poointerfaces.modelo.Cliente;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class ClienteListRepositorio implements CrudRepositorio<Cliente>, OrdenableRepositorio<Cliente>, PaginableRepositorio<Cliente>{

    private List<Cliente> dataSource;

    public ClienteListRepositorio() {
        this.dataSource = new ArrayList<>();
    }

    @Override
    public List<Cliente> listar() {
        return dataSource;
    }

    @Override
    public Cliente buscarId(Integer id) {
        Cliente clienteEncontrado = null;
        for (Cliente cliente : dataSource){
            if(cliente.getId() == id){
                clienteEncontrado = cliente;
            }
        }
        return clienteEncontrado;
    }

    @Override
    public void crearCliente(Cliente cliente) {
        dataSource.add(cliente);
    }

    @Override
    public void editarCliente(Cliente cliente) {
            Cliente c = this.buscarId(cliente.getId());
            c.setNombre(cliente.getNombre());
            c.setApellidos(cliente.getApellidos());
        }


    @Override
    public void eliminarCliente(Integer id) {
        Cliente c = this.buscarId(id);
        dataSource.remove(c);

    }

    @Override
    public List<Cliente> listar(String campo, Direccion direccion) {
        dataSource.sort(new Comparator<Cliente>() {
            @Override
            public int compare(Cliente a, Cliente b) {
                int resultado = 0;
                if(direccion == Direccion.ASC){
                    switch (campo){
                        case "id" -> resultado = a.getId().compareTo(b.getId());
                        case "nombre" -> resultado = a.getNombre().compareTo(b.getNombre());
                        case "apellido" -> resultado = a.getApellidos().compareTo(b.getApellidos());
                    }
                }else if(direccion == Direccion.DESC){
                    switch (campo){
                        case "id" -> resultado = b.getId().compareTo(a.getId());
                        case "nombre" -> resultado = b.getNombre().compareTo(a.getNombre());
                        case "apellido" -> resultado = b.getApellidos().compareTo(a.getApellidos());
                    }
                }
                return resultado;
            }
        });
        return dataSource;
    }

    @Override
    public List<Cliente> listar(int desde, int hasta) {
        return dataSource.subList(desde, hasta);
    }
}
