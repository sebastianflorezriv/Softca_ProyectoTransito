package com.sofca.transito.controller;

import com.sofca.transito.business.BusinessPersonaInterface;
import com.sofca.transito.business.BusinessSecretariaInterface;
import com.sofca.transito.dto.PersonaDTO;
import com.sofca.transito.dto.SecretariaDTO;
import com.sofca.transito.mensajes.ResponseMessage;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
@RequestMapping("/secretariasdetransito/")

public class SecretariaController {

    private BusinessSecretariaInterface businessSecretariaInterface;

    public SecretariaController(BusinessSecretariaInterface businessSecretariaInterface){
        this.businessSecretariaInterface=businessSecretariaInterface;
    }

    @PostMapping({"/saveOrUpdate"})
    public ResponseEntity<ResponseMessage<SecretariaDTO>> saveOrUpdate(@RequestBody SecretariaDTO request) {
        log.debug("REST request to saveOrUpdate Secretaria : {}", request);
        ResponseMessage message =null;
        try{
            businessSecretariaInterface.saveOrUpdate(request);
            message = new ResponseMessage<>(200, "saveOrUpdate, process successful ", request);
        }catch (Exception ex){
            message = new ResponseMessage<>(406, ex.getMessage(), request);
        }


        return ResponseEntity.ok(message);
    }

    @PostMapping({"/findById"})
    public ResponseEntity<ResponseMessage<SecretariaDTO>> findById(@RequestBody SecretariaDTO request) {
        log.debug("REST request to saveOrUpdate Secretaria : {}", request);
        ResponseMessage message = null;
        try{
            SecretariaDTO secretariaDTO = businessSecretariaInterface.findById(request);

            message = new ResponseMessage<>(200, "findById, process successful", secretariaDTO);
        }catch (Exception ex){
            message = new ResponseMessage<>(406, ex.getMessage(),null);
        }

        return ResponseEntity.ok(message);
    }
}
