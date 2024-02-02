package ValorVSReferencia;

class Persona{
    // Atributo de la clase.
    public String nombre;

    // Metodo de la clase persona.
    public void modificarNombre(String nuevoNombre){
        this.nombre = nuevoNombre;
    }
}
public class PasarPorReferencia2 {
    public static void main(String[] args) {
        // Creamos un objeto persona.
        Persona persona = new Persona();

        // Modificamos su nombre.
        persona.modificarNombre("Adrian");

        // Devolvemos el nombre de la persona.
        System.out.println("persona.nombre = " + persona.nombre);


    }
}
