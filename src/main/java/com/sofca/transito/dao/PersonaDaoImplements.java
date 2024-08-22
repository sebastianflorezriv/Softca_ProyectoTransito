package com.sofca.transito.dao;

import com.sofca.transito.dto.PersonaDTO;
import com.sofca.transito.mapper.PersonaMapper;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import javax.sql.DataSource;
import java.util.List;
import java.util.Map;

@Repository
public class PersonaDaoImplements implements PersonaDaoInterface {
    private JdbcTemplate jdbcTemplate;

    public PersonaDaoImplements(DataSource dataSource){
        this.jdbcTemplate = new JdbcTemplate(dataSource);
    }
    @Override
    public void insert(PersonaDTO personaDTO) {

        String INSERT = "INSERT INTO personanatural(cedula,nombrepersona,telefono,correo,placavehicular) VALUES (?,?,?,?,?)";

        jdbcTemplate.update(INSERT,
                            personaDTO.getCedula(),
                            personaDTO.getNombre(),
                            personaDTO.getTelefono(),
                            personaDTO.getCorreo(),
                            personaDTO.getPlacaVehicular());


       return;
    }

    @Override
    public List<PersonaDTO> selectAll() {
        return null;
    }

    @Override
    public List<Map<String, Object>> selectAll2() {
        String SQL = " SELECT cedula,nombrepersona,telefono,correo,placavehicular FROM personanatural ";
        return jdbcTemplate.queryForList(SQL);
    }




    @Override
    public void update(PersonaDTO personaDTO) {

       String UPDATE = "UPDATE personanatural\\n\" +\n" +
        "                    \"SET nombrepersona=?,telefono=?,correo=?,placavehicular=?\\n\" +\n" +
        "                    \"WHERE cedula=?\"";

        jdbcTemplate.update(UPDATE,
                personaDTO.getNombre(),
                personaDTO.getTelefono(),
                personaDTO.getCorreo(),
                personaDTO.getPlacaVehicular(),
                personaDTO.getCedula());

            return;

        }


    @Override
    public PersonaDTO findById(PersonaDTO personaDTO) {

        try{
            String QUERY = "SELECT cedula,nombrepersona,telefono,correo,placavehicular FROM personanatural WHERE cedula=? ";
            return jdbcTemplate.queryForObject(QUERY, new PersonaMapper(),personaDTO.getCedula());
        }catch(EmptyResultDataAccessException ex){
            return null;
        }
    }




    @Override
    public void delete(PersonaDTO personaDTO) {

        String DELETE = "DELETE FROM personanatural WHERE cedula=?";

        jdbcTemplate.update(DELETE,   personaDTO.getCedula());

        return;

    }



}
