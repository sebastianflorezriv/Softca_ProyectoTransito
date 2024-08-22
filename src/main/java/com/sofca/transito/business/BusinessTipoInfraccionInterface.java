package com.sofca.transito.business;

import com.sofca.transito.dto.TipoInfraccionDTO;

import java.util.List;
import java.util.Map;

public interface BusinessTipoInfraccionInterface {
    public void saveOrUpdate(TipoInfraccionDTO tipoInfraccionDTO) throws Exception;
    public TipoInfraccionDTO findById(TipoInfraccionDTO tipoInfraccionDTO) throws Exception;
    public void delete(TipoInfraccionDTO tipoInfraccionDTO) throws Exception;
    public List<Map<String, Object>> selectAll2() throws  Exception;
}
