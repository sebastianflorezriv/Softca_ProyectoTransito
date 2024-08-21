package com.sofca.transito.dao;

import com.sofca.transito.dto.AgenteDTO;
import com.sofca.transito.dto.PersonaDTO;
import com.sofca.transito.mapper.AgenteMapper;
import com.sofca.transito.mapper.PersonaMapper;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import javax.sql.DataSource;
import java.util.List;
import java.util.Map;

@Repository
public class AgenteDaoImplements implements AgenteDaoInterface {

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
                agenteDTO.getSecretariaDTO().getIdSecretaria());

        return;
    }

    @Override
    public List<AgenteDTO> selectAll() {
        return null;
    }

    @Override
    public List<Map<String, Object>> selectAll2(AgenteDTO agenteDTO) {
        return null;
    }

    @Override
    public AgenteDTO findById(AgenteDTO agenteDTO) {

        try{
            String QUERY = "\tSELECT  A.cedula,\n" +
                    "\t\t\tA.nombre,\n" +
                    "\t\t\tA.correo,\n" +
                    "\t\t\tA.contrasenaacceso,\n" +
                    "\t\t\tA.jurisdiccion,\n" +
                    "\t\t\tA.rangopolicial,\n" +
                    "\t\t\tA.numeroplaca,\n" +
                    "\t\t\tA.idsecretaria,\n" +
                    "\t\t\tB.ciudad,\n" +
                    "\t\t\tB.jurisdiccion\n" +
                    "\tFROM agentetransito A \n" +
                    "\t     INNER JOIN\n" +
                    "\t\t secretariatransito B ON A.idsecretaria=B.idsecretaria\n" +
                    "\tWHERE A.cedula=? ";


            return jdbcTemplate.queryForObject(QUERY, new AgenteMapper(),agenteDTO.getCedula());
        }catch(EmptyResultDataAccessException ex){
            return null;
        }
    }

    @Override
    public void update(AgenteDTO agenteDTO) {

        String UPDATE = "UPDATE agentetransito SET nombre=?,correo=?,contrasenaacceso=?,jurisdiccion=?,rangopolicial=?,numeroplaca=?,idsecretaria=? WHERE cedula=?";

        jdbcTemplate.update(UPDATE,
                agenteDTO.getNombre(),
                agenteDTO.getCorreo(),
                agenteDTO.getContraseñaAcceso(),
                agenteDTO.getJurisdiccion(),
                agenteDTO.getRango(),
                agenteDTO.getNumPlaca(),
                agenteDTO.getSecretariaDTO().getIdSecretaria(),
                agenteDTO.getCedula());

        return;
    }

    @Override
    public void delete(AgenteDTO agenteDTO) {

        String DELETE = "DELETE FROM agentetransito WHERE cedula=?";

        jdbcTemplate.update(DELETE, agenteDTO.getCedula());

        return;
    }
}
