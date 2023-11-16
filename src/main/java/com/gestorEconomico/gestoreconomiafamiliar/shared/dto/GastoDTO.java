package com.gestorEconomico.gestoreconomiafamiliar.shared.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class GastoDTO implements Serializable {

    private Integer idGasto;

    private UsuarioDTO usuario;

    private CategoriaDTO categoria;

    private SubCategoriaDTO subcategoria;

    private String descripcion;

    private BigDecimal cantidad;

    private LocalDateTime fecha;

    private LocalDateTime fechaAlta;

    private String usuarioAlta;

    private LocalDateTime fechaModificacion;

    private String usuarioModificacion;
}
