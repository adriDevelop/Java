package org.avelcar.generics;

import org.avelcar.poointerfaces.modelo.Cliente;
import org.avelcar.poointerfaces.modelo.ClientePremium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class EjemploGenericos {
    public static void main(String[] args) {

        List<Cliente> clientes = new ArrayList<>();

        clientes.add(new Cliente("Adrian", "Velasco Carrasco"));

        Cliente adrian = clientes.iterator().next();
        System.out.println("Cliente = " + adrian);

        Cliente[] clientesArreglo = {new Cliente("Adrian", "Velasco Carrasco"),
                new Cliente("Andres", "Guzman")};
        Integer[] enterosArreglo = {1,2,3};

        List<Cliente> clientes2 = fromArrayToList(clientesArreglo);
        List<Integer> enterosLista = fromArrayToList(enterosArreglo);

        clientes2.forEach(System.out::println);
        enterosLista.forEach(System.out::println);

        List<String> nombres = fromArrayToList(new String[]{"Adrian", "Andrés", "Pepe", "Lucy", "Bea", "Jhon"},
                enterosArreglo);
        nombres.forEach(System.out::println);

        List<ClientePremium> clientesPremiumList = fromArrayToList(new ClientePremium[]{new ClientePremium("Andrea", "Nuñez Roldan")});
        clientesPremiumList.forEach(System.out::println);

        imprimirClientes(clientes);
        imprimirClientes(clientes2);
        imprimirClientes(clientesPremiumList);
        System.out.println("Maximo de 1, 9 y 4 es: " + maximo(1, 9, 4));
        System.out.println("Maximo de 3.9, 11.6 y 7.78 es: " + maximo(3.9, 11.6, 7.78));
        System.out.println("Maximo de zanahoria, arándanos y manzanas es: " + maximo("zanahoria", "arándanos", "manzanas"));
    }

    public static <T> List<T> fromArrayToList(T[] c){
        return Arrays.asList(c);
    }

    // Limitando a los Generics a que sea extendido de Number.
    public static <T extends Number> List<T> fromArrayToList(T[] c){
        return Arrays.asList(c);
    }

    public static <T extends Cliente> List<T> fromArrayToList(T[] c){
        return Arrays.asList(c);
    }

    public static <T, G> List<T> fromArrayToList(T[] c, G[] x){
        for (G elemento: x) {
            System.out.println(elemento);
        }
        return Arrays.asList(c);
    }

    // Usando el comodin (WildCards).
    public static void  imprimirClientes(List<? extends Cliente> clientes){
        clientes.forEach(System.out::println);
    }

    // Calcular el mayor de 3 objetos Genericos.
    public static <T extends Comparable<T>> T maximo(T a, T b, T c){
        T max = a;
        if (b.compareTo(max) > 0){
            max = b;
        }
        if(c.compareTo(max) > 0){
            max = c;
        }
        return max;
    }


}
