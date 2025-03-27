package co.edu.usbcali.inmobiliaria.service.impl;

import co.edu.usbcali.inmobiliaria.model.ContratoArrendamiento;
import co.edu.usbcali.inmobiliaria.repository.ContratoArrendamientoRepository;
import co.edu.usbcali.inmobiliaria.service.ContratoArrendamientoService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
@RequiredArgsConstructor
public class ContratoArrendamientoServiceImpl implements ContratoArrendamientoService {

    private final ContratoArrendamientoRepository contratoArrendamientoRepository;

    @Override
    public List<ContratoArrendamiento> getAllContratosArrendamiento() {
        List<ContratoArrendamiento> contratoArrendamientos = contratoArrendamientoRepository.findAll();
        return contratoArrendamientos;
    }
}
