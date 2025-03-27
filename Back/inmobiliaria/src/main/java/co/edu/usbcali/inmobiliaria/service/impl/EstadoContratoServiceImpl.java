package co.edu.usbcali.inmobiliaria.service.impl;

import co.edu.usbcali.inmobiliaria.model.EstadoContrato;
import co.edu.usbcali.inmobiliaria.repository.EstadoContratoRepository;
import co.edu.usbcali.inmobiliaria.service.EstadoContratoService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
@RequiredArgsConstructor
public class EstadoContratoServiceImpl implements EstadoContratoService {

    private final EstadoContratoRepository estadoContratoRepository;

    @Override
    public List<EstadoContrato> getAllEstadosContrato() {
        List<EstadoContrato> estadosContrato = estadoContratoRepository.findAll();
        return estadosContrato;
    }
}
