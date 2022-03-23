package com.action.in.taco.cloud.core.repository;

import com.action.in.taco.cloud.core.domain.Order;
import org.springframework.data.repository.CrudRepository;

public interface OrderRepository extends CrudRepository<Order, String> {

//    Order save(Order order);
}
