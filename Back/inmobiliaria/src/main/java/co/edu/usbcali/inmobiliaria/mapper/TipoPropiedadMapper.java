package co.edu.usbcali.inmobiliaria.mapper;

import co.edu.usbcali.inmobiliaria.dto.TipoPropiedadDTO;
import co.edu.usbcali.inmobiliaria.model.TipoPropiedad;

public class TipoPropiedadMapper {

    public static TipoPropiedadDTO modelToDTO(TipoPropiedad TipoPropiedad) {

        return TipoPropiedadDTO.builder()
            .nombre(TipoPropiedad.getNombre())
            .descripcion(TipoPropiedad.getDescripcion())
            .build();
}
    private String nombre;
    private String descripcion;
}
