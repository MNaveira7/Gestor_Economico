package com.gestorEconomico.gestoreconomiafamiliar.domain.entity;

import jakarta.persistence.*;

import jakarta.validation.constraints.NotNull;
import lombok.Data;

import java.time.LocalDateTime;

@Data
@Entity
@Table(name = "USUARIOS")
public class UsuarioEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID_USUARIO")
    private Integer idUsuario;

    @NotNull
    @Column(name = "NOMBRE", nullable = false)
    private String nombre;

    @NotNull
    @Column(name = "EMAIL", unique = true, nullable = false)
    private String email;

    @NotNull
    @Column(name = "CONTRASEÑA", nullable = false)
    private String contraseña;

    @Column(name = "FECHA_ALTA", nullable = false, updatable = false, columnDefinition = "TIMESTAMP DEFAULT CURRENT_TIMESTAMP")
    private LocalDateTime fechaAlta;

    @Column(name = "USUARIO_ALTA")
    private String usuarioAlta;

    @Column(name = "FECHA_MODIFICACION")
    private LocalDateTime fechaModificacion;

    @Column(name = "USUARIO_MODIFICACION")
    private String usuarioModificacion;
}
