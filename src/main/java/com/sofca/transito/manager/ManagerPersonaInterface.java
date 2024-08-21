package com.sofca.transito.manager;

import com.sofca.transito.dto.PersonaDTO;

public interface ManagerPersonaInterface {
    public void saveOrUpdate(PersonaDTO personaDTO);
    public PersonaDTO findById(PersonaDTO personaDTO);

}
