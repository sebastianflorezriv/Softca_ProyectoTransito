package com.sofca.transito.manager;

import com.sofca.transito.dao.AgenteDaoInterface;
import com.sofca.transito.dao.PersonaDaoInterface;
import com.sofca.transito.dto.AgenteDTO;
import com.sofca.transito.dto.PersonaDTO;
import org.springframework.stereotype.Component;

@Component
public class ManagerAgenteImplements implements ManagerAgenteInterface{
    public AgenteDaoInterface agenteDaoInterface;

    public ManagerAgenteImplements(AgenteDaoInterface agenteDaoInterface){
        this.agenteDaoInterface=agenteDaoInterface;
    }

    public void saveOrUpdate(AgenteDTO agenteDTO) {
        AgenteDTO agenteFound = this.agenteDaoInterface.findById(agenteDTO);
        if(agenteFound==null){
            this.agenteDaoInterface.insert(agenteDTO);
        }else{
            this.agenteDaoInterface.update(agenteDTO);
        }
    }

    public AgenteDTO findById(AgenteDTO agenteDTO) {
        AgenteDTO agenteFound = this.agenteDaoInterface.findById(agenteDTO);
        return agenteFound;
    }

    @Override
    public void delete(AgenteDTO agenteDTO) {
        this.agenteDaoInterface.delete(agenteDTO);
    }
}
