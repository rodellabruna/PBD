package com.pizzaria.pizza.service.impl;

import com.pizzaria.pizza.entity.Cliente;
import com.pizzaria.pizza.repository.ClienteRepository;
import com.pizzaria.pizza.repository.EntregaRepository;
import com.pizzaria.pizza.repository.ItemRepository;
import com.pizzaria.pizza.repository.PedidoRepository;
import com.pizzaria.pizza.service.ClienteService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;

@Component
@RequiredArgsConstructor
public class ClienteServiceImpl implements ClienteService {

    private final ClienteRepository clienteRepository;
    private final EntregaRepository entregaRepository;
    private final ItemRepository itemRepository;
    private final PedidoRepository pedidoRepository;

    @Override
    public void adicionarCliente(Cliente cliente) {
        clienteRepository.save(cliente);
    }

    @Override
    public void removerCliente(Long id) {
        clienteRepository.deleteById(id);
    }

    @Override
    public void atualizarCliente(Cliente cliente) {
        clienteRepository.save(cliente);
    }

    @Override
    public List<Cliente> buscarClientePorNome(String nome) {
        return clienteRepository.findByNome(nome);
    }

    @Override
    public Cliente buscarClientporTelefone(String telefone) { return clienteRepository.findByTelefone(telefone); }

    @Override
    public List<Cliente> listarClientes() {
        return clienteRepository.findAll();
    }


}
