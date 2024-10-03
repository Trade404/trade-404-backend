package com.ds.trade404.service;

import com.ds.trade404.domain.OrderType;
import com.ds.trade404.modal.Coin;
import com.ds.trade404.modal.Order;
import com.ds.trade404.modal.OrderItem;
import com.ds.trade404.modal.User;

import java.util.List;

public interface OrderService {

    Order createOrder(User user, OrderItem orderItem, OrderType orderType);

    Order getOrderById(Long orderId) throws Exception;

    List<Order> getAllOrdersOfUser(Long userId, OrderType orderType, String assetSymbol);

    Order processOrder(Coin coin, double quantity, OrderType orderType, User user) throws Exception;


}
