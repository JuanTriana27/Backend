package co.edu.usbcali.inmobiliaria.controller;

import co.edu.usbcali.inmobiliaria.model.VentaPropiedad;
import co.edu.usbcali.inmobiliaria.service.VentaPropiedadService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

@RestController
@RequestMapping("venta-propiedad")
@RequiredArgsConstructor
public class VentaPropiedadController {
    // Inyeccion de dependencias
    private final VentaPropiedadService ventaPropiedadService;

    @GetMapping("/todos")
    public List<VentaPropiedad> obtenerTodasLasVentasPropiedad(){
        return ventaPropiedadService.getAllVentasPropiedad();
    }
}
