package com.sofca.transito.manager;

import com.sofca.transito.dto.AgenteDTO;
import com.sofca.transito.dto.InfraccionDTO;

public interface ManagerInfraccionInterface {
    public void saveOrUpdate(InfraccionDTO infraccionDTO);
    public InfraccionDTO findById(InfraccionDTO infraccionDTO);
}
