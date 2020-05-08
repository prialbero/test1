package com.example.demo.application.port.in.model;

import com.example.demo.adapter.out.persistence.model.PersonajeModel;
import com.example.demo.application.domain.Personaje;
import lombok.Builder;
import lombok.Data;

import java.io.Serializable;

@Builder
@Data
public class ResponseCreateKey implements Serializable {
    private Long code;
    private String name;
    private Personaje personaje;
}
