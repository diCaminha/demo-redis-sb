package com.example.demoredis.controllers;

import com.example.demoredis.models.Pedido;
import com.example.demoredis.services.PedidosService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@RequestMapping("/pedidos")
public class PedidosController {

    @Resource
    PedidosService pedidosService;

    @GetMapping("/{id}")
    public Pedido getOrder(@PathVariable String id) {
        return pedidosService.getPedidoById(id);
    }
}
