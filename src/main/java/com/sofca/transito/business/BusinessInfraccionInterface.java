package com.sofca.transito.business;

import com.sofca.transito.dto.AgenteDTO;
import com.sofca.transito.dto.InfraccionDTO;

public interface BusinessInfraccionInterface {
    public void saveOrUpdate(InfraccionDTO infraccionDTO) throws Exception;
    public InfraccionDTO findById(InfraccionDTO infraccionDTO) throws Exception;
}
