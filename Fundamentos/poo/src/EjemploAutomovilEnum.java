public class EjemploAutomovilEnum {
    public static void main(String[] args) {

        // Instanciamos nuestros propietarios.
        Persona propietario = new Persona("Adrian", "Velasco Carrasco");

        // Instanciamos el motor.
        Motor motor = new Motor(2.0, TipoMotor.DIESEL);

        // Instanciamos el tanque.
        Tanque tanque = new Tanque(40);

        // Instanciamos el array de Ruedas.
        Rueda[] ruedas = new Rueda[4];
        ruedas[0] = new Rueda("Michelin", 22, 11.5);
        ruedas[1] = new Rueda("Michelin", 22, 11.5);
        ruedas[2] = new Rueda("Michelin", 22, 11.5);
        ruedas[3] = new Rueda("Michelin", 22, 11.5);

        // Instanciamos nuestro Automovil.
        Automovil auto = new Automovil("Subaru", "Impreza", Color.ROJO, propietario, tanque, motor, TipoAutomovil.HATCHBACK, ruedas);
        Automovil auto2 = new Automovil("Subaru", "Impreza", Color.AMARILLO, propietario, tanque, motor, TipoAutomovil.COUPE, ruedas);

        // Mostramos los valores de nuestro Auto.
        System.out.println(auto.toString());
        System.out.println(auto.acelerarFrenar(3000));
        System.out.println("Kilometros por litros: " + auto.calcularConsumo(300, 0.6f));

        // Mostramos la comparacion entre dos autos.
        System.out.println(auto.equals(auto2));
        System.out.println();

        // Vamos a trabajar con el Enum y con Switch-Case. Para comenzar, almacenamos el tipo de valor de nuestro auto.
        TipoAutomovil tipoAuto = auto.getTipo();

        // Ahora, trabajamos mediante la funcion switch-case.
        switch(tipoAuto){
            case CONVERTIBLE -> System.out.println("El auto es convertible y tiene 4 puertas");
            case HATCHBACK -> System.out.println("El auto es Hatchback y tiene 4 puertas");
            case PICKUP-> System.out.println("El auto es Pickup y tiene 4 puertas");
            case STATION_WAGON -> System.out.println("El auto es Stationwagon y tiene 4 puertas");
            case SEDAN -> System.out.println("El auto es Sedan y tiene 4 puertas");
        }

        // Vamos a tener un array del Enum.
        TipoAutomovil[] tipos = TipoAutomovil.values();
        
        for (TipoAutomovil tA : tipos){
            System.out.println("tA.name()" + " = " +
                    tA.name() + ", " +
                    tA.getNombre() + ", " +
                    tA.getDecripcion() + ", " +
                    tA.getNumPuertas());
        }
    }
}
