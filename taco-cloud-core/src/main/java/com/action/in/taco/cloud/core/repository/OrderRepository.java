package com.action.in.taco.cloud.core.repository;

import com.action.in.taco.cloud.core.domain.Order;

public interface OrderRepository {

    Order save(Order order);
}
