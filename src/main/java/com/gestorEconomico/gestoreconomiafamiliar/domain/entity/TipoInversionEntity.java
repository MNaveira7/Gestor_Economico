package com.gestorEconomico.gestoreconomiafamiliar.domain.entity;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "TIPO_INVERSION")
public class TipoInversionEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID_TIPO_INVERSION")
    private Integer idTipoInversion;

    @Column(name = "NOMBRE_TIPO", nullable = false, length = 50)
    private String nombreTipo;

    @Column(name = "DESCRIPCION", length = 255)
    private String descripcion;
}
