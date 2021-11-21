package com.example.cursoSpring.repositoires;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.cursoSpring.entities.OrderItem;

@Repository
public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {

}
