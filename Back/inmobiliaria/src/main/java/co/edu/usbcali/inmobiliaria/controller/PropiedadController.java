package co.edu.usbcali.inmobiliaria.controller;

import co.edu.usbcali.inmobiliaria.model.Propiedad;
import co.edu.usbcali.inmobiliaria.service.PropiedadService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

@RestController
@RequestMapping("propiedad")
@RequiredArgsConstructor
public class PropiedadController {
    // inyeccion
    private final PropiedadService propiedadService;

    @GetMapping("/todos")
    public List<Propiedad> obtenerTodasLasPropiedades(){
        return propiedadService.getAllPropiedad();
    }
}
