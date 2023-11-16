package com.gestorEconomico.gestoreconomiafamiliar.shared.dto;

import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class UsuarioDTO  implements Serializable {

    private Integer idUsuario;

    private String nombre;

    private String email;

    private String contraseña;

    private LocalDateTime fechaAlta;

    private String usuarioAlta;

    private LocalDateTime fechaModificacion;

    private String usuarioModificacion;
}
