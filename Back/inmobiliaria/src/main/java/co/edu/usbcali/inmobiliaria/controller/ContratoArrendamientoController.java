package co.edu.usbcali.inmobiliaria.controller;

import co.edu.usbcali.inmobiliaria.model.ContratoArrendamiento;
import co.edu.usbcali.inmobiliaria.service.ContratoArrendamientoService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("contrato-arrendamiento")
@RequiredArgsConstructor
public class ContratoArrendamientoController {
    // Inyeccion
    private final ContratoArrendamientoService contratoArrendamientoService;

    @GetMapping("/todos")
    public List<ContratoArrendamiento> obtenerTodosLosContratosArrendamiento() {
        return contratoArrendamientoService.getAllContratosArrendamiento();
    }
}
