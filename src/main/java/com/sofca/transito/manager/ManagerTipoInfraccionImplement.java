package com.sofca.transito.manager;



import com.sofca.transito.dao.TipoInfraccionDaoInterface;

import com.sofca.transito.dto.TipoInfraccionDTO;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Map;

@Component
public class ManagerTipoInfraccionImplement implements ManagerTipoInfraccionInterface {
    public TipoInfraccionDaoInterface tipoInfraccionDaoInterface;
    public ManagerTipoInfraccionImplement(TipoInfraccionDaoInterface tipoInfraccionDaoInterface){
        this.tipoInfraccionDaoInterface=tipoInfraccionDaoInterface;
    }
    @Override
    public void saveOrUpdate(TipoInfraccionDTO tipoInfraccionDTO) {
        TipoInfraccionDTO TipoInfraFound = this.tipoInfraccionDaoInterface.findById(tipoInfraccionDTO);
        if(TipoInfraFound==null){
            this.tipoInfraccionDaoInterface.insert(tipoInfraccionDTO);
        }else{
            this.tipoInfraccionDaoInterface.update(tipoInfraccionDTO);
        }

    }

    @Override
    public TipoInfraccionDTO findById(TipoInfraccionDTO tipoInfraccionDTO) {
        TipoInfraccionDTO TipoInfraFound = this.tipoInfraccionDaoInterface.findById(tipoInfraccionDTO);
        return TipoInfraFound;
    }
    @Override
    public void delete(TipoInfraccionDTO tipoInfraccionDTO) {
       this.tipoInfraccionDaoInterface.delete(tipoInfraccionDTO);

    }

    @Override
    public List<Map<String, Object>> selectAll2() {
        return this.tipoInfraccionDaoInterface.selectAll2();
    }
}
