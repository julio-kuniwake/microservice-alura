package com.kuniwake.microservice.loja.service;

import com.kuniwake.microservice.loja.dto.CompraDto;
import com.kuniwake.microservice.loja.dto.InfoFornecedorDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class CompraService {

    @Autowired
    private RestTemplate client;
    public void realizaCompra(CompraDto compraDto) {

        ResponseEntity<InfoFornecedorDto> response =
                client.exchange("http://fornecedor/info/" + compraDto.getEndereco().getEstado(),
            HttpMethod.GET, null, InfoFornecedorDto.class
        );
        System.out.println(response.getBody().getEndereco());

    }
}
