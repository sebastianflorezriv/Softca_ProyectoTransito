package com.sofca.transito.manager;

import com.sofca.transito.dto.AgenteDTO;

import java.util.List;
import java.util.Map;

public interface ManagerAgenteInterface {
    public void saveOrUpdate(AgenteDTO agenteDTO);
    public AgenteDTO findById(AgenteDTO agenteDTO);
    public  void delete(AgenteDTO agenteDTO);
    public List<Map<String, Object>> selectAll2();
}
