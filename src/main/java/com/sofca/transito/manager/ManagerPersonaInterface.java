package com.sofca.transito.manager;

import com.sofca.transito.dto.PersonaDTO;
import com.sofca.transito.exceptions.ManagerExceptions;

import java.util.List;
import java.util.Map;

public interface ManagerPersonaInterface  {
    public void saveOrUpdate(PersonaDTO personaDTO) throws ManagerExceptions;
    public PersonaDTO findById(PersonaDTO personaDTO)throws ManagerExceptions;
    public  void delete(PersonaDTO personaDTO)throws ManagerExceptions;
    public List<Map<String, Object>> selectAll2()throws ManagerExceptions;


}
