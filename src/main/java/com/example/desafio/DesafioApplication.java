package com.example.desafio;

import com.example.entities.Order;
import com.example.services.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan({"com.example"})
public class DesafioApplication implements CommandLineRunner {

	@Autowired
	private OrderService orderService;

	public static void main(String[] args) {

		SpringApplication.run(DesafioApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// Exemplo 1
		Order order1 = new Order(1034, 150.00, 20.0);
		double total1 = orderService.total(order1);
		System.out.println("Pedido código " + order1.getCode());
		System.out.println("Valor total: R$ " + String.format("%.2f", total1));
		System.out.println();

		// Exemplo 2
		Order order2 = new Order(2282, 800.00, 10.0);
		double total2 = orderService.total(order2);
		System.out.println("Pedido código " + order2.getCode());
		System.out.println("Valor total: R$ " + String.format("%.2f", total2));
		System.out.println();

		// Exemplo 3
		Order order3 = new Order(1309, 95.90, 0.0);
		double total3 = orderService.total(order3);
		System.out.println("Pedido código " + order3.getCode());
		System.out.println("Valor total: R$ " + String.format("%.2f", total3));

	}
}