package org.avelcar.genericsclass;

public class EjemploGenericos {

    public static <T> void imprimirCamion(Camion<T> camion){
        for(T a: camion){
            if (a instanceof Animal)
                System.out.println(" tipo: " + ((Animal)a).getTipo());
            else if (a instanceof Automovil)
                System.out.println(" tipo: " + ((Automovil) a).getMarca());
            else if (a instanceof Maquinaria)
                System.out.println(" tipo: " + ((Maquinaria) a).getTipo());
        }
    }
    public static void main(String[] args) {

        System.out.println("=====Transporte de Caballos=====");

        Camion<Animal> transporteCaballos = new Camion<>(5);

        transporteCaballos.addObjeto(new Animal("Peregrino", "Caballo"));
        transporteCaballos.addObjeto(new Animal("Grillo", "Caballo"));
        transporteCaballos.addObjeto(new Animal("Tunquen", "Caballo"));
        transporteCaballos.addObjeto(new Animal("Topocalma", "Caballo"));
        transporteCaballos.addObjeto(new Animal("Longotoma", "Caballo"));

        imprimirCamion(transporteCaballos);

        System.out.println("=====Transporte de Maquinaria=====");

        Camion<Maquinaria> transporteMaquinas = new Camion<>(5);

        transporteMaquinas.addObjeto(new Maquinaria("Peregrino"));
        transporteMaquinas.addObjeto(new Maquinaria("Grillo"));
        transporteMaquinas.addObjeto(new Maquinaria("Tunquen"));
        transporteMaquinas.addObjeto(new Maquinaria("Topocalma"));
        transporteMaquinas.addObjeto(new Maquinaria("Longotoma"));

        imprimirCamion(transporteMaquinas);

        System.out.println("=====Transporte de Automoviles=====");

        Camion<Automovil> transporteAutomoviles = new Camion<>(5);

        transporteAutomoviles.addObjeto(new Automovil("Peregrino"));
        transporteAutomoviles.addObjeto(new Automovil("Grillo"));
        transporteAutomoviles.addObjeto(new Automovil("Tunquen"));

        imprimirCamion(transporteAutomoviles);
    }
}
