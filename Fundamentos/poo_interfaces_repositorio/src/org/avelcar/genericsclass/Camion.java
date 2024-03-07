package org.avelcar.genericsclass;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Camion<T> implements Iterable<T>{

    private final List<T> objetos;
    private final int max;

    public Camion(int max) {
        this.objetos = new ArrayList<>();
        this.max = max;
    }

    public void addObjeto(T objeto){
        if(this.objetos.size() <= max) {
            this.objetos.add(objeto);
        } else {
            throw new RuntimeException("No hay mas espacio");
        }
    }

    @Override
    public Iterator<T> iterator() {
        return this.objetos.iterator();
    }
}
