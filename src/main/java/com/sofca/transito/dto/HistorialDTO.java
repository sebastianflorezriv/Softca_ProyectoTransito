package com.sofca.transito.dto;

import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter @Setter
public class HistorialDTO {
    private int id;
    private PersonaDTO persona;
    private AgenteDTO agenteTransito;
    private TipoInfraccionDTO infraccion;
    private SecretariaDTO secretariaTransito;
    private Date fechaCoactiva;
    private double valor;
    private double interes;
    private double total;
    private String estado;
    private String listaAbstencion;
}
