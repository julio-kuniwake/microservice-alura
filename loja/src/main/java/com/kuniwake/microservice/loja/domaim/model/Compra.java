package com.kuniwake.microservice.loja.domaim.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Compra {
    private Long pedidoId;
    private Integer tempoDePreparo;
    private String enderecoDestino;
}
