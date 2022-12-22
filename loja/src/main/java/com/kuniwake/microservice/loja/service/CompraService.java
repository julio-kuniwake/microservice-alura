package com.kuniwake.microservice.loja.service;

import com.kuniwake.microservice.loja.config.FornecedorClientFeign;
import com.kuniwake.microservice.loja.domaim.model.Compra;
import com.kuniwake.microservice.loja.dto.CompraDto;
import com.kuniwake.microservice.loja.dto.InfoFornecedorDto;
import com.kuniwake.microservice.loja.dto.InfoPedidoDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CompraService {

    @Autowired
    private FornecedorClientFeign fornecedorClientFeign;

    public Compra realizaCompra(CompraDto compraDto) {

        InfoFornecedorDto info = fornecedorClientFeign.getInfoPorEstado(compraDto.getEndereco().getEstado());

        InfoPedidoDto pedido = fornecedorClientFeign.realizaPedido(compraDto.getItens());

        System.out.println(info.getEndereco());

        Compra compraEfetuada = new Compra();
        compraEfetuada.setPedidoId(pedido.getId());
        compraEfetuada.setTempoDePreparo(pedido.getTempoDePreparo());
        compraEfetuada.setEnderecoDestino(compraDto.getEndereco().toString());

        return compraEfetuada;
    }
}
