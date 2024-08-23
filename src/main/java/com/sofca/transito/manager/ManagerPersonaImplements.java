package com.sofca.transito.manager;

import com.sofca.transito.dao.PersonaDaoInterface;
import com.sofca.transito.dto.PersonaDTO;
import com.sofca.transito.exceptions.DaoExceptions;
import com.sofca.transito.exceptions.ManagerExceptions;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Map;

@Component
public class ManagerPersonaImplements implements ManagerPersonaInterface {

    public PersonaDaoInterface personaDaoInterface;

    public ManagerPersonaImplements(PersonaDaoInterface personaDaoInterface){
        this.personaDaoInterface=personaDaoInterface;
    }

    public void saveOrUpdate(PersonaDTO personaDTO) throws ManagerExceptions {
        try {
            PersonaDTO personaFound = this.personaDaoInterface.findById(personaDTO);
            if(personaFound==null){
                this.personaDaoInterface.insert(personaDTO);
            }else{
                this.personaDaoInterface.update(personaDTO);
            }
        }catch (DaoExceptions ex){
            throw new ManagerExceptions(ex);
        }catch (Exception ex){
            throw new ManagerExceptions(ex);
        }

    }

    public PersonaDTO findById(PersonaDTO personaDTO) throws ManagerExceptions{
        PersonaDTO personaFound=null;
        try {
             personaFound = this.personaDaoInterface.findById(personaDTO);
        }catch (Exception ex){
            throw new ManagerExceptions(ex);
        }

        return personaFound;
    }

    @Override
    public void delete(PersonaDTO personaDTO) throws ManagerExceptions{
        try {
            this.personaDaoInterface.delete(personaDTO);
        }catch (DaoExceptions ex){
            throw new ManagerExceptions(ex);
        }catch (Exception ex){
            throw new ManagerExceptions(ex);
        }

    }

    @Override
    public List<Map<String, Object>> selectAll2() throws ManagerExceptions {
        try {
            return this.personaDaoInterface.selectAll2();
        }catch (DaoExceptions ex){
            throw new ManagerExceptions(ex);
        }catch (Exception ex){
            throw new ManagerExceptions(ex);
        }

    }

}
