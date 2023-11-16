package com.gestorEconomico.gestoreconomiafamiliar.shared.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class NotificacionesDTO implements Serializable {

    private Integer idNotificacion;

    private UsuarioDTO usuario;

    private String contenido;

    private LocalDateTime fecha;

    private EstadoNotificacionesDTO estadoNotificacion;
}
