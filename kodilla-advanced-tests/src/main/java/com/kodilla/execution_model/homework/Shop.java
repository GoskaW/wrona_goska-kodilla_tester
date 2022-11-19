package com.kodilla.execution_model.homework;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

public class Shop {

   Set<Order> orderSet = new HashSet<>();

    public void addOrder(Order order){
        orderSet.add(order);
    }
    public Set<Order> getOrderByDate(LocalDate fromDate, LocalDate toDate) {
        return orderSet
                .stream()
                .filter(order-> Order.getOrderDate().isBefore(fromDate))
                .filter(order-> Order.getOrderDate().isAfter(toDate))
                .collect(Collectors.toSet());

    }

    public Set<Order> getOrderByValue (double minValue, double maxValue) {
        return orderSet
                .stream()
                .filter(order-> Order.getValue() <= minValue)
                .filter(order -> Order.getValue() >= maxValue)
                .collect(Collectors.toSet());

    }

    public int getSize(){
        return orderSet.size();
    }

    public double getSumOfAllOrder(){
        double sumOfOrder = 0;
        for (Order order : orderSet) {
            sumOfOrder += Order.getValue();
            }
        return sumOfOrder;
    }
}
