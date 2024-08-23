package com.sofca.transito.dao;

import com.sofca.transito.dto.PersonaDTO;
import com.sofca.transito.exceptions.DaoExceptions;

import java.util.List;
import java.util.Map;

public interface PersonaDaoInterface {

    void insert(PersonaDTO personaDTO) throws DaoExceptions;
    List<PersonaDTO> selectAll()throws DaoExceptions;
    public List<Map<String,Object>> selectAll2()throws DaoExceptions;
    PersonaDTO findById(PersonaDTO personaDTO)throws DaoExceptions;
    void update(PersonaDTO personaDTO)throws DaoExceptions;
    void delete(PersonaDTO personaDTO)throws DaoExceptions;

}
