package com.gestorEconomico.gestoreconomiafamiliar.domain.entity;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "ESTADO_NOTIFICACIONES")
public class EstadoNotificacionEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID_ESTADO_NOTIFICACION")
    private Integer idEstadoNotificacion;

    @Column(name = "ESTADO", nullable = false, length = 50)
    private String estado;
}
