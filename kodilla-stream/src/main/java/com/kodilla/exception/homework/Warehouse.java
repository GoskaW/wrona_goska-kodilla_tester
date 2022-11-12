package com.kodilla.exception.homework;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;


public class Warehouse {

    List<Order> orderList = new ArrayList<>();

    public void addOrder(Order order) {
        orderList.add(order);
    }

    public Order getOrder(String number) {
        List<Order> checkOrder = orderList
                .stream()
                .filter(order -> order.getNumber().equals(number))
                .collect(Collectors.toList());

        return checkOrder;
    }
}









    }

}
