package com.sofca.transito.business;

import com.sofca.transito.dto.AgenteDTO;
import com.sofca.transito.dto.PersonaDTO;
import com.sofca.transito.exceptions.BusinessExceptions;

import java.util.List;
import java.util.Map;

public interface BusinessPersonaInterface {
    public void saveOrUpdate(PersonaDTO personaDTO) throws BusinessExceptions;
    public PersonaDTO findById(PersonaDTO personaDTO) throws BusinessExceptions;
    public  void delete(PersonaDTO personaDTO)throws BusinessExceptions;
    public List<Map<String, Object>> selectAll2() throws BusinessExceptions;
}
