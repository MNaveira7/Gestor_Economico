package com.gestorEconomico.gestoreconomiafamiliar.shared.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class SubCategoriaDTO implements Serializable {

    private Integer idSubcategoria;

    private CategoriaDTO categoria;

    private String nombre;
}
