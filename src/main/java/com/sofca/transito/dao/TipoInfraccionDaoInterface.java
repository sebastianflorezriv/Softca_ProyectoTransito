package com.sofca.transito.dao;


import com.sofca.transito.dto.TipoInfraccionDTO;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

public interface TipoInfraccionDaoInterface {
    void insert(TipoInfraccionDTO tipoInfraccionDTO);
    List<TipoInfraccionDTO> selectAll();
    public List<Map<String,Object>> selectAll2();
    TipoInfraccionDTO findById(TipoInfraccionDTO tipoInfraccionDTO);
    void update(TipoInfraccionDTO tipoInfraccionDTO);
    void delete(TipoInfraccionDTO tipoInfraccionDTO);
}
