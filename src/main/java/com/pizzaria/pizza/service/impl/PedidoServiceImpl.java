package com.pizzaria.pizza.service.impl;

import com.pizzaria.pizza.entity.Pedido;
import com.pizzaria.pizza.repository.ClienteRepository;
import com.pizzaria.pizza.repository.EntregaRepository;
import com.pizzaria.pizza.repository.ItemRepository;
import com.pizzaria.pizza.repository.PedidoRepository;
import com.pizzaria.pizza.service.PedidoService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Component
@RequiredArgsConstructor
public class PedidoServiceImpl implements PedidoService{

    private final ClienteRepository clienteRepository;
    private final EntregaRepository entregaRepository;
    private final ItemRepository itemRepository;
    private final PedidoRepository pedidoRepository;

    @Override
    public void adicionarPedido(Pedido pedido) {
        pedidoRepository.save(pedido);
    }

    @Override
    public void removerPedido(Long id) {
        pedidoRepository.deleteById(id);
    }

    @Override
    public void atualizarPedido(Pedido pedido) {
        pedidoRepository.save(pedido);
    }

    @Override
    public Pedido buscarPedidoPorId(Long id) {
        return pedidoRepository.findById(id).orElse(null);
    }
    @Override
    public List<Pedido> listarPedidos() {
        return pedidoRepository.findAll();
    }
}

