package com.example.demoredis.services;

import com.example.demoredis.models.Pedido;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.cache.annotation.CacheConfig;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

@Service
@CacheConfig(cacheNames = {"Pedido"})
public class PedidosService {
    private static final Logger LOG = LoggerFactory.getLogger(PedidosService.class);

    @Cacheable(key = "#id")
    public Pedido getPedidoById(String id) {
        return new Pedido("123456", 3, id);
    }
}
