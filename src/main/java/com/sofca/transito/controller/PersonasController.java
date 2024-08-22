package com.sofca.transito.controller;

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

@RestController
@Slf4j
@RequestMapping("/personas/")
public class PersonasController {
    private BusinessPersonaInterface businessPersonaInterface;
    public PersonasController(BusinessPersonaInterface businessPersonaInterface){
        this.businessPersonaInterface=businessPersonaInterface;
    }

    @PostMapping({"/saveOrUpdate"})
    public ResponseEntity<ResponseMessage<PersonaDTO>> saveOrUpdate(@RequestBody PersonaDTO request) {
        log.debug("REST request to saveOrUpdate Planilla : {}", request);
        ResponseMessage message =null;
        try{
            businessPersonaInterface.saveOrUpdate(request);
            message = new ResponseMessage<>(200, "saveOrUpdate, process successful ", request);
        }catch (Exception ex){
            message = new ResponseMessage<>(406, ex.getMessage(), request);
        }


        return ResponseEntity.ok(message);
     }

    @PostMapping({"/findById"})
    public ResponseEntity<ResponseMessage<PersonaDTO>> findById(@RequestBody PersonaDTO request) {
        log.debug("REST request to saveOrUpdate Planilla : {}", request);
        ResponseMessage message =null;
        try{
            PersonaDTO personaDTO= businessPersonaInterface.findById(request);

            message = new ResponseMessage<>(200, "findById, process successful ", personaDTO);
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
            list= this.businessPersonaInterface.selectAll2();
            message = new ResponseMessage<>(200, "All, process successful ", list );
        }catch (Exception exception){
            message = new ResponseMessage<>(406, exception.getMessage(),null );
        }
        return ResponseEntity.ok(message);
    }
    @DeleteMapping({"/Delete"})
    public ResponseEntity<ResponseMessage<PersonaDTO>> delete(@RequestBody PersonaDTO request) {
        log.debug("REST request to Delete Agente : {}", request);
        ResponseMessage message =null;
        try{
            this.businessPersonaInterface.delete(request);

            message = new ResponseMessage<>(200, "Delete, process successful ", request);
        }catch (Exception ex){
            message = new ResponseMessage<>(406, ex.getMessage(),null);
        }


        return ResponseEntity.ok(message);
    }
}
