package com.kodilla.exception.homework;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;


public class Warehouse {

    List<Order> orderList = new ArrayList<>();

    public void addOrder(Order order) {

        orderList.add(order);
    }

    public Order getOrder(String number) throws OrderDoesntExistException {
        List<Order> checkOrder = orderList
                .stream()
                .filter(order -> order.getNumber().equals(number))
                .collect(Collectors.toList());

        if (checkOrder.isEmpty())
            return checkOrder.get(0);
            throw new OrderDoesntExistException();

        }
    }










    }

}
