package com.sofca.transito.manager;


import com.sofca.transito.dto.TipoInfraccionDTO;

public interface ManageTipoInfraccionInterface {
    public void saveOrUpdate(TipoInfraccionDTO tipoInfraccionDTO);
    public TipoInfraccionDTO findById(TipoInfraccionDTO tipoInfraccionDTO);
}
