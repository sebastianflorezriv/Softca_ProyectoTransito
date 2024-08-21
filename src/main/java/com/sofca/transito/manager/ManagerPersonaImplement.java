package com.sofca.transito.manager;

import com.sofca.transito.dao.PersonaDaoInterface;
import com.sofca.transito.dto.PersonaDTO;
import org.springframework.stereotype.Component;

@Component
public class ManagerPersonaImplement implements ManagerPersonaInterface {

    public PersonaDaoInterface personaDaoInterface;

    public ManagerPersonaImplement(PersonaDaoInterface personaDaoInterface){
        this.personaDaoInterface=personaDaoInterface;
    }

    public void saveOrUpdate(PersonaDTO personaDTO) {
        PersonaDTO personaFound = this.personaDaoInterface.findById(personaDTO);
        if(personaFound==null){
            this.personaDaoInterface.insert(personaDTO);
        }else{
            this.personaDaoInterface.update(personaDTO);
        }
    }

    public PersonaDTO findById(PersonaDTO personaDTO) {
        PersonaDTO personaFound = this.personaDaoInterface.findById(personaDTO);
        return personaFound;
    }

}
