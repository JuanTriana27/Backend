package co.edu.usbcali.inmobiliaria.service;
import co.edu.usbcali.inmobiliaria.model.EstadoPropiedad;
import java.util.List;

public interface EstadoPropiedadService {
    List<EstadoPropiedad> getAllEstadoPropiedad();

    // Ottro metodo
    EstadoPropiedad getEstadoPropiedad(Integer id);
}