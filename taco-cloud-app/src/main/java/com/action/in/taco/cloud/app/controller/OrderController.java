package com.action.in.taco.cloud.app.controller;

import com.action.in.datastore.domain.Order;
import com.action.in.datastore.domain.User;
import com.action.in.datastore.repository.OrderRepository;
import com.action.in.taco.cloud.app.config.OrderProps;
import lombok.extern.slf4j.Slf4j;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Slf4j
@Controller
@RequestMapping("/orders")
public class OrderController {

	private OrderRepository orderRepository;
	private OrderProps orderProps;

	public OrderController(OrderRepository orderRepository, OrderProps orderProps) {
		this.orderRepository = orderRepository;
		this.orderProps = orderProps;
	}

	@GetMapping("/current")
	public String orderForm(Model model) {
		model.addAttribute("order", new Order());
		return "orderForm";
	}
	
	@PostMapping
	public String processOrder(Order order, Errors errors, @AuthenticationPrincipal User user) {
		if (errors.hasErrors()) {
			return "orderForm";
		}
		order.setUser(user);
		
		log.info("Order submitted: " + order);
		return "redirect:/";
	}
	@GetMapping
	public String ordersForUser(
			@AuthenticationPrincipal User user, Model model) {

		Pageable pageable = PageRequest.of(0, orderProps.getPageSize());
		model.addAttribute("orders",
				orderRepository.findByUserOrderByPlacedAtDesc(user, pageable));
		return "orderList";
	}
}