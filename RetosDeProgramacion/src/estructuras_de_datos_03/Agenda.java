package estructuras_de_datos_03;

import java.util.List;

public class Agenda {
    protected List<Contacto> contactos;

    public Agenda(List<Contacto> contactos) {
        this.contactos = contactos;
    }

    // Busca y retorna el contacto por nombre.
    public Contacto devuelveBusqueda(String nombre){
        Contacto contactoEncontrado = null;
        for (Contacto con: this.contactos){
            if (con.getNombre().equals(nombre)) {
                System.out.println("Contacto encontrado:");
                contactoEncontrado = con;
                break;
            }
        }
        if (contactoEncontrado == null){
            System.out.println("No se ha podido encontrar el contacto");
        }
        return contactoEncontrado;
    }

    // Insertar un nuevo contacto en la agenda.
    public void insertarNuevoContacto(Contacto contacto){
        this.contactos.add(contacto);
    }

    // Eliminar un contacto.
    public void eliminarContacto(Contacto contacto){
        this.contactos.remove(contacto);
    }

    // Listar todos los contactos.
    public String devuelveContactos(){
        return this.contactos.toString();
    }

    // Actualizar el contacto seleccionado.
    public String actualizaContacto(Contacto contacto){
        for (Contacto con: this.contactos){
            if (this.devuelveBusqueda(contacto.getNombre()) != null && con.getNombre().equals(contacto.getNombre())){
                 con.setNombre(contacto.getNombre());
                 con.setApellidos(contacto.getApellidos());
                 con.setNumTelefono(contacto.getNumTelefono());
                System.out.println("Contacto actualizado correctamente.");
            }
            else{
                System.out.println("Ese contacto no se ha encontrado.");
            }
        }
        return contacto.toString();
    }
}
