package com.sofca.transito.manager;

import com.sofca.transito.dto.PersonaDTO;

import java.util.List;
import java.util.Map;

public interface ManagerPersonaInterface {
    public void saveOrUpdate(PersonaDTO personaDTO);
    public PersonaDTO findById(PersonaDTO personaDTO);
    public  void delete(PersonaDTO personaDTO);
    public List<Map<String, Object>> selectAll2();


}
