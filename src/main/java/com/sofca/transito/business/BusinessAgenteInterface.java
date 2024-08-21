package com.sofca.transito.business;

import com.sofca.transito.dto.AgenteDTO;
import com.sofca.transito.dto.PersonaDTO;

public interface BusinessAgenteInterface {
    public void saveOrUpdate(AgenteDTO agenteDTO) throws Exception;
    public AgenteDTO findById(AgenteDTO agenteDTO) throws Exception;
}
