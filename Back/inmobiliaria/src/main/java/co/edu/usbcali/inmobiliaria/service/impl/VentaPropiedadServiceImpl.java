package co.edu.usbcali.inmobiliaria.service.impl;

import co.edu.usbcali.inmobiliaria.model.VentaPropiedad;
import co.edu.usbcali.inmobiliaria.repository.VentaPropiedadRepository;
import co.edu.usbcali.inmobiliaria.service.VentaPropiedadService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
@RequiredArgsConstructor
public class VentaPropiedadServiceImpl implements VentaPropiedadService {

    private final VentaPropiedadRepository ventaPropiedadRepository;

    @Override
    public List<VentaPropiedad> getAllVentasPropiedad() {
        // Implementacion de este

        // se inicializa la lista de tipos de propiedades
        // se usa el metodo findAll del repository
        // para ir a la base de datos y traer todos los tipos de propiedad
        List<VentaPropiedad> ventasPropiedad = ventaPropiedadRepository.findAll();
        return ventasPropiedad;
    }
}