package ar.edu.ucc.arqsoft.test.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import ar.edu.ucc.arqsoft.test.dto.RequestDto;
import ar.edu.ucc.arqsoft.test.dto.ResponseDto;
import ar.edu.ucc.arqsoft.test.service.TransaccionService;

@Controller
public class TransaccionController{

    @Autowired
    TransaccionService transaccionService;

    @SuppressWarnings({"rawtypes", "unchecked"})
    @RequestMapping(value = "/debitar", method = RequestMethod.POST, produces = "application/json")
    public ResponseEntity<?> debitar (@RequestBody RequestDto req){
        ResponseDto res = transaccionService.debitar(req);

        return new ResponseEntity<Object>(res, HttpStatus.CREATED);
    }

    @SuppressWarnings({"rawtypes", "unchecked"})
    @RequestMapping(value = "/acreditar", method = RequestMethod.POST, produces = "application/json")
    public ResponseEntity<?> acreditar (@RequestBody RequestDto req){
        ResponseDto res = transaccionService.acreditar(req);

        return new ResponseEntity<Object>(res, HttpStatus.CREATED); 
    }

}