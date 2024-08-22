package com.sofca.transito.business;

import com.sofca.transito.dto.TipoInfraccionDTO;
import com.sofca.transito.manager.ManagerTipoInfraccionInterface;

import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Map;

@Component
@Transactional

public class BusinessTipoInfraccionImplement  implements  BusinessTipoInfraccionInterface{
    private ManagerTipoInfraccionInterface managerTipoInfraccionInterface;
    public BusinessTipoInfraccionImplement(ManagerTipoInfraccionInterface managerTipoInfraccionInterface){
        this.managerTipoInfraccionInterface = managerTipoInfraccionInterface;
    }

    @Override
    public void saveOrUpdate(TipoInfraccionDTO tipoInfraccionDTO) throws Exception {
        this.managerTipoInfraccionInterface.saveOrUpdate(tipoInfraccionDTO);
    }

    @Override
    public TipoInfraccionDTO findById(TipoInfraccionDTO tipoInfraccionDTO) throws Exception {
        return this.managerTipoInfraccionInterface.findById(tipoInfraccionDTO);
    }

    @Override
    public void delete(TipoInfraccionDTO tipoInfraccionDTO) throws Exception {
        this.managerTipoInfraccionInterface.delete(tipoInfraccionDTO);
    }

    @Override
    public List<Map<String, Object>> selectAll2() throws Exception {
        return this.managerTipoInfraccionInterface.selectAll2();
    }

}
