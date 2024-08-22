package com.sofca.transito.dao;

import com.sofca.transito.dto.AgenteDTO;
import com.sofca.transito.dto.PersonaDTO;

import java.util.List;
import java.util.Map;

public interface AgenteDaoInterface {

    void insert(AgenteDTO agenteDTO);
    List<AgenteDTO> selectAll();
    public List<Map<String,Object>> selectAll2();
    AgenteDTO findById(AgenteDTO agenteDTO);
    void update(AgenteDTO agenteDTO);
    void delete(AgenteDTO agenteDTO);

}
