package com.pizzaria.pizza.service.impl;

import com.pizzaria.pizza.entity.Item;
import com.pizzaria.pizza.repository.ClienteRepository;
import com.pizzaria.pizza.repository.EntregaRepository;
import com.pizzaria.pizza.repository.ItemRepository;
import com.pizzaria.pizza.repository.PedidoRepository;
import com.pizzaria.pizza.service.ItemService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;

@Component
@RequiredArgsConstructor
public class ItemServiceImpl implements ItemService{

    private final ClienteRepository clienteRepository;
    private final EntregaRepository entregaRepository;
    private final ItemRepository itemRepository;
    private final PedidoRepository pedidoRepository;

    @Override
    public void adicionarItem(Item item) {
        itemRepository.save(item);
    }

    @Override
    public void removerItem(Long id) {
        itemRepository.deleteById(id);
    }

    @Override
    public void atualizarItem(Item item) {
        itemRepository.save(item);
    }

    @Override
    public Item buscarItemPorDescbricao(String descrição) {
        return itemRepository.findByDescricao(descrição);
    }
    @Override
    public List<Item> listarItens() {
        return itemRepository.findAll();
    }

}
