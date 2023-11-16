package com.gestorEconomico.gestoreconomiafamiliar.domain.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.Data;


import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;

@Data
@Entity
@Table(name = "ACCIONES")
public class AccionesEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID_ACCION")
    private Integer idAccion;

    @Column(name = "NOMBRE", nullable = false, length = 100)
    private String nombre;

    @Column(name = "SIMBOLO", nullable = false, length = 10)
    private String simbolo;

    @NotNull
    @Column(name = "PRECIO_ACTUAL", nullable = false, precision = 15, scale = 2)
    private BigDecimal precioActual;

    @NotNull
    @Column(name = "VOLUMEN", nullable = false, precision = 15, scale = 2)
    private BigDecimal volumen;

    @NotNull
    @Column(name = "FECHA", nullable = false)
    private LocalDate fecha;

    @NotNull
    @Column(name = "APERTURA", nullable = false, precision = 15, scale = 2)
    private BigDecimal apertura;

    @NotNull
    @Column(name = "CIERRE", nullable = false, precision = 15, scale = 2)
    private BigDecimal cierre;

    @NotNull
    @Column(name = "MAXIMO", nullable = false, precision = 15, scale = 2)
    private BigDecimal maximo;

    @NotNull
    @Column(name = "MINIMO", nullable = false, precision = 15, scale = 2)
    private BigDecimal minimo;

    @Column(name = "FECHA_ALTA", nullable = false, updatable = false, columnDefinition = "TIMESTAMP DEFAULT CURRENT_TIMESTAMP")
    private LocalDateTime fechaAlta;

    @Column(name = "USUARIO_ALTA", length = 100)
    private String usuarioAlta;

    @Column(name = "FECHA_MODIFICACION")
    private LocalDateTime fechaModificacion;

    @Column(name = "USUARIO_MODIFICACION", length = 100)
    private String usuarioModificacion;
}
