package com.sofca.transito.business;

import com.sofca.transito.dto.PersonaDTO;
import com.sofca.transito.manager.ManagerPersonaInterface;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

@Component
@Transactional
public class BusinessPersonaImplement implements BusinessPersonaInterface{
    private ManagerPersonaInterface managerPersonaInterface;

    public BusinessPersonaImplement(ManagerPersonaInterface managerPersonaInterface){
        this.managerPersonaInterface=managerPersonaInterface;
    }
    public void saveOrUpdate(PersonaDTO personaDTO) throws Exception{
        this.managerPersonaInterface.saveOrUpdate(personaDTO);
    }
    public PersonaDTO findById(PersonaDTO personaDTO) throws Exception{
        return this.managerPersonaInterface.findById(personaDTO);
    }
}
