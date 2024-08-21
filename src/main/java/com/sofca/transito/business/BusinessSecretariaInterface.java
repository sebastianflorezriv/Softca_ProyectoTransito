package com.sofca.transito.business;

import com.sofca.transito.dto.PersonaDTO;
import com.sofca.transito.dto.SecretariaDTO;

public interface BusinessSecretariaInterface {
    public void saveOrUpdate(SecretariaDTO secretariaDTO) throws Exception;
    public SecretariaDTO findById(SecretariaDTO secretariaDTO) throws Exception;
}
