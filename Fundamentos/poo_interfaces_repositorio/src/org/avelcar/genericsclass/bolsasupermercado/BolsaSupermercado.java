package org.avelcar.genericsclass.bolsasupermercado;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class BolsaSupermercado<T> implements Iterable<T>{

    protected List<T> productosBolsa;

    public BolsaSupermercado() {
        this.productosBolsa = new ArrayList<>();
    }

    public List<T> getProductosBolsa() {
        return productosBolsa;
    }

    public void addProducto(T productoIntroducido) {
        this.productosBolsa.add(productoIntroducido);
    }

    @Override
    public Iterator<T> iterator() {
        return this.productosBolsa.iterator();
    }
}
