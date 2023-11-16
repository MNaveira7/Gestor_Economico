package com.gestorEconomico.gestoreconomiafamiliar.shared.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class PrestamosDTO {

    private Integer idPrestamo;

    private UsuarioDTO usuario;

    private String descripcion;

    private BigDecimal cantidadTotal;

    private BigDecimal cantidadPendiente;

    private LocalDateTime fechaInicio;

    private LocalDateTime fechaFin;

    private LocalDateTime fechaAlta;

    private String usuarioAlta;

    private LocalDateTime fechaModificacion;

    private String usuarioModificacion;
}
