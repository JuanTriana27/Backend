package co.edu.usbcali.inmobiliaria.controller;

import co.edu.usbcali.inmobiliaria.model.EstadoContrato;
import co.edu.usbcali.inmobiliaria.service.EstadoContratoService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("estado-contrato")
@RequiredArgsConstructor
public class EstadoContratoController {
    // Inyeccion
    private final EstadoContratoService estadoContratoService;

    @GetMapping("/todos")
    public List<EstadoContrato> obtenerTodosLosEstadosContratos(){
        return estadoContratoService.getAllEstadosContrato();
    }
}