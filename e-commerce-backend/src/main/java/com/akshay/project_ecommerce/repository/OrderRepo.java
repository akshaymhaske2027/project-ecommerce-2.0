package com.akshay.project_ecommerce.repository;

import com.akshay.project_ecommerce.entity.Address;
import com.akshay.project_ecommerce.entity.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepo extends JpaRepository<Order, Long> {
}
