package com.kuniwake.microservice.fornecedor.controller;

import com.kuniwake.microservice.fornecedor.domain.entities.InfoFornecedor;
import com.kuniwake.microservice.fornecedor.service.InfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/info")
public class InfoController {

    @Autowired
    InfoService infoService;
    @GetMapping(value = "/{estado}")
    public InfoFornecedor getInfoPorEstado(@PathVariable String estado){
        return infoService.getInfoPorEstado(estado);
    }
}
