package com.sofca.transito.manager;

import com.sofca.transito.dao.PersonaDaoInterface;
import com.sofca.transito.dto.PersonaDTO;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Map;

@Component
public class ManagerPersonaImplements implements ManagerPersonaInterface {

    public PersonaDaoInterface personaDaoInterface;

    public ManagerPersonaImplements(PersonaDaoInterface personaDaoInterface){
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

    @Override
    public void delete(PersonaDTO personaDTO) {
        this.personaDaoInterface.delete(personaDTO);
    }

    @Override
    public List<Map<String, Object>> selectAll2() {
        return this.personaDaoInterface.selectAll2();
    }

}
