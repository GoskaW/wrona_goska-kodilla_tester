package com.kodilla.exception.homework;

import java.util.ArrayList;
import java.util.List;


public class Warehouse {

    List<Order> orderList = new ArrayList<>();

    public void addOrder(Order order) {
        orderList.add(order);
    }

    public Order getOrder(String number) throws OrderDoesntExistException {
        List<Order> checkOrder = orderList
                .stream()
                .filter(order -> order.getNumber().equals(number))
                .toList();

            for (Order order : orderList) {
                if (order.getNumber().equals(number));
                return order;
            }
            throw new OrderDoesntExistException();


        }
    }

















