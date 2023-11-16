package com.gestorEconomico.gestoreconomiafamiliar.domain.entity;


import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "ESTADO_METAS")
public class EstadoMetasEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID_ESTADO_META")
    private Integer idEstadoMeta;

    @Column(name = "ESTADO", nullable = false, length = 50)
    private String estado;
}
