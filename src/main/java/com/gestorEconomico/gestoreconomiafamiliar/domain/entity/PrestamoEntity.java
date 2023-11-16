package com.gestorEconomico.gestoreconomiafamiliar.domain.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Data
@Entity
@Table(name = "PRESTAMOS")
public class PrestamoEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID_PRESTAMO")
    private Integer idPrestamo;

    @NotNull
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ID_USUARIO", nullable = false)
    private UsuarioEntity usuario;

    @Column(name = "DESCRIPCION", length = 255)
    private String descripcion;

    @NotNull
    @Column(name = "CANTIDAD_TOTAL", nullable = false, precision = 10, scale = 2)
    private BigDecimal cantidadTotal;

    @NotNull
    @Column(name = "CANTIDAD_PENDIENTE", nullable = false, precision = 10, scale = 2)
    private BigDecimal cantidadPendiente;

    @Column(name = "FECHA_INICIO", nullable = false, updatable = false, columnDefinition = "TIMESTAMP DEFAULT CURRENT_TIMESTAMP")
    private LocalDateTime fechaInicio;

    @Column(name = "FECHA_FIN")
    private LocalDateTime fechaFin;

    @Column(name = "FECHA_ALTA", nullable = false, updatable = false, columnDefinition = "TIMESTAMP DEFAULT CURRENT_TIMESTAMP")
    private LocalDateTime fechaAlta;

    @Column(name = "USUARIO_ALTA", length = 100)
    private String usuarioAlta;

    @Column(name = "FECHA_MODIFICACION")
    private LocalDateTime fechaModificacion;

    @Column(name = "USUARIO_MODIFICACION", length = 100)
    private String usuarioModificacion;
}
