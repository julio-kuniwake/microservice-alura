package com.kuniwake.microservice.loja.service;

import com.kuniwake.microservice.loja.config.FornecedorClientFeign;
import com.kuniwake.microservice.loja.dto.CompraDto;
import com.kuniwake.microservice.loja.dto.InfoFornecedorDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CompraService {

    @Autowired
    private FornecedorClientFeign fornecedorClientFeign;

    public void realizaCompra(CompraDto compraDto) {

        InfoFornecedorDto info = fornecedorClientFeign.getInfoPorEstado(compraDto.getEndereco().getEstado());
        System.out.println(info.getEndereco());

    }
}
