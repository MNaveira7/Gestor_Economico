package com.gestorEconomico.gestoreconomiafamiliar.domain.entity;

import jakarta.persistence.*;

import jakarta.validation.constraints.NotNull;
import lombok.Data;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Data
@Entity
@Table(name = "INVERSIONES")
public class InversionEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID_INVERSION")
    private Integer idInversion;

    @NotNull
    @ManyToOne()
    @JoinColumn(name = "ID_USUARIO", nullable = false)
    private UsuarioEntity usuario;

    @NotNull
    @ManyToOne()
    @JoinColumn(name = "ID_TIPO_INVERSION", nullable = false)
    private TipoInversionEntity tipoInversion;

    @ManyToOne()
    @JoinColumn(name = "ID_ACCION")
    private AccionesEntity accion;

    @ManyToOne()
    @JoinColumn(name = "ID_DIVISA")
    private DivisasEntity divisa;

    @ManyToOne()
    @JoinColumn(name = "ID_CRIPTOMONEDA")
    private CriptomonedaEntity criptomoneda;

    @NotNull
    @Column(name = "CANTIDAD", nullable = false, precision = 10, scale = 2)
    private BigDecimal cantidad;

    @Column(name = "RENDIMIENTO", precision = 10, scale = 2)
    private BigDecimal rendimiento;

    @Column(name = "DESCRIPCION", length = 255)
    private String descripcion;

    @Column(name = "FECHA", nullable = false, updatable = false, columnDefinition = "TIMESTAMP DEFAULT CURRENT_TIMESTAMP")
    private LocalDateTime fecha;

    @Column(name = "FECHA_ALTA", nullable = false, updatable = false, columnDefinition = "TIMESTAMP DEFAULT CURRENT_TIMESTAMP")
    private LocalDateTime fechaAlta;

    @Column(name = "USUARIO_ALTA", length = 100)
    private String usuarioAlta;

    @Column(name = "FECHA_MODIFICACION")
    private LocalDateTime fechaModificacion;

    @Column(name = "USUARIO_MODIFICACION", length = 100)
    private String usuarioModificacion;
}
