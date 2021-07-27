package com.kryhowsky.tacocloud.repository;

import com.kryhowsky.tacocloud.model.Order;
import com.kryhowsky.tacocloud.model.User;
import org.springframework.data.repository.CrudRepository;

import java.awt.print.Pageable;
import java.util.List;

public interface OrderRepository extends CrudRepository<Order, Long> {

    List<Order> findByUserOrderByPlacedAtDesc(User user, Pageable pageable);
}
