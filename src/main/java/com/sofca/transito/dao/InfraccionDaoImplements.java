package com.sofca.transito.dao;

import com.sofca.transito.dto.InfraccionDTO;
import com.sofca.transito.mapper.AgenteMapper;
import com.sofca.transito.mapper.InfraccionMapper;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import javax.sql.DataSource;
import java.util.List;
import java.util.Map;

@Repository
public class InfraccionDaoImplements implements InfraccionDaoInterface {

    private JdbcTemplate jdbcTemplate;

    public InfraccionDaoImplements(DataSource dataSource){
        this.jdbcTemplate = new JdbcTemplate(dataSource);
    }

    @Override
    public void insert(InfraccionDTO infraccionDTO) {

        String INSERT = "INSERT INTO infraccion" +
                "(idinfraccion, ccpersona, ccagente, idtipoinfraccion, codigosecretaria, fechacoactivo, estado, listaabstencion, intereses, total) " +
                "VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";

        jdbcTemplate.update(INSERT,
                infraccionDTO.getId(),
                infraccionDTO.getPersona().getCedula(),
                infraccionDTO.getAgenteTransito().getCedula(),
                infraccionDTO.getInfraccion(),
                infraccionDTO.getSecretariaTransito().getIdSecretaria(),
                infraccionDTO.getFechaCoactiva(),
                infraccionDTO.getEstado(),
                infraccionDTO.getListaAbstencion(),
                infraccionDTO.getInteres(),
                infraccionDTO.getTotal());

        return;
    }

    @Override
    public List<InfraccionDTO> selectAll() {
        return null;
    }

    @Override
    public List<Map<String, Object>> selectAll2(InfraccionDTO infraccionDTO) {
        return null;
    }

    @Override
    public InfraccionDTO findById(InfraccionDTO infraccionDTO) {

        try {
            String QUERY = "SELECT *\n" +
                    "FROM infraccion A \n" +
                    "INNER JOIN\n" +
                    "personanatural B ON A.ccpersona = B.cedula\n" +
                    "INNER JOIN\n" +
                    "agentetransito X ON A.ccagente = X.cedula\n" +
                    "INNER JOIN\n" +
                    "tiposinfracciones D ON A.idtipoinfraccion = D.id\n" +
                    "INNER JOIN\n" +
                    "secretariatransito E ON A.codigosecretaria = E.idsecretaria\n" +
                    "WHERE A.idinfraccion = ?";

            return jdbcTemplate.queryForObject(QUERY, new InfraccionMapper(), infraccionDTO.getId());

        }catch(EmptyResultDataAccessException ex){
            return null;
        }catch(Exception ex)    {
            ex.printStackTrace();
            return null;

        }

    }

    @Override
    public void update(InfraccionDTO infraccionDTO) {

    }

    @Override
    public void delete(InfraccionDTO infraccionDTO) {

    }
}
