package com.sofca.transito.dao;

import com.sofca.transito.dto.PersonaDTO;
import com.sofca.transito.dto.SecretariaDTO;

import java.util.List;
import java.util.Map;

public interface SecretariaDaoInterface {

    void insert(SecretariaDTO secretariaDTO);

    List<SecretariaDTO> selectAll();

    public List<Map<String,Object>> selectAll2();

    SecretariaDTO findById(SecretariaDTO secretariaDTO);

    void update(SecretariaDTO secretariaDTO);

    void delete(SecretariaDTO secretariaDTO);

}
