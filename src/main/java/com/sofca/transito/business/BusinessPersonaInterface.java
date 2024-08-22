package com.sofca.transito.business;

import com.sofca.transito.dto.AgenteDTO;
import com.sofca.transito.dto.PersonaDTO;

import java.util.List;
import java.util.Map;

public interface BusinessPersonaInterface {
    public void saveOrUpdate(PersonaDTO personaDTO) throws Exception;
    public PersonaDTO findById(PersonaDTO personaDTO) throws Exception;
    public  void delete(PersonaDTO personaDTO)throws Exception;
    public List<Map<String, Object>> selectAll2() throws  Exception;
}
