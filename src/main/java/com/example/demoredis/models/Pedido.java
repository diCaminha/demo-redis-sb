package com.example.demoredis.models;

import lombok.Data;

import java.io.Serializable;

@Data()
public class Pedido implements Serializable {
    private String produtoId;
    private int quantidade;
    private String id;

    public Pedido(String produtoId, int quantidade, String id) {
        this.produtoId = produtoId;
        this.quantidade = quantidade;
        this.id = id;
    }
}
