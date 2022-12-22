package com.kuniwake.microservice.loja.dto;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class CompraDto {
    private List<ItemCompraDto> itens;
    private EnderecoDto endereco;

}
