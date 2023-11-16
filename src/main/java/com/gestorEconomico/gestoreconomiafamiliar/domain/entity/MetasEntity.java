package com.gestorEconomico.gestoreconomiafamiliar.domain.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Data
@Entity
@Table(name = "METAS")
public class MetasEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID_META")
    private Integer idMeta;

    @NotNull
    @ManyToOne()
    @JoinColumn(name = "ID_USUARIO", nullable = false)
    private UsuarioEntity usuario;

    @Column(name = "DESCRIPCION", length = 255)
    private String descripcion;

    @NotNull
    @Column(name = "CANTIDAD_OBJETIVO", nullable = false, precision = 10, scale = 2)
    private BigDecimal cantidadObjetivo;

    @Column(name = "CANTIDAD_ACTUAL", nullable = false, precision = 10, scale = 2)
    private BigDecimal cantidadActual = BigDecimal.ZERO;

    @Column(name = "FECHA_LIMITE")
    private LocalDateTime fechaLimite;

    @NotNull
    @ManyToOne()
    @JoinColumn(name = "ID_ESTADO_META", nullable = false)
    private EstadoMetasEntity estadoMeta;

    @Column(name = "FECHA_ALTA", nullable = false, updatable = false, columnDefinition = "TIMESTAMP DEFAULT CURRENT_TIMESTAMP")
    private LocalDateTime fechaAlta;

    @Column(name = "USUARIO_ALTA", length = 100)
    private String usuarioAlta;

    @Column(name = "FECHA_MODIFICACION")
    private LocalDateTime fechaModificacion;

    @Column(name = "USUARIO_MODIFICACION", length = 100)
    private String usuarioModificacion;
}
