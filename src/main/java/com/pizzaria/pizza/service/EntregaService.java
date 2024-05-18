package com.pizzaria.pizza.service;

import  com.pizzaria.pizza.entity.Entrega;

import java.util.List;

public interface EntregaService {

    void acidionarEntrega(Entrega entrega);

    void removerEntrega(Long id);

    void atualizarEntrega(Entrega entrega);

    Entrega buscarEntregaPorId(Long id);

    List<Entrega> listarEntregas();
}
