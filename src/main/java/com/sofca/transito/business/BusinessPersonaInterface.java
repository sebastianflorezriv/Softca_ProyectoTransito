package com.sofca.transito.business;

import com.sofca.transito.dto.PersonaDTO;

public interface BusinessPersonaInterface {
    public void saveOrUpdate(PersonaDTO personaDTO) throws Exception;
    public PersonaDTO findById(PersonaDTO personaDTO) throws Exception;
}
