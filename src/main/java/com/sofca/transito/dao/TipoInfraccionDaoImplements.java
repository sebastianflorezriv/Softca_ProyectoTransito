package com.sofca.transito.dao;

import com.sofca.transito.dto.PersonaDTO;
import com.sofca.transito.dto.TipoInfraccionDTO;
import com.sofca.transito.mapper.PersonaMapper;
import com.sofca.transito.mapper.TipoInfraccionMapper;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import javax.sql.DataSource;
import java.util.List;
import java.util.Map;
@Repository

@Repository
public class TipoInfraccionDaoImplements implements  TipoInfraccionDaoInterface {
    private JdbcTemplate jdbcTemplate;

    public TipoInfraccionDaoImplements(DataSource dataSource){
        this.jdbcTemplate = new JdbcTemplate(dataSource);
    }

    @Override
    public void insert(TipoInfraccionDTO tipoInfraccionDTO) {

        String INSERT = "INSERT INTO tiposinfracciones(id,nombreinfraccion,descripcion,normativa,valor) VALUES (?,?,?,?,?)";

        jdbcTemplate.update(INSERT,
                tipoInfraccionDTO.getId(),
                tipoInfraccionDTO.getNombre(),
                tipoInfraccionDTO.getDescripcion(),
                tipoInfraccionDTO.getNormativa(),
                tipoInfraccionDTO.getValor());


        return;
    }

    @Override
    public List<TipoInfraccionDTO> selectAll() {
        String SQL = "SELECT id,nombreinfraccion,descripcion,normativa,valor FROM tiposinfracciones";
        return jdbcTemplate.query(SQL, new TipoInfraccionMapper());
    }

    @Override
    public List<Map<String, Object>> selectAll2(TipoInfraccionDTO tipoInfraccionDTO) {
        String SQL = "SELECT id,nombreinfraccion,descripcion,normativa,valor FROM tiposinfracciones";
        return jdbcTemplate.queryForList(SQL);
    }

    @Override
    public TipoInfraccionDTO findById(TipoInfraccionDTO tipoInfraccionDTO) {
        try{
            String QUERY = "SELECT id,nombreinfraccion,descripcion,normativa,valor FROM tiposinfracciones WHERE id=? ";
            return jdbcTemplate.queryForObject(QUERY, new TipoInfraccionMapper(),tipoInfraccionDTO.getId());
        }catch(EmptyResultDataAccessException ex){
            return null;
        }
    }

    @Override
    public void update(TipoInfraccionDTO tipoInfraccionDTO) {
        String UPDATE = "UPDATE tiposinfracciones\\n\" +\n" +
                "                    \"SET nombreinfraccion=?,descripcion=?,normativa=?,valor=?\\n\" +\n" +
                "                    \"WHERE id=?\"";

        jdbcTemplate.update(UPDATE,
                tipoInfraccionDTO.getNombre(),
                tipoInfraccionDTO.getDescripcion(),
                tipoInfraccionDTO.getNormativa(),
                tipoInfraccionDTO.getValor(),
                tipoInfraccionDTO.getId());

        return;

    }

    @Override
    public void delete(TipoInfraccionDTO tipoInfraccionDTO) {
        String DELETE = "DELETE FROM tiposinfracciones WHERE id=?";

        jdbcTemplate.update(DELETE,   tipoInfraccionDTO.getId());

        return;

    }


}
