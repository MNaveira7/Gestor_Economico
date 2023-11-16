package com.gestorEconomico.gestoreconomiafamiliar.shared.dto;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;

public class DivisasDTO  implements Serializable {

    private Integer idDivisa;

    private String pair;

    private BigDecimal precioActual;

    private LocalDate fecha;

    private BigDecimal apertura;

    private BigDecimal cierre;

    private BigDecimal maximo;

    private BigDecimal minimo;

    private LocalDateTime fechaAlta;

    private String usuarioAlta;

    private LocalDateTime fechaModificacion;

    private String usuarioModificacion;

}
