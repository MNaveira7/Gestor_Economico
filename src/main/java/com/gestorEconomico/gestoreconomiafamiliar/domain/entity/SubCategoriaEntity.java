package com.gestorEconomico.gestoreconomiafamiliar.domain.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

@Data
@Entity
@Table(name = "SUBCATEGORIAS")
public class SubCategoriaEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID_SUBCATEGORIA")
    private Integer idSubcategoria;

    @NotNull
    @ManyToOne()
    @JoinColumn(name = "ID_CATEGORIA", nullable = false)
    private CategoriaEntity  categoria;

    @NotNull
    @Column(name = "NOMBRE", nullable = false)
    private String nombre;
}
