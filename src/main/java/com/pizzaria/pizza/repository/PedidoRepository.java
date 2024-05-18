package com.pizzaria.pizza.repository;

import com.pizzaria.pizza.entity.Pedido;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PedidoRepository extends JpaRepository<Pedido, Long> {
    List<Pedido> findByPedidoId(Long pedidoId);

}
