package com.kryhowsky.tacocloud.repository;

import com.kryhowsky.tacocloud.model.Order;
import org.springframework.data.repository.CrudRepository;

public interface OrderRepository extends CrudRepository<Order, Long> {
}
