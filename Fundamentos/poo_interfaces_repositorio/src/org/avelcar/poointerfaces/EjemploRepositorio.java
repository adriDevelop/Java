package org.avelcar.poointerfaces;

import org.avelcar.poointerfaces.modelo.Cliente;
import org.avelcar.poointerfaces.repositorio.*;

import java.util.List;

public class EjemploRepositorio {
    public static void main(String[] args) {

        CrudRepositorio<Cliente> repo = new ClienteListRepositorio();
        repo.crearCliente(new Cliente("Adrian", "Velasco Carrasco"));
        repo.crearCliente(new Cliente("Bea", "Gonzalez Carrasco"));
        repo.crearCliente(new Cliente("Luci", "Velasco Martinez"));
        repo.crearCliente(new Cliente("Andres", "Guzman"));

        List<Cliente> clientes = repo.listar();
        clientes.forEach(System.out::println);
        System.out.println("=====PAGINABLE=====");
        List<Cliente> paginable = ((PaginableRepositorio)repo).listar(0,3);
        paginable.forEach(System.out::println);
        System.out.println("=====Ordenar=====");
        List<Cliente> ordenable = ((OrdenableRepositorio)repo).listar("id", Direccion.ASC);
        ordenable.forEach(System.out::println);
        System.out.println("=====Editar=====");
        Cliente beaActualizar = new Cliente("Bea", "Mena");
        beaActualizar.setId(2);
        repo.editarCliente(beaActualizar);
        clientes.forEach(System.out::println);
        System.out.println("=====Eliminar=====");
        repo.eliminarCliente(beaActualizar.getId());
        clientes.forEach(System.out::println);
    }
}
