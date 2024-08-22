package com.sofca.transito.business;

import com.sofca.transito.dto.AgenteDTO;
import com.sofca.transito.dto.InfraccionDTO;
import com.sofca.transito.manager.ManagerAgenteInterface;
import com.sofca.transito.manager.ManagerInfraccionInterface;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

@Component
@Transactional
public class BusinessInfraccionImplements implements BusinessInfraccionInterface {
    private ManagerInfraccionInterface managerInfraccionInterface;

    public BusinessInfraccionImplements(ManagerInfraccionInterface managerInfraccionInterface){
        this.managerInfraccionInterface=managerInfraccionInterface;
    }
    public void saveOrUpdate(InfraccionDTO infraccionDTO) throws Exception{
        this.managerInfraccionInterface.saveOrUpdate(infraccionDTO);
    }
    public InfraccionDTO findById(InfraccionDTO infraccionDTO) throws Exception{
        return this.managerInfraccionInterface.findById(infraccionDTO);
    }
}

