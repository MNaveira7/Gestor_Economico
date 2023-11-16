package com.gestorEconomico.gestoreconomiafamiliar.shared.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class InversionDTO  implements Serializable {

    private Integer idInversion;

    private UsuarioDTO usuario;

    private TipoInversionDTO tipoInversion;

    private AccionesDTO accion;

    private DivisasDTO divisa;

    private CriptomonedaDTO criptomoneda;

    private BigDecimal cantidad;

    private BigDecimal rendimiento;

    private String descripcion;

    private LocalDateTime fecha;

    private LocalDateTime fechaAlta;

    private String usuarioAlta;

    private LocalDateTime fechaModificacion;

    private String usuarioModificacion;
}
