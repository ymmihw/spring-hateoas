package com.ymmihw.spring.hateoas.service;

import java.util.List;
import com.ymmihw.spring.hateoas.model.Order;

public interface OrderService {

  List<Order> getAllOrdersForCustomer(String customerId);

  Order getOrderByIdForCustomer(String customerId, String orderId);

}
