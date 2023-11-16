package com.gestorEconomico.gestoreconomiafamiliar.domain.entity;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "ESTADO_PRESUPUESTOS")
public class EstadoPresupuestosEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID_ESTADO_PRESUPUESTO")
    private Integer idEstadoPresupuesto;

    @Column(name = "ESTADO", nullable = false, length = 50)
    private String estado;
}
