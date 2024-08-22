package com.sofca.transito.business;

import com.sofca.transito.dto.PersonaDTO;
import com.sofca.transito.dto.SecretariaDTO;

import java.util.List;
import java.util.Map;

public interface BusinessSecretariaInterface {
    public void saveOrUpdate(SecretariaDTO secretariaDTO) throws Exception;
    public SecretariaDTO findById(SecretariaDTO secretariaDTO) throws Exception;
    public  void delete(SecretariaDTO secretariaDTO)throws Exception;
    public List<Map<String, Object>> selectAll2() throws  Exception;
}
