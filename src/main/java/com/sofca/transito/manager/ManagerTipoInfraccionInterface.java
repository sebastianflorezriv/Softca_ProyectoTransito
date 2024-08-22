package com.sofca.transito.manager;


import com.sofca.transito.dto.TipoInfraccionDTO;

import java.util.List;
import java.util.Map;

public interface ManagerTipoInfraccionInterface {
    public void saveOrUpdate(TipoInfraccionDTO tipoInfraccionDTO);
    public TipoInfraccionDTO findById(TipoInfraccionDTO tipoInfraccionDTO);
    public void delete(TipoInfraccionDTO tipoInfraccionDTO);
    public List<Map<String, Object>> selectAll2();
}
