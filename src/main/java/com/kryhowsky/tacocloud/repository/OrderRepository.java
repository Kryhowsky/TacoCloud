package com.kryhowsky.tacocloud.repository;

import com.kryhowsky.tacocloud.model.Order;

public interface OrderRepository {
    Order save(Order order);
}
