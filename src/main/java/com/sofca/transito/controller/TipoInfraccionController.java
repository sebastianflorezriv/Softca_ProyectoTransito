package com.sofca.transito.controller;

import com.sofca.transito.business.BusinessPersonaInterface;
import com.sofca.transito.business.BusinessTipoInfraccionInterface;
import com.sofca.transito.dto.TipoInfraccionDTO;
import com.sofca.transito.mensajes.ResponseMessage;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
@RequestMapping("/personas/")
public class TipoInfraccionController {
    private BusinessTipoInfraccionInterface businessTipoInfraccionInterface;

    public TipoInfraccionController(BusinessTipoInfraccionInterface businessTipoInfraccionInterface){
        this.businessTipoInfraccionInterface=businessTipoInfraccionInterface;
    }
    @PostMapping({"/saveOrUpdate"})
    public ResponseEntity<ResponseMessage<TipoInfraccionDTO>> saveOrUpdate(@RequestBody TipoInfraccionDTO request) {
        log.debug("REST request to saveOrUpdate Tipo de Infraccion : {}", request);
        ResponseMessage message =null;
        try{
            businessTipoInfraccionInterface.saveOrUpdate(request);
            message = new ResponseMessage<>(200, "saveOrUpdate, process successful ", request);
        }catch (Exception ex){
            message = new ResponseMessage<>(406, ex.getMessage(), request);
        }


        return ResponseEntity.ok(message);
    }

}
