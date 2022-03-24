package com.action.in.taco.cloud.core.repository;

import com.action.in.taco.cloud.core.domain.Order;
import com.action.in.taco.cloud.core.domain.User;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface OrderRepository extends CrudRepository<Order, String> {

//    List<Order> findByUserOrderByPlacedAtDesc(User user, Pageable pageable);
//    Order save(Order order);
}
