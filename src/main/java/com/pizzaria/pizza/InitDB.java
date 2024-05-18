package com.pizzaria.pizza;

import com.pizzaria.pizza.entity.Cliente;
import com.pizzaria.pizza.entity.Entrega;
import com.pizzaria.pizza.entity.Item;
import com.pizzaria.pizza.entity.Pedido;
import com.pizzaria.pizza.service.ClienteService;
import com.pizzaria.pizza.service.EntregaService;
import com.pizzaria.pizza.service.ItemService;
import com.pizzaria.pizza.service.PedidoService;

import java.time.LocalDate;
import java.time.LocalTime;
import java.math.BigDecimal;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import java.util.Date;

@Slf4j
@Configuration
@Profile({"com", "local"})
public class InitDB implements CommandLineRunner {

    private final ClienteService clienteService;
    private final EntregaService entregaService;
    private final ItemService itemService;
    private final PedidoService pedidoService;

    public InitDB(ClienteService clienteService, EntregaService entregaService,ItemService itemService, PedidoService pedidoService){
        this.clienteService = clienteService;
        this.entregaService = entregaService;
        this.itemService = itemService;
        this.pedidoService = pedidoService;
    }

    @Override
    public void run (String... arg) {
        //Criar clientes
        Cliente cliente1 = new Cliente("Maria Silva","11 1254-1254", "Rusa dos Bobos, 0",1234);
        clienteService.adicionarCliente(cliente1);
        Cliente cliente2 = new Cliente("Carlos Souza","11 3214-3214", "Rusa dos Alegres, 1000",5678);
        clienteService.adicionarCliente(cliente2);
        Cliente cliente3 = new Cliente("José João","11 6547-9874", "Rusa dos Jotas, 55",3214);
        clienteService.adicionarCliente(cliente3);

        //Criar Entregas

        Entrega entrega1 = new Entrega("2024-05-22", "10:30", "dinheiro", "1234");
        entregaService.acidionarEntrega(entrega1);
        Entrega entrega2 = new Entrega("2024-05-22", "12:40", "dinheiro", "1234");
        entregaService.acidionarEntrega(entrega2);
        Entrega entrega3 = new Entrega("2024-05-21", "11:30", "cartao", "5678");
        entregaService.acidionarEntrega(entrega3);

        //Criar Pedidos
        Pedido pedido1 = new Pedido("2024-05-22", "9:30", "50.00", cliente1, entrega1 );
        pedidoService.adicionarPedido(pedido1);
        Pedido pedido2 = new Pedido("2024-05-22", "8:30", "60.00", cliente1, entrega2 );
        pedidoService.adicionarPedido(pedido2);
        Pedido pedido3 = new Pedido("2024-05-21", "7:30", "70.00", cliente2, entrega3 );
        pedidoService.adicionarPedido(pedido3);

        //Criar Itens
        Item item1 = new Item("Queijo","20,00",1);
        itemService.adicionarItem(item1);
        Item item2 = new Item("Portuguesa","60.00",1);
        itemService.adicionarItem(item2);
        Item item3 = new Item("Calabrase","50.00",1);
        itemService.adicionarItem(item3);
        Item item4 = new Item("Refrigerante","10.00",2);
        itemService.adicionarItem(item4);
        Item item5 = new Item("Cerveja","10.00",1);
        itemService.adicionarItem(item5);



    }


}
