package com.gestorEconomico.gestoreconomiafamiliar.shared.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class EstadoPresupuestosDTO implements Serializable {

    private Integer idEstadoPresupuesto;

    private String estado;
}
