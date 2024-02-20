// Al ser una clase entidad, no tiene main.
public class Automovil {

    // Atributos que le pertenecen a la clase.
    private int id;
    private String fabricante;
    private TipoAutomovil tipo;
    private String modelo;
    private Color color;
    private Tanque tanque;
    private Motor motor;
    private Persona propietario;
    private Rueda[] ruedas;
    private static int idUltimo;
    public static final Integer VELOCIDAD_MAXIMA_CARRETERA = 120;
    public static final int VELOCIDAD_MAXIMA_CIUDAD = 50;

    // CONSTRUCTOR.
    public Automovil() {
        id = ++idUltimo;
    }

    public Automovil(String fabricante, String modelo, Color color, Persona conductor, Tanque capacidadTanque, Motor cilindrada, TipoAutomovil tipo, Rueda[] numRuedas) {
        this();
        this.fabricante = fabricante;
        this.modelo = modelo;
        this.color = color;
        this.propietario = conductor;
        this.tanque = capacidadTanque;
        this.motor = cilindrada;
        this.ruedas = numRuedas;
        this.tipo = tipo;
    }

    // METODOS GETTER.
    public int getId() {
        return id;
    }

    public String getFabricante() {
        return this.fabricante;
    }

    public String getModelo() {
        return this.modelo;
    }

    public Color getColor() {
        return this.color;
    }

    public int getCapacidadTanque() {
        return this.tanque.getCapacidad();
    }

    public double getCilindrada() {
        return this.motor.getCilindrada();
    }

    public TipoAutomovil getTipo() {
        return tipo;
    }

    // METODOS SETTERS.
    public void setId(int id) {
        this.id = id;
    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public void setCapacidadTanque(Tanque capacidadTanque) {
        this.tanque = capacidadTanque;
    }

    public void setCilindrada(Motor cilindrada) {
        this.motor = cilindrada;
    }

    public void setTipo(TipoAutomovil tipo) {
        this.tipo = tipo;
    }

    // Agregamos un metodo que nos va a devolver los detalles de nuestro auto.
    @Override
    public String toString() {
        return "auto.id = " + this.id + "\n" +
                "auto.fabricante = " + this.fabricante + "\n" +
                "auto.modelo = " + this.modelo + "\n" +
                "auto.color = " + this.color.getColor() + "\n" +
                "auto.propietario = " + this.propietario.toString() + "\n" +
                "auto.tipo = " + this.tipo.getNombre() + "\n" +
                "auto.tipo.descripcion = " + this.tipo.getDecripcion() + "\n" +
                "auto.tipo.numPuertas = " + this.tipo.getNumPuertas() + "\n" +
                "auto.tipoMotor = " + this.motor.getTipo() + "\n" +
                "auto.numRuedas = " + this.ruedas.length + "\n" +
                "auto.cilindrada = " + this.getCilindrada();
    }

    // Metodos de aceleracion y freno.
    public String acelerar(int rpm) {
        return "El auto " + this.fabricante + " acelerando a " + rpm + " rpm.";
    }

    public String frenar() {
        return "El auto " + this.fabricante + " está frenando.";
    }

    public String acelerarFrenar(int rpm) {
        String acelerar = this.acelerar(rpm);
        String frenar = this.frenar();
        return acelerar + "\n" + frenar;
    }

    // METODO QUE DEVUELVE EL CALCULO DEL CONSUMO DEL VEHICULO.
    public float calcularConsumo(int km, float porcentajeGasolina) {
        return km / (tanque.getCapacidad() * porcentajeGasolina);
    }

    // METODO SOBREESCRITO PARA COMPARAR OBJETOS.
    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof Automovil a)) {
            return false;
        }
        return (this.fabricante != null && this.modelo != null && this.fabricante.equals(a.getFabricante()) && this.modelo.equals(a.getModelo()));
    }
}
