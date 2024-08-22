package com.sofca.transito.manager;

import com.sofca.transito.dao.AgenteDaoInterface;
import com.sofca.transito.dao.InfraccionDaoInterface;
import com.sofca.transito.dto.AgenteDTO;
import com.sofca.transito.dto.InfraccionDTO;
import org.springframework.stereotype.Component;

@Component
public class ManagerInfraccionImplements implements ManagerInfraccionInterface {

    public InfraccionDaoInterface infraccionDaoInterface;

    public ManagerInfraccionImplements(InfraccionDaoInterface infraccionDaoInterface){
        this.infraccionDaoInterface=infraccionDaoInterface;
    }

    public void saveOrUpdate(InfraccionDTO infraccionDTO) {
        InfraccionDTO infraccionFound = this.infraccionDaoInterface.findById(infraccionDTO);
        if(infraccionFound==null){
            this.infraccionDaoInterface.insert(infraccionDTO);
        }else{
            this.infraccionDaoInterface.update(infraccionDTO);
        }
    }

    public InfraccionDTO findById(InfraccionDTO infraccionDTO) {
        InfraccionDTO agenteFound = this.infraccionDaoInterface.findById(infraccionDTO);
        return agenteFound;
    }

}
