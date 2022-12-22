package com.kuniwake.microservice.loja.controller;

import com.kuniwake.microservice.loja.domaim.model.Compra;
import com.kuniwake.microservice.loja.dto.CompraDto;
import com.kuniwake.microservice.loja.service.CompraService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/compra")
public class CompraController {

    @Autowired
    private CompraService compraService;

    @PostMapping
    public Compra realizaCompra(@RequestBody CompraDto compraDto){
        return compraService.realizaCompra(compraDto);

    }
}
