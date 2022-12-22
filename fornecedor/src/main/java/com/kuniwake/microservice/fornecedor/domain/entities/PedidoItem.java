package com.kuniwake.microservice.fornecedor.domain.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class PedidoItem {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Integer quantidade;

    @ManyToOne // Muitos 'PedidoItem' para um 'Produto'
    @JoinColumn(name = "produtoId")
    private Produto produto;
}
