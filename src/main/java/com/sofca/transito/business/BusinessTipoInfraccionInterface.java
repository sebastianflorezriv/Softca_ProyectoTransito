package com.sofca.transito.business;

import com.sofca.transito.dto.TipoInfraccionDTO;

public interface BusinessTipoInfraccionInterface {
    public void saveOrUpdate(TipoInfraccionDTO tipoInfraccionDTO) throws Exception;
    public TipoInfraccionDTO findById(TipoInfraccionDTO tipoInfraccionDTO) throws Exception;
    public void delete(TipoInfraccionDTO tipoInfraccionDTO) throws Exception;

}
