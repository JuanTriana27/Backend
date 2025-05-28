package co.edu.usbcali.inmobiliaria.controller;

import co.edu.usbcali.inmobiliaria.dto.PropiedadDTO;
import co.edu.usbcali.inmobiliaria.dto.request.CreatePropiedadRequest;
import co.edu.usbcali.inmobiliaria.dto.response.CreatePropiedadResponse;
import co.edu.usbcali.inmobiliaria.model.Propiedad;
import co.edu.usbcali.inmobiliaria.service.PropiedadService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("propiedad")
@RequiredArgsConstructor
public class PropiedadController {

    private final PropiedadService propiedadService;

    // Obtener todos los datos (GET)
    @GetMapping("/todos")
    public List<Propiedad> obtenerTodasLasPropiedades(){
        return propiedadService.getAllPropiedad();
    }

    // Obtener los datos por su ID (GET)
    @GetMapping("/buscar-por-id/{id}")
    public ResponseEntity<PropiedadDTO> buscarPorId(@PathVariable Integer id){
        PropiedadDTO propiedadDTO = propiedadService.getPropiedadPorId(id);

        return new ResponseEntity<>(propiedadDTO, HttpStatus.OK);
    }

    // Endpoint para crear propiedad (POST)
    @PostMapping("/guardar-nuevo")
    public ResponseEntity<CreatePropiedadResponse> guardarNuevo(@RequestBody CreatePropiedadRequest request) throws Exception {
        CreatePropiedadResponse response = propiedadService.createPropiedad(request);
        return new ResponseEntity<>(response, HttpStatus.CREATED);
    }
}