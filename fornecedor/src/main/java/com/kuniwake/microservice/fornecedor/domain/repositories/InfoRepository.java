package com.kuniwake.microservice.fornecedor.domain.repositories;

import com.kuniwake.microservice.fornecedor.domain.entities.InfoFornecedor;
import org.springframework.data.jpa.repository.JpaRepository;

public interface InfoRepository extends JpaRepository<InfoFornecedor, Long> {
    InfoFornecedor findByEstado(String estado);
}
