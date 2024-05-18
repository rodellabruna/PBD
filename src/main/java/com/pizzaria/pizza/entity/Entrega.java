package com.pizzaria.pizza.entity;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.OneToOne;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import java.time.LocalDate;
import java.time.LocalTime;


import java.util.Date;
import java.util.List;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor

public class Entrega {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String dataEntrega;
    private String horaEntrega;
    private String tipoPagamento;
    private String codigoDeEntrega;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "endereco_id", referencedColumnName = "id")
    private Pedido pedido;

    public Entrega(String dataEntrega, String  horaEntrega, String tipoPagamento, String codigoDeEntrega) {
        this.dataEntrega = dataEntrega;
        this.horaEntrega = horaEntrega;
        this.tipoPagamento = tipoPagamento;
        this.codigoDeEntrega = codigoDeEntrega;
    }

}