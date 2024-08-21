package com.sofca.transito.mapper;

import com.sofca.transito.dto.PersonaDTO;
import com.sofca.transito.dto.TipoInfraccionDTO;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class TipoInfraccionMapper  implements RowMapper<TipoInfraccionDTO> {

    @Override
    public TipoInfraccionDTO mapRow(ResultSet resultSet, int rowNum) throws SQLException {
        TipoInfraccionDTO ti=new TipoInfraccionDTO();
        ti.setId(resultSet.getString("id"));
        ti.setNombre(resultSet.getString("nombreinfraccion"));
        ti.setDescripcion(resultSet.getString("descripcion"));
        ti.setNormativa(resultSet.getString("normativa"));
        ti.setValor(resultSet.getString("valor"));
        return ti;
    }
}
