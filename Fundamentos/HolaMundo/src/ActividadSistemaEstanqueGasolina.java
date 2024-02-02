public class ActividadSistemaEstanqueGasolina {
    public static void main(String[] args) {

        int capacidadEstanque = 70;

        while (capacidadEstanque != 0) {
            String mensaje = (capacidadEstanque < 70) ?
                    ((capacidadEstanque >= 60 && capacidadEstanque < 70) ?
                            "Estanque casi lleno." : (capacidadEstanque >= 40 && capacidadEstanque < 60) ?
                            "Estanque 3/4" : (capacidadEstanque >= 35 && capacidadEstanque < 40) ?
                            "Medio Estanque" : (capacidadEstanque >= 20 && capacidadEstanque < 35) ?
                            "Suficiente" : (capacidadEstanque >= 1 && capacidadEstanque < 20) ? "Insuficiente": "Tanque Vacío") :
                    "Estanque lleno";
            System.out.println(mensaje);
            capacidadEstanque -= 5;
        }
    }
}
