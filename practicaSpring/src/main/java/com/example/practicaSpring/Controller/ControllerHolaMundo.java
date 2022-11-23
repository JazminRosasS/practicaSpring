package com.example.practicaSpring.Controller;

import com.example.practicaSpring.Entities.InputMensaje;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import com.example.practicaSpring.Logic.LogicHolaMundo;


@RestController
@RequestMapping("/v1")
public class ControllerHolaMundo {

    @Autowired
    //Logica
    LogicHolaMundo logicaHolaMundo;

    @PostMapping(value = "/GetHolaMundo")
    //Datos de entrada Mensaje
    public ResponseEntity <?> getHolaMundo(@RequestBody InputMensaje request){

        // mensaje
        var response = logicaHolaMundo.ConcatenaNombre(request.getMensaje());

        return ResponseEntity.status(200).body(response);

    }

}
