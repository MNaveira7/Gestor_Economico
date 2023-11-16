package com.gestorEconomico.gestoreconomiafamiliar.shared.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class AccionesDTO  implements Serializable {

    private Integer idAccion;

    private String nombre;

    private String simbolo;

    private BigDecimal precioActual;

    private BigDecimal volumen;

    private LocalDate fecha;

    private BigDecimal apertura;

    private BigDecimal cierre;

    private BigDecimal maximo;

    private BigDecimal minimo;

    private LocalDateTime fechaAlta;

    private String usuarioAlta;

    private LocalDateTime fechaModificacion;

    private String usuarioModificacion;
}
