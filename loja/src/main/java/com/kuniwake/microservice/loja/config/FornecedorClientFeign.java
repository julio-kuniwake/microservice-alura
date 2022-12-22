package com.kuniwake.microservice.loja.config;


import com.kuniwake.microservice.loja.dto.InfoFornecedorDto;
import com.kuniwake.microservice.loja.dto.InfoPedidoDto;
import com.kuniwake.microservice.loja.dto.ItemCompraDto;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@FeignClient("fornecedor")
public interface FornecedorClientFeign {
    @GetMapping(value = "/info/{estado}")
    InfoFornecedorDto getInfoPorEstado(@PathVariable String estado); // Acessando um metodo do MS Fornecedor

    @PostMapping(value = "/pedido")
    InfoPedidoDto realizaPedido(List<ItemCompraDto> itens);
}
