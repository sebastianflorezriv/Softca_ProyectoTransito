package com.sofca.transito.mapper;

import com.sofca.transito.dto.*;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class InfraccionMapper  implements RowMapper<InfraccionDTO> {

    public InfraccionDTO mapRow(ResultSet resultSet, int i) throws SQLException {
        InfraccionDTO inf=new InfraccionDTO();
        PersonaDTO persona=new PersonaDTO();
        AgenteDTO agente=new AgenteDTO();
        TipoInfraccionDTO tipoInfraccion=new TipoInfraccionDTO();
        SecretariaDTO secretaria = new SecretariaDTO();

        inf.setId(resultSet.getString("idinfraccion"));
        inf.setFechaCoactiva(resultSet.getDate("fechacoactivo"));
        inf.setEstado(resultSet.getString("estado"));
        inf.setListaAbstencion(resultSet.getString("listaabstencion"));
        inf.setInteres(resultSet.getDouble("intereses"));
        inf.setTotal(resultSet.getDouble("total"));

        persona.setCedula(resultSet.getString("cedula"));
        persona.setNombre(resultSet.getString("nombre"));
        persona.setTelefono(resultSet.getString("telefono"));
        persona.setCorreo(resultSet.getString("correo"));
        persona.setPlacaVehicular(resultSet.getString("placavehicular"));

        agente.setCedula(resultSet.getString("cedula"));
        agente.setNombre(resultSet.getString("nombre"));
        agente.setCorreo(resultSet.getString("correo"));
        agente.setContraseñaAcceso(resultSet.getString("contrasenaacceso"));
        agente.setJurisdiccion(resultSet.getString("jurisdiccion"));
        agente.setRango(resultSet.getString("rangopolicial"));
        agente.setNumPlaca(resultSet.getString("numeroplaca"));

        secretaria.setIdSecretaria(resultSet.getString("idsecretaria"));
        secretaria.setCiudad(resultSet.getString("ciudad"));
        secretaria.setJurisdiccion(resultSet.getString("jurisdiccion"));

        agente.setSecretariaDTO(secretaria);

        tipoInfraccion.setId(resultSet.getString("id"));
        tipoInfraccion.setNombre(resultSet.getString("nombreinfraccion"));
        tipoInfraccion.setDescripcion(resultSet.getString("descripcion"));
        tipoInfraccion.setNormativa(resultSet.getString("normativa"));
        tipoInfraccion.setValor(resultSet.getString("valor"));

        inf.setPersona(persona);
        inf.setAgenteTransito(agente);
        inf.setInfraccion(tipoInfraccion);
        inf.setSecretariaTransito(secretaria);

        return inf;
    }
}
