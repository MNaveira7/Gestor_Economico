package com.gestorEconomico.gestoreconomiafamiliar.shared.dto;

import jakarta.persistence.Column;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class TipoInversionDTO  implements Serializable {

    private Integer idTipoInversion;

    private String nombreTipo;

    private String descripcion;
}
