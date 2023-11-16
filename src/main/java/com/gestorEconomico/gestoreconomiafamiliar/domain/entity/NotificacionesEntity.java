package com.gestorEconomico.gestoreconomiafamiliar.domain.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDateTime;

@Data
@Entity
@Table(name = "NOTIFICACIONES")
public class NotificacionesEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID_NOTIFICACION")
    private Integer idNotificacion;

    @ManyToOne()
    @JoinColumn(name = "ID_USUARIO", nullable = false)
    private UsuarioEntity usuario;

    @Lob
    @Column(name = "CONTENIDO")
    private String contenido;

    @Column(name = "FECHA", nullable = false, columnDefinition = "TIMESTAMP DEFAULT CURRENT_TIMESTAMP")
    private LocalDateTime fecha;

    @ManyToOne()
    @JoinColumn(name = "ID_ESTADO_NOTIFICACION", nullable = false, columnDefinition = "int default 1")
    private EstadoNotificacionEntity estadoNotificacion;
}
