package com.sofca.transito.business;

import com.sofca.transito.dto.PersonaDTO;
import com.sofca.transito.exceptions.BusinessExceptions;
import com.sofca.transito.exceptions.ManagerExceptions;
import com.sofca.transito.manager.ManagerPersonaInterface;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Map;

@Component

public class BusinessPersonaImplements implements BusinessPersonaInterface{
    private ManagerPersonaInterface managerPersonaInterface;

    public BusinessPersonaImplements(ManagerPersonaInterface managerPersonaInterface){
        this.managerPersonaInterface=managerPersonaInterface;
    }
    @Transactional(propagation = Propagation.REQUIRED, rollbackFor = BusinessExceptions.class)
    public void saveOrUpdate(PersonaDTO personaDTO)throws BusinessExceptions {
        try {
            this.managerPersonaInterface.saveOrUpdate(personaDTO);
        }catch (ManagerExceptions ex){
            throw new BusinessExceptions(ex);
        }catch (Exception ex){
            throw new BusinessExceptions(ex);
        }

    }
    @Transactional(readOnly =true)
    public PersonaDTO findById(PersonaDTO personaDTO) throws BusinessExceptions{
        try {
            return this.managerPersonaInterface.findById(personaDTO);
        }catch (ManagerExceptions ex){
            throw new BusinessExceptions(ex);
        }catch (Exception ex){
            throw new BusinessExceptions(ex);
        }

    }

    @Override

    @Transactional(propagation = Propagation.REQUIRED, rollbackFor = BusinessExceptions.class)
    public void delete(PersonaDTO personaDTO) throws BusinessExceptions {
        try {
            this.managerPersonaInterface.delete(personaDTO);
        }catch (ManagerExceptions ex){
            throw new BusinessExceptions(ex);
        }catch (Exception ex){
            throw new BusinessExceptions(ex);
        }

    }

    @Override
    @Transactional(readOnly =true)
    public List<Map<String, Object>> selectAll2() throws BusinessExceptions {
        try {
            return this.managerPersonaInterface.selectAll2();
        }catch (ManagerExceptions ex){
            throw  new BusinessExceptions(ex);
        }catch (Exception ex){
            throw new BusinessExceptions(ex);
        }

    }
}
