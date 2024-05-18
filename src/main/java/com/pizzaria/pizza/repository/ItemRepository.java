package com.pizzaria.pizza.repository;

import com.pizzaria.pizza.entity.Item;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ItemRepository extends JpaRepository<Item, Long> {
    Item buscarItemporDescricao(String descricao);


    Item findByDescricao(String descrição);
}

