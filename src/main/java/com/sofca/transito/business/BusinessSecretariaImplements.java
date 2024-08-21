package com.sofca.transito.business;

import com.sofca.transito.dto.PersonaDTO;
import com.sofca.transito.dto.SecretariaDTO;
import com.sofca.transito.manager.ManagerPersonaInterface;
import com.sofca.transito.manager.ManagerSecretariaInterface;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

@Component
@Transactional
public class BusinessSecretariaImplements implements BusinessSecretariaInterface {
    private ManagerSecretariaInterface managerSecretariaInterface;

    public BusinessSecretariaImplements(ManagerSecretariaInterface managerSecretariaInterface){
        this.managerSecretariaInterface=managerSecretariaInterface;
    }
    public void saveOrUpdate(SecretariaDTO secretariaDTO) throws Exception{
        this.managerSecretariaInterface.saveOrUpdate(secretariaDTO);
    }
    public SecretariaDTO findById(SecretariaDTO secretariaDTO) throws Exception{
        return this.managerSecretariaInterface.findById(secretariaDTO);
    }
}
