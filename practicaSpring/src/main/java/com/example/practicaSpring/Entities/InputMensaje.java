package com.example.practicaSpring.Entities;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class InputMensaje {

    @JsonProperty("mensaje")
    public String mensaje;
}
