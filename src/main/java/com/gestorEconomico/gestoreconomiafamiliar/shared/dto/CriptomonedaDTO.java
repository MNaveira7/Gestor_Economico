package com.gestorEconomico.gestoreconomiafamiliar.shared.dto;

import jakarta.persistence.Column;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class CriptomonedaDTO implements Serializable {

    private Integer idCriptomoneda;

    private String nombre;

    private String simbolo;

    private BigDecimal precioActual;

    private BigDecimal volumen24h;

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
