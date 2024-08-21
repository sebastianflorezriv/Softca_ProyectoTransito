package com.sofca.transito.mapper;

import com.sofca.transito.business.BusinessSecretariaImplements;
import com.sofca.transito.business.BusinessTipoInfraccionImplement;
import com.sofca.transito.dao.SecretariaDaoImplements;
import com.sofca.transito.dao.SecretariaDaoInterface;
import com.sofca.transito.dto.AgenteDTO;
import com.sofca.transito.dto.PersonaDTO;
import com.sofca.transito.dto.SecretariaDTO;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class AgenteMapper  implements RowMapper<AgenteDTO> {

    @Override
    public AgenteDTO mapRow(ResultSet resultSet, int i) throws SQLException {
        AgenteDTO agt=new AgenteDTO();
        SecretariaDTO secretaria = new SecretariaDTO();

        agt.setCedula(resultSet.getString("cedula"));
        agt.setNombre(resultSet.getString("nombre"));
        agt.setCorreo(resultSet.getString("correo"));
        agt.setContraseñaAcceso(resultSet.getString("contrasenaacceso"));
        agt.setJurisdiccion(resultSet.getString("jurisdiccion"));
        agt.setRango(resultSet.getString("rangopolicial"));
        agt.setNumPlaca(resultSet.getString("numeroplaca"));
        secretaria.setIdSecretaria(resultSet.getString("idsecretaria"));
        secretaria.setCiudad(resultSet.getString("ciudad"));
        secretaria.setJurisdiccion(resultSet.getString("jurisdiccion"));
        agt.setSecretariaDTO(secretaria);

        return agt;
    }
}
