package com.example.practicaSpring.Logic;

import org.springframework.stereotype.Service;

@Service
public class LogicHolaMundo {

    public String ConcatenaNombre(String mensaje){

        String nuevoMensaje = mensaje+ "Lizbeth";

        return nuevoMensaje;
    }
}
