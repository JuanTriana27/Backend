package co.edu.usbcali.inmobiliaria.mapper;

import co.edu.usbcali.inmobiliaria.dto.EstadoPropiedadDTO;
import co.edu.usbcali.inmobiliaria.model.EstadoPropiedad;

public class EstadoPropiedadMapper {

    public static EstadoPropiedadDTO modelToDTO(EstadoPropiedad estadoPropiedad) {
        /*
        EstadoPropiedadDTO estadoPropiedadDTO = new EstadoPropiedadDTO();

        estadoPropiedadDTO.setNombre(estadoPropiedad.getNombre());
        estadoPropiedadDTO.setDescripcion(estadoPropiedad.getDescripcion());

        return estadoPropiedadDTO;*/

        return EstadoPropiedadDTO.builder()
                .nombre(estadoPropiedad.getNombre())
                .descripcion(estadoPropiedad.getDescripcion())
                .build();
    }
}