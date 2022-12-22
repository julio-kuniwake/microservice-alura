package com.kuniwake.microservice.fornecedor.domain.repositories;

import com.kuniwake.microservice.fornecedor.domain.entities.Produto;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ProdutoRepository extends JpaRepository<Produto, Long> {
    List<Produto> findByEstado(String estado);

    List<Produto> findByIdIn(List<Long> ids);
}
