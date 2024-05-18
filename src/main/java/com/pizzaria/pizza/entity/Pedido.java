package com.pizzaria.pizza.entity;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.JoinColumn;
import java.time.LocalDate;
import java.time.LocalTime;
import jakarta.persistence.TemporalType;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalTime;

import java.util.Date;
import java.util.List;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor

public class Pedido {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String dataPedido;
    private String horaPedido;

    private int quantiadeItens;
    private String valorTotal;

    @ManyToOne
    @JoinColumn(name = "cliente_id", referencedColumnName = "id")
    private Cliente cliente;

    @ManyToOne
    @JoinColumn(name = "entrega_id", referencedColumnName = "id")
    private Entrega entrega;

    public Pedido(String dataPedido, String horaPedido, String valorTotal, Cliente cliente, Entrega entrega){
        this.dataPedido = dataPedido;
        this.horaPedido = horaPedido;
        this.valorTotal = valorTotal;
        this.cliente = cliente;
        this.entrega = entrega;
    }

}