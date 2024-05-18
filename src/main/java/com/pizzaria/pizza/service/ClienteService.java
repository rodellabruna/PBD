package  com.pizzaria.pizza.service;

import  com.pizzaria.pizza.entity.Cliente;

import java.util.List;

public interface ClienteService {

    void adicionarCliente(Cliente cliente);

    void removerCliente(Long id);

    void atualizarCliente(Cliente cliente);

    List<Cliente> buscarClientePorNome(String nome);

    Cliente buscarClientporTelefone(String telefone);

    List<Cliente> listarClientes();


}