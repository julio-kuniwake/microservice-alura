package com.kuniwake.microservice.fornecedor.controller;

import com.kuniwake.microservice.fornecedor.domain.entities.Pedido;
import com.kuniwake.microservice.fornecedor.dto.ItemPedidoDto;
import com.kuniwake.microservice.fornecedor.service.PedidoService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/pedido")
public class PedidoController {
    private static final Logger LOG = LoggerFactory.getLogger(PedidoController.class);
    @Autowired
    private PedidoService pedidoService;

    @PostMapping
    public Pedido realizaPedido(@RequestBody List<ItemPedidoDto> produtos) {
        LOG.info("Pedido Recebido!");
        return pedidoService.realizaPedido(produtos);
    }

    @GetMapping(value = "/{id}")
    public Pedido getPedidoPorId(@PathVariable Long id) {
        return pedidoService.getPedidoPorId(id);
    }
}
