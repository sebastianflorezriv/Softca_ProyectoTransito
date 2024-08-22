package com.sofca.transito.manager;

import com.sofca.transito.dto.PersonaDTO;
import com.sofca.transito.dto.SecretariaDTO;

import java.util.List;
import java.util.Map;

public interface ManagerSecretariaInterface {
    public void saveOrUpdate(SecretariaDTO secretariaDTO);
    public SecretariaDTO findById(SecretariaDTO secretariaDTO);
    public  void delete(SecretariaDTO secretariaDTO);
    public List<Map<String, Object>> selectAll2();
}
