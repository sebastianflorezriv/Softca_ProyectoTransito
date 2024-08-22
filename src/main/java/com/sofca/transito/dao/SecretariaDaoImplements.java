package com.sofca.transito.dao;

import com.sofca.transito.dto.SecretariaDTO;
import com.sofca.transito.mapper.PersonaMapper;
import com.sofca.transito.mapper.SecretariaMapper;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import javax.sql.DataSource;
import java.util.List;
import java.util.Map;

@Repository
public class SecretariaDaoImplements implements SecretariaDaoInterface {

    private JdbcTemplate jdbcTemplate;

    public SecretariaDaoImplements(DataSource dataSource){
        this.jdbcTemplate = new JdbcTemplate(dataSource);
    }

    @Override
    public void insert(SecretariaDTO secretariaDTO) {

        String INSERT = "INSERT INTO secretariatransito(idsecretaria,ciudad,jurisdiccion) VALUES (?,?,?)";

        jdbcTemplate.update(INSERT,
                secretariaDTO.getIdSecretaria(),
                secretariaDTO.getCiudad(),
                secretariaDTO.getJurisdiccion());

        return;
    }

    @Override
    public List<SecretariaDTO> selectAll() {
        String SQL = "SELECT idsecretaria,ciudad,jurisdiccion FROM secretariatransito";
        return jdbcTemplate.query(SQL, new SecretariaMapper());
    }

    @Override
    public List<Map<String, Object>> selectAll2() {
        String SQL = "SELECT idsecretaria,ciudad,jurisdiccion FROM secretariatransito";
        return jdbcTemplate.queryForList(SQL);
    }

    @Override
    public SecretariaDTO findById(SecretariaDTO secretariaDTO) {
        try{
            String QUERY = "SELECT idsecretaria,ciudad,jurisdiccion FROM secretariatransito WHERE idsecretaria=?";
            System.out.println(secretariaDTO.getIdSecretaria());
            return jdbcTemplate.queryForObject(QUERY, new SecretariaMapper(),secretariaDTO.getIdSecretaria());
        }catch(EmptyResultDataAccessException ex){
            return null;
        }
    }

    @Override
    public void update(SecretariaDTO secretariaDTO) {

        String UPDATE = "UPDATE secretariatransito\\n\" +\n" +
                "                    \"SET idsecretaria=?,ciudad=?,jurisdiccion=?\\n\" +\n" +
                "                    \"WHERE idsecretaria=?\"";

        jdbcTemplate.update(UPDATE,
                secretariaDTO.getIdSecretaria(),
                secretariaDTO.getCiudad(),
                secretariaDTO.getJurisdiccion());

        return;

    }

    @Override
    public void delete(SecretariaDTO secretariaDTO) {

        String DELETE = "DELETE FROM secretariatransito WHERE idsecretaria=?";

        jdbcTemplate.update(DELETE, secretariaDTO.getIdSecretaria());

        return;


    }
}
