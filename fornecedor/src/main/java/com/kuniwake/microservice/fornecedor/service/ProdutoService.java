package com.kuniwake.microservice.fornecedor.service;

import com.kuniwake.microservice.fornecedor.domain.entities.Produto;
import com.kuniwake.microservice.fornecedor.domain.repositories.ProdutoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProdutoService {
    @Autowired
    private ProdutoRepository produtoRepository;

    public List<Produto> getProdutosPorEstado(String estado) {
        return produtoRepository.findByEstado(estado);
    }
}
