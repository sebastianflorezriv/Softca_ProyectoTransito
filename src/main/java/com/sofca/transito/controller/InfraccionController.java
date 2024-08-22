package com.sofca.transito.controller;

import com.sofca.transito.business.BusinessAgenteInterface;
import com.sofca.transito.business.BusinessInfraccionInterface;
import com.sofca.transito.dto.AgenteDTO;
import com.sofca.transito.dto.InfraccionDTO;
import com.sofca.transito.mensajes.ResponseMessage;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@CrossOrigin
@RestController
@Slf4j
@RequestMapping("/registroinfraccion/")
public class InfraccionController {

    private BusinessInfraccionInterface businessInfraccionInterface;

    public InfraccionController(BusinessInfraccionInterface businessInfraccionInterface){
        this.businessInfraccionInterface=businessInfraccionInterface;
    }

    @PostMapping({"/saveOrUpdate"})
    public ResponseEntity<ResponseMessage<InfraccionDTO>> saveOrUpdate(@RequestBody InfraccionDTO request) {
        log.debug("REST request to saveOrUpdate Infraccion : {}", request);
        ResponseMessage message =null;
        try{
            businessInfraccionInterface.saveOrUpdate(request);
            message = new ResponseMessage<>(200, "saveOrUpdate, process successful ", request);
        }catch (Exception ex){
            message = new ResponseMessage<>(406, ex.getMessage(), request);
        }


        return ResponseEntity.ok(message);
    }

    @PostMapping({"/findById"})
    public ResponseEntity<ResponseMessage<InfraccionDTO>> findById(@RequestBody InfraccionDTO request) {
        log.debug("REST request to saveOrUpdate Infraccion : {}", request);
        ResponseMessage message =null;
        try{
            InfraccionDTO infraccionDTO= businessInfraccionInterface.findById(request);

            message = new ResponseMessage<>(200, "findById, process successful ", infraccionDTO);
        }catch (Exception ex){
            message = new ResponseMessage<>(406, ex.getMessage(),null);
        }


        return ResponseEntity.ok(message);
    }

}
