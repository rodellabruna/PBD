package com.pizzaria.pizza.service;

import  com.pizzaria.pizza.entity.Pedido;
import  com.pizzaria.pizza.entity.Cliente;
import java.time.LocalDate;

import java.util.List;
public interface PedidoService {

    void adicionarPedido(Pedido pedido);

    void removerPedido(Long id);

    void atualizarPedido(Pedido pedido);

    Pedido buscarPedidoPorId(Long Id);

    List<Pedido> listarPedidos();

}
