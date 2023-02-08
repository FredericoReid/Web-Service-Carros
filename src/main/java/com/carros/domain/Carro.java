package com.carros.domain;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Carro {
    private long id;
    private String nome;


    public Carro(long id, String nome) {
        this.id = id;
        this.nome = nome;
    }
}
