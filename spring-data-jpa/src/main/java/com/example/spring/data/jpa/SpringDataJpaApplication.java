package com.example.spring.data.jpa;

import com.example.spring.data.jpa.entities.Order;
import com.example.spring.data.jpa.service.OrderService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.math.BigDecimal;
import java.util.List;

@SpringBootApplication
public class SpringDataJpaApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(SpringDataJpaApplication.class, args);
		OrderService service = (OrderService) context.getBean("orderService");
		Order order = new Order();
		order.setTotalPrice(BigDecimal.TEN);
		order.setTotalQuantity(10);
		order.setEmail("abc1@abc.com");
		order.setStatus(true);
		// The order object should be added in the db table
		service.saveOrder(order);

		List<Order> list = service.findAll();
		list.forEach((o) -> System.out.println(o.toString())) ;
	}

}