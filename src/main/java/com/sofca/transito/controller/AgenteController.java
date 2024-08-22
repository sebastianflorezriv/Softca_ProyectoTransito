package com.sofca.transito.controller;

import com.sofca.transito.business.BusinessAgenteInterface;
import com.sofca.transito.business.BusinessPersonaInterface;
import com.sofca.transito.dto.AgenteDTO;
import com.sofca.transito.dto.PersonaDTO;
import com.sofca.transito.dto.TipoInfraccionDTO;
import com.sofca.transito.mensajes.ResponseMessage;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@CrossOrigin
@RestController
@Slf4j
@RequestMapping("/agentesdetransito/")
public class AgenteController {
    private BusinessAgenteInterface businessAgenteInterface;

    public AgenteController(BusinessAgenteInterface businessAgenteInterface){
        this.businessAgenteInterface=businessAgenteInterface;
    }

    @PostMapping({"/saveOrUpdate"})
    public ResponseEntity<ResponseMessage<AgenteDTO>> saveOrUpdate(@RequestBody AgenteDTO request) {
        log.debug("REST request to saveOrUpdate Agente : {}", request);
        ResponseMessage message =null;
        try{
            businessAgenteInterface.saveOrUpdate(request);
            message = new ResponseMessage<>(200, "saveOrUpdate, process successful ", request);
        }catch (Exception ex){
            message = new ResponseMessage<>(406, ex.getMessage(), request);
        }


        return ResponseEntity.ok(message);
    }

    @PostMapping({"/findById"})
    public ResponseEntity<ResponseMessage<AgenteDTO>> findById(@RequestBody AgenteDTO request) {
        log.debug("REST request to saveOrUpdate Agente : {}", request);
        ResponseMessage message =null;
        try{
            AgenteDTO agenteDTO= businessAgenteInterface.findById(request);

            message = new ResponseMessage<>(200, "findById, process successful ", agenteDTO);
        }catch (Exception ex){
            message = new ResponseMessage<>(406, ex.getMessage(),null);
        }


        return ResponseEntity.ok(message);
    }
    @PostMapping({"/Delete"})
    public ResponseEntity<ResponseMessage<TipoInfraccionDTO>> delete(@RequestBody AgenteDTO request) {
        log.debug("REST request to Delete Agente : {}", request);
        ResponseMessage message =null;
        try{
            this.businessAgenteInterface.delete(request);

            message = new ResponseMessage<>(200, "Delete, process successful ", request);
        }catch (Exception ex){
            message = new ResponseMessage<>(406, ex.getMessage(),null);
        }


        return ResponseEntity.ok(message);
    }
    @GetMapping("/All")
    public ResponseEntity<ResponseMessage> selectAll() {
        List<Map<String, Object>> list = null;
        ResponseMessage message =null;


        try {
             list= this.businessAgenteInterface.selectAll2();
            message = new ResponseMessage<>(200, "All, process successful ", list );
        }catch (Exception exception){
            message = new ResponseMessage<>(406, exception.getMessage(),null );
        }
        return ResponseEntity.ok(message);
    }
}
