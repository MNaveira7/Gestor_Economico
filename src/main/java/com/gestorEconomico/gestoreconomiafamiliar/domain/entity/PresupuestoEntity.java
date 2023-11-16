package com.gestorEconomico.gestoreconomiafamiliar.domain.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Data
@Entity
@Table(name = "PRESUPUESTOS")
public class PresupuestoEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID_PRESUPUESTO")
    private Integer idPresupuesto;

    @NotNull
    @ManyToOne()
    @JoinColumn(name = "ID_USUARIO", nullable = false)
    private UsuarioEntity usuario;

    @NotNull
    @ManyToOne()
    @JoinColumn(name = "ID_CATEGORIA", nullable = false)
    private CategoriaEntity categoria;

    @NotNull
    @Column(name = "CANTIDAD_LIMITE", nullable = false, precision = 10, scale = 2)
    private BigDecimal cantidadLimite;

    @NotNull
    @ManyToOne()
    @JoinColumn(name = "ID_ESTADO_PRESUPUESTO", nullable = false)
    private EstadoPresupuestosEntity estadoPresupuesto;

    @Column(name = "FECHA_ALTA", nullable = false, updatable = false, columnDefinition = "TIMESTAMP DEFAULT CURRENT_TIMESTAMP")
    private LocalDateTime fechaAlta;

    @Column(name = "USUARIO_ALTA", length = 100)
    private String usuarioAlta;

    @Column(name = "FECHA_MODIFICACION")
    private LocalDateTime fechaModificacion;

    @Column(name = "USUARIO_MODIFICACION", length = 100)
    private String usuarioModificacion;
}
