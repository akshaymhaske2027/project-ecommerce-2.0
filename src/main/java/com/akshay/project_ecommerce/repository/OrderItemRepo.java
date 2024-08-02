package com.akshay.project_ecommerce.repository;

import com.akshay.project_ecommerce.entity.OrderItem;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface OrderItemRepo extends JpaRepository<OrderItem, Long> ,JpaSpecificationExecutor<OrderItem> {
}
