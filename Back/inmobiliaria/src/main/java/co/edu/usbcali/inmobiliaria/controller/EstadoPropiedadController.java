package co.edu.usbcali.inmobiliaria.controller;

import co.edu.usbcali.inmobiliaria.dto.EstadoPropiedadDTO;
import co.edu.usbcali.inmobiliaria.model.EstadoPropiedad;
import co.edu.usbcali.inmobiliaria.service.EstadoPropiedadService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

@RestController
@RequestMapping("estado-propiedad")
@RequiredArgsConstructor
public class EstadoPropiedadController {
    // Inyeccion
    private final EstadoPropiedadService estadoPropiedadService;

    @GetMapping("/todos")
    public List<EstadoPropiedad> obtenerTodosLosEstadosPropiedad(){
        return estadoPropiedadService.getAllEstadoPropiedad();
    }

    @GetMapping("/buscar-por-id/{id}")
    public ResponseEntity<EstadoPropiedadDTO> buscarPorId(@PathVariable Integer id){
        EstadoPropiedadDTO estadoPropiedadDTO = estadoPropiedadService.getEstadoPropiedadPorId(id);

        return new ResponseEntity<>(estadoPropiedadDTO, HttpStatus.OK);
    }
}