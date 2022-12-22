package com.kuniwake.microservice.fornecedor.service;

import com.kuniwake.microservice.fornecedor.domain.entities.InfoFornecedor;
import com.kuniwake.microservice.fornecedor.domain.repositories.InfoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class InfoService {

    @Autowired
    private InfoRepository infoRepository;
    public InfoFornecedor getInfoPorEstado(String estado) {
        return infoRepository.findByEstado(estado);
    }
}
