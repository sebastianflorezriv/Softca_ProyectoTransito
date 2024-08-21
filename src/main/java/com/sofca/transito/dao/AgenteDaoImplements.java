package com.sofca.transito.dao;

import com.sofca.transito.dto.AgenteDTO;
import com.sofca.transito.dto.PersonaDTO;
import org.springframework.jdbc.core.JdbcTemplate;

import javax.sql.DataSource;

public class AgenteDaoImplements {

    private JdbcTemplate jdbcTemplate;

    public AgenteDaoImplements(DataSource dataSource){
        this.jdbcTemplate = new JdbcTemplate(dataSource);
    }

    @Override
    public void insert(AgenteDTO agenteDTO) {

        String INSERT = "INSERT INTO agentetransito(cedula,nombre,correo,contrasenaacceso,jurisdiccion,rangopolicial,numeroplaca,idsecretaria) VALUES (?,?,?,?,?.?,?,?)";

        jdbcTemplate.update(INSERT,
                agenteDTO.getCedula(),
                agenteDTO.getNombre(),
                agenteDTO.getCorreo(),
                agenteDTO.getContraseñaAcceso(),
                agenteDTO.getJurisdiccion(),
                agenteDTO.getRango(),
                agenteDTO.getNumPlaca(),
                agenteDTO.getSecretariaDTO().getCodigoCiudad());

        return;
    }
}
