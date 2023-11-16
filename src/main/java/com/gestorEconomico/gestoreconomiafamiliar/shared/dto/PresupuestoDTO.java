package com.gestorEconomico.gestoreconomiafamiliar.shared.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class PresupuestoDTO {

    private Integer idPresupuesto;

    private UsuarioDTO usuario;

    private CategoriaDTO categoria;

    private BigDecimal cantidadLimite;

    private EstadoPresupuestosDTO estadoPresupuesto;

    private LocalDateTime fechaAlta;

    private String usuarioAlta;

    private LocalDateTime fechaModificacion;

    private String usuarioModificacion;
}
