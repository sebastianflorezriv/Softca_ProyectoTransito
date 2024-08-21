package com.sofca.transito.mapper;

import com.sofca.transito.dto.PersonaDTO;
import com.sofca.transito.dto.SecretariaDTO;
import org.springframework.jdbc.core.RowMapper;

import javax.swing.tree.TreePath;
import java.sql.ResultSet;
import java.sql.SQLException;

public class SecretariaMapper implements RowMapper<SecretariaDTO> {

    @Override
    public SecretariaDTO mapRow(ResultSet resultSet, int i) throws SQLException {
        SecretariaDTO sec=new SecretariaDTO();
        sec.setIdSecretaria(resultSet.getString("idsecretaria"));
        sec.setCiudad(resultSet.getString("ciudad"));
        sec.setJurisdiccion(resultSet.getString("jurisdiccion"));
        return sec;
    }
}
