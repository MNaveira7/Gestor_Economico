package com.gestorEconomico.gestoreconomiafamiliar.shared.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class MetasDTO  implements Serializable {

    private Integer idMeta;

    private UsuarioDTO usuario;

    private String descripcion;

    private BigDecimal cantidadObjetivo;

    private BigDecimal cantidadActual = BigDecimal.ZERO;

    private LocalDateTime fechaLimite;

    private EstadoMetasDTO estadoMeta;

    private LocalDateTime fechaAlta;

    private String usuarioAlta;

    private LocalDateTime fechaModificacion;

    private String usuarioModificacion;
}
