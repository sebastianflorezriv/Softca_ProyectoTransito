package com.sofca.transito.mapper;

import com.sofca.transito.dto.PersonaDTO;
import org.springframework.jdbc.core.RowMapper;


import java.sql.ResultSet;
import java.sql.SQLException;


public class PersonaMapper implements RowMapper<PersonaDTO> {

    @Override
    public PersonaDTO mapRow(ResultSet resultSet, int i) throws SQLException {
        PersonaDTO per=new PersonaDTO();
        per.setCedula(resultSet.getString("cedula"));
        per.setNombre(resultSet.getString("nombrepersona"));
        per.setTelefono(resultSet.getString("telefono"));
        per.setCorreo(resultSet.getString("correo"));
        per.setPlacaVehicular(resultSet.getString("placavehicular"));
        return per;
   }


}
