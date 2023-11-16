package com.gestorEconomico.gestoreconomiafamiliar.domain.entity;

import jakarta.persistence.*;

import jakarta.validation.constraints.NotNull;
import lombok.Data;



import java.math.BigDecimal;
import java.time.LocalDateTime;

@Data
@Entity
@Table(name = "AHORROS")
public class AhorrosEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID_AHORRO")
    private Integer idAhorro;

    @NotNull
    @ManyToOne()
    @JoinColumn(name = "ID_USUARIO", nullable = false)
    private UsuarioEntity usuario;

    @NotNull
    @Column(name = "CANTIDAD", nullable = false, precision = 10, scale = 2)
    private BigDecimal cantidad;

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
