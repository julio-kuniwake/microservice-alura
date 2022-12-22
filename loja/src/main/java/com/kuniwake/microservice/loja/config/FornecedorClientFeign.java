package com.kuniwake.microservice.loja.config;


import com.kuniwake.microservice.loja.dto.InfoFornecedorDto;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient("fornecedor")
public interface FornecedorClientFeign {
    @GetMapping(value = "/info/{estado}")
    InfoFornecedorDto getInfoPorEstado(@PathVariable String estado); // Acessando um metodo do MS Fornecedor
}
