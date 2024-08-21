package com.sofca.transito.manager;

import com.sofca.transito.dao.PersonaDaoInterface;
import com.sofca.transito.dao.SecretariaDaoInterface;
import com.sofca.transito.dto.PersonaDTO;
import com.sofca.transito.dto.SecretariaDTO;
import org.springframework.stereotype.Component;

@Component
public class ManagerSecretariaImplements implements ManagerSecretariaInterface {

    public SecretariaDaoInterface secretariaDaoInterface;

    public ManagerSecretariaImplements(SecretariaDaoInterface secretariaDaoInterface){
        this.secretariaDaoInterface=secretariaDaoInterface;
    }

    public void saveOrUpdate(SecretariaDTO secretariaDTO) {
        SecretariaDTO secretariaFound = this.secretariaDaoInterface.findById(secretariaDTO);
        if(secretariaFound==null){
            this.secretariaDaoInterface.insert(secretariaDTO);
        }else{
            this.secretariaDaoInterface.update(secretariaDTO);
        }
    }

    public SecretariaDTO findById(SecretariaDTO secretariaDTO) {
        SecretariaDTO secretariaFound = this.secretariaDaoInterface.findById(secretariaDTO);
        return secretariaFound;
    }
}
