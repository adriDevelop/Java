public enum TipoAutomovil {
    SEDAN("Sedan", "Automovil normal", 4),
    STATION_WAGON("Station Wagon", "Auto grande", 4),
    HATCHBACK("Hatchback", "Auto compacto", 4),
    PICKUP("Pickup", "Camioneta", 4),
    COUPE("Coupe", "Auto pequenio", 2),
    CONVERTIBLE("Convertible", "Auto deportivo", 2),
    FURGON("Furgon", "Auto utilitario", 4);

    private final String nombre;
    private final int numPuertas;
    private final String decripcion;

    TipoAutomovil(String nombre, String decripcion, int numPuertas) {
        this.nombre = nombre;
        this.numPuertas = numPuertas;
        this.decripcion = decripcion;
    }

    public String getNombre() {
        return nombre;
    }

    public int getNumPuertas() {
        return numPuertas;
    }

    public String getDecripcion() {
        return decripcion;
    }
}
