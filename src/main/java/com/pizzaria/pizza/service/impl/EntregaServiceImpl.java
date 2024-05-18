package com.pizzaria.pizza.service.impl;

import com.pizzaria.pizza.entity.Entrega;
import com.pizzaria.pizza.repository.ClienteRepository;
import com.pizzaria.pizza.repository.EntregaRepository;
import com.pizzaria.pizza.repository.ItemRepository;
import com.pizzaria.pizza.repository.PedidoRepository;
import com.pizzaria.pizza.service.EntregaService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;

@Component
@RequiredArgsConstructor
public class EntregaServiceImpl implements EntregaService{

    private final ClienteRepository clienteRepository;
    private final EntregaRepository entregaRepository;
    private final ItemRepository itemRepository;
    private final PedidoRepository pedidoRepository;

    @Override
    public void acidionarEntrega(Entrega entrega) {
        entregaRepository.save(entrega);
    }

    @Override
    public void removerEntrega(Long id) { entregaRepository.deleteById(id); }

    @Override
    public void atualizarEntrega(Entrega entrega) {
        entregaRepository.save(entrega);
    }

    @Override
    public Entrega buscarEntregaPorId(Long id) {
        return entregaRepository.findById(id).orElse(null);
    }

    @Override
    public List<Entrega> listarEntregas() {
        return entregaRepository.findAll();
    }
}
