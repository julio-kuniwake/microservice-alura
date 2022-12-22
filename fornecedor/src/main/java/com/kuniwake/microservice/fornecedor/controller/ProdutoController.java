package com.kuniwake.microservice.fornecedor.controller;

import com.kuniwake.microservice.fornecedor.domain.entities.Produto;
import com.kuniwake.microservice.fornecedor.service.ProdutoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/produto")
public class ProdutoController {
    @Autowired
    private ProdutoService produtoService;

    @GetMapping(value = "/{estado}")
    public List<Produto> getProdutosPorEstado(@PathVariable("estado") String estado) {
        return produtoService.getProdutosPorEstado(estado);
    }
}