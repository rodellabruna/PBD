package com.pizzaria.pizza.repository;

import com.pizzaria.pizza.entity.Entrega;
import org.springframework.data.jpa.repository.JpaRepository;

import java.time.LocalDate;
import java.util.List;

public interface EntregaRepository extends JpaRepository<Entrega, Long> {
    List<Entrega> findByDataEntrega(String dataEntrega);
    Entrega findBycodigoDeEntrega(String codigoDeEntrega);

}