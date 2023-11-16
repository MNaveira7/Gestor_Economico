package com.gestorEconomico.gestoreconomiafamiliar.domain.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Data
@Entity
@Table(name = "GASTOS")
public class GastoEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID_GASTO")
    private Integer idGasto;

    @NotNull
    @ManyToOne()
    @JoinColumn(name = "ID_USUARIO", nullable = false)
    private UsuarioEntity usuario;

    @NotNull
    @ManyToOne()
    @JoinColumn(name = "ID_CATEGORIA", nullable = false)
    private CategoriaEntity categoria;

    @NotNull
    @ManyToOne()
    @JoinColumn(name = "ID_SUBCATEGORIA", nullable = false)
    private SubCategoriaEntity subcategoria;

    @Column(name = "DESCRIPCION")
    private String descripcion;

    @NotNull
    @Column(name = "CANTIDAD", nullable = false, precision = 10, scale = 2)
    private BigDecimal cantidad;

    @Column(name = "FECHA", nullable = false, updatable = false, columnDefinition = "TIMESTAMP DEFAULT CURRENT_TIMESTAMP")
    private LocalDateTime fecha;

    @Column(name = "FECHA_ALTA", nullable = false, updatable = false, columnDefinition = "TIMESTAMP DEFAULT CURRENT_TIMESTAMP")
    private LocalDateTime fechaAlta;

    @Column(name = "USUARIO_ALTA")
    private String usuarioAlta;

    @Column(name = "FECHA_MODIFICACION")
    private LocalDateTime fechaModificacion;

    @Column(name = "USUARIO_MODIFICACION")
    private String usuarioModificacion;
}