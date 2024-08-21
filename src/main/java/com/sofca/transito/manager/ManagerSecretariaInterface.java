package com.sofca.transito.manager;

import com.sofca.transito.dto.PersonaDTO;
import com.sofca.transito.dto.SecretariaDTO;

public interface ManagerSecretariaInterface {
    public void saveOrUpdate(SecretariaDTO secretariaDTO);
    public SecretariaDTO findById(SecretariaDTO secretariaDTO);
}
