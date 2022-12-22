package com.kuniwake.microservice.fornecedor.domain.repositories;

import com.kuniwake.microservice.fornecedor.domain.entities.Pedido;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PedidoRepository extends JpaRepository<Pedido, Long> {
}
