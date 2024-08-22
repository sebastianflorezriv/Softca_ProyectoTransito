package com.sofca.transito.dao;

import com.sofca.transito.dto.PersonaDTO;

import java.util.List;
import java.util.Map;

public interface PersonaDaoInterface {

    void insert(PersonaDTO personaDTO);
    List<PersonaDTO> selectAll();
    public List<Map<String,Object>> selectAll2();
    PersonaDTO findById(PersonaDTO personaDTO);
    void update(PersonaDTO personaDTO);
    void delete(PersonaDTO personaDTO);

}
