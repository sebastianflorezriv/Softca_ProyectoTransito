package com.sofca.transito.dto;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class AgenteDTO {
    private String nombre;
    private String cedula;
    private String telefono;
    private String correo;
    private String contraseñaAcceso;
    private String jurisdiccion;
    private String rango;
    private int numPlaca;
    private SecretariaDTO secretariaDTO;
}
