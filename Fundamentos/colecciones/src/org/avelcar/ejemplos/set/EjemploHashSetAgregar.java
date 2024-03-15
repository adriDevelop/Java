package org.avelcar.ejemplos.set;

import java.util.*;

public class EjemploHashSetAgregar {

    public static void main(String[] args) {


        Set<String> hs = new HashSet<>();
        hs.add("uno");
        hs.add("dos");
        hs.add("tres");
        hs.add("cuatro");
        hs.add("cinco");
        System.out.println(hs);

        hs.add("tres");
        List<String> lista = new ArrayList<>(hs);
        Collections.sort(lista);
        System.out.println(lista);
    }
}
