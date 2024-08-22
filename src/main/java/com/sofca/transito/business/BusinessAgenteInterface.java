package com.sofca.transito.business;

import com.sofca.transito.dto.AgenteDTO;
import com.sofca.transito.dto.PersonaDTO;

import java.util.List;
import java.util.Map;

public interface BusinessAgenteInterface {
    public void saveOrUpdate(AgenteDTO agenteDTO) throws Exception;
    public AgenteDTO findById(AgenteDTO agenteDTO) throws Exception;
    public  void delete(AgenteDTO agenteDTO)throws Exception;
    public List<Map<String, Object>> selectAll2() throws  Exception;
}
