package com.akshay.project_ecommerce.service.interfaces;

import com.akshay.project_ecommerce.dto.OrderRequest;
import com.akshay.project_ecommerce.dto.Response;
import com.akshay.project_ecommerce.enums.OrderStatus;
import org.springframework.data.domain.Pageable;

import java.time.LocalDateTime;

public interface OrderItemService {
    Response placeOrder(OrderRequest orderRequest);
    Response updateOrderItemStatus(Long orderItemId, String status);
    Response filterOrderItems(OrderStatus status, LocalDateTime startDate, LocalDateTime endDate, Long itemId, Pageable pageable);

}
