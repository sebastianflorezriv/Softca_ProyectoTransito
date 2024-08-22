package com.sofca.transito.business;

import com.sofca.transito.dto.AgenteDTO;
import com.sofca.transito.dto.PersonaDTO;
import com.sofca.transito.manager.ManagerAgenteInterface;
import com.sofca.transito.manager.ManagerPersonaInterface;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Map;

@Component
@Transactional
public class BusinessAgenteImplements implements BusinessAgenteInterface {
    private ManagerAgenteInterface managerAgenteInterface;

    public BusinessAgenteImplements(ManagerAgenteInterface managerAgenteInterface){
        this.managerAgenteInterface=managerAgenteInterface;
    }
    public void saveOrUpdate(AgenteDTO agenteDTO) throws Exception{
        this.managerAgenteInterface.saveOrUpdate(agenteDTO);
    }
    public AgenteDTO findById(AgenteDTO agenteDTO) throws Exception{
        return this.managerAgenteInterface.findById(agenteDTO);
    }

    @Override
    public void delete(AgenteDTO agenteDTO) throws Exception {
        this.managerAgenteInterface.delete(agenteDTO);
    }

    @Override
    public List<Map<String, Object>> selectAll2() throws Exception {
        return this.managerAgenteInterface.selectAll2();
    }
}
