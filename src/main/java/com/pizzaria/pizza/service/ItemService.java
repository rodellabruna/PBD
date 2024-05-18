package com.pizzaria.pizza.service;

import  com.pizzaria.pizza.entity.Item;

import java.util.List;
public interface ItemService {
    void adicionarItem(Item item);

    void removerItem(Long id);

    void atualizarItem(Item item);

    Item buscarItemPorDescbricao(String descrição);

    List<Item> listarItens();


}
