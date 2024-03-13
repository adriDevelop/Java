package org.avelcar.pooexcepciones.ejemplo;

public class DivisionPorCeroException extends Exception {
    public DivisionPorCeroException(String mensaje){
        super(mensaje);
    }
}
