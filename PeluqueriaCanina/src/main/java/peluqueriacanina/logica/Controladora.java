package peluqueriacanina.logica;

import java.util.List;
import peluqueriacanina.persistencia.ControladoraPersistencia;

public class Controladora {

    ControladoraPersistencia controlPersis = new ControladoraPersistencia();

    public void guardar(String nombreMaco, String raza, String color, String observacion, String nombredunio, String telefono, String alergico, String especial) {

        Duenio duenio = new Duenio();
        duenio.setNombre(nombredunio);
        duenio.setTelefono(telefono);

        Mascota masco = new Mascota();
        masco.setNombre(nombreMaco);
        masco.setRaza(raza);
        masco.setColor(color);
        masco.setAlergico(alergico);
        masco.setAtencion_especial(especial);
        masco.setObservaciones(observacion);
        masco.setUnDuenio(duenio);

        controlPersis.guardar(duenio, masco);

    }

    public List<Mascota> traerMascotas() {
        
        return controlPersis.traerMascotas ();
    }

    public void borrarMascota(int num_cliente) {
        
        controlPersis.borrarMascota(num_cliente);
        
    }

    public Mascota traerMascota(int num_cliente) {
        return controlPersis.traerMascota(num_cliente);
    }

    public void modificarMascota(Mascota masco, String nombreMaco, String raza, String color, String observacion, String nombredunio, String telefono, String alergico, String especial) {
       
       masco.setNombre(nombreMaco);
       masco.setRaza(raza);
       masco.setColor(color);
       masco.setObservaciones(observacion);
       masco.setAtencion_especial(especial);
       masco.setAlergico(alergico);
       
       //modifico la mascota
       controlPersis.modificarMascota(masco);
       
       //envío los nuevo valores del dueño.
       Duenio dueno = this.buscarDuenio(masco.getUnDuenio().getId_duenio());
       dueno.setTelefono(telefono);
       dueno.setNombre(nombredunio);
       
       //llamar al modificar dueño.
       this.modificarDuenio(dueno);
       
       
       
    }

    private Duenio buscarDuenio(int id_duenio) {
        
        return controlPersis.traerDuenio (id_duenio);
        
    }

    private void modificarDuenio(Duenio dueno) {
        controlPersis.modificarDuenio(dueno);
    }

    public void borrarDuenio(int num_cliente) {
       controlPersis.borrarDuenio(num_cliente);
    }

}
