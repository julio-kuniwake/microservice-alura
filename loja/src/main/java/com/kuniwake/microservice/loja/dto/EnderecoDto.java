package com.kuniwake.microservice.loja.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class EnderecoDto {
    private String rua;
    private int numero;
    private String estado;
}
