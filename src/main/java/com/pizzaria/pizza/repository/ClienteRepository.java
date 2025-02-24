package com.pizzaria.pizza.repository;

import com.pizzaria.pizza.entity.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ClienteRepository extends JpaRepository<Cliente, Long> {
    List<Cliente> findByNome(String nome);
    Cliente findByTelefone(String telefone);

}