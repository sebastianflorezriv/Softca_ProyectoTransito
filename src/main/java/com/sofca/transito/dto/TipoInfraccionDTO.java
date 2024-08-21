package com.sofca.transito.dto;

import lombok.Getter;
import lombok.Setter;

@Setter @Getter
public class TipoInfraccionDTO {
    private String nombre;
    private int id;
    private String descripcion;
    private String normativa;

}
