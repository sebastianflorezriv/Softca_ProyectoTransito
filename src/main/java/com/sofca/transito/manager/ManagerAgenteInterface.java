package com.sofca.transito.manager;

import com.sofca.transito.dto.AgenteDTO;

public interface ManagerAgenteInterface {
    public void saveOrUpdate(AgenteDTO agenteDTO);
    public AgenteDTO findById(AgenteDTO agenteDTO);
    public  void delete(AgenteDTO agenteDTO);
}
