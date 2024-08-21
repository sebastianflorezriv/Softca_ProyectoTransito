package com.sofca.transito.business;

import com.sofca.transito.dto.TipoInfraccionDTO;
import com.sofca.transito.manager.ManageTipoInfraccionInterface;

import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

@Component
@Transactional

public class BusinessTipoInfraccionImplement  implements  BusinessTipoInfraccionInterface{
    private ManageTipoInfraccionInterface manageTipoInfraccionInterface;
    public BusinessTipoInfraccionImplement(ManageTipoInfraccionInterface manageTipoInfraccionInterface){
        this.manageTipoInfraccionInterface= manageTipoInfraccionInterface;
    }

    @Override
    public void saveOrUpdate(TipoInfraccionDTO tipoInfraccionDTO) throws Exception {
        this.manageTipoInfraccionInterface.saveOrUpdate(tipoInfraccionDTO);
    }

    @Override
    public TipoInfraccionDTO findById(TipoInfraccionDTO tipoInfraccionDTO) throws Exception {
        return this.manageTipoInfraccionInterface.findById(tipoInfraccionDTO);
    }

    @Override
    public void delete(TipoInfraccionDTO tipoInfraccionDTO) throws Exception {
        this.manageTipoInfraccionInterface.delete(tipoInfraccionDTO);
    }


}
