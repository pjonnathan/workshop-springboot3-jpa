package com.startproject.demo.repositores;

import com.startproject.demo.entity.OrderItem;
import com.startproject.demo.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {

}
