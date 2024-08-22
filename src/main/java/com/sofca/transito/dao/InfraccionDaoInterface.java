package com.sofca.transito.dao;

import com.sofca.transito.dto.AgenteDTO;
import com.sofca.transito.dto.InfraccionDTO;

import java.util.List;
import java.util.Map;

public interface InfraccionDaoInterface {

    void insert(InfraccionDTO infraccionDTO);

    List<InfraccionDTO> selectAll();

    public List<Map<String,Object>> selectAll2(InfraccionDTO infraccionDTO);

    InfraccionDTO findById(InfraccionDTO infraccionDTO);

    void update(InfraccionDTO infraccionDTO);

    void delete(InfraccionDTO infraccionDTO);

}
