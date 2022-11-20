package com.kodilla.execution_model.homework;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Shop {

  List<Order> orderList = new ArrayList<>();

    public void addOrder(Order order){

      orderList.add(order);
    }
    public List<Order> getOrderByDate(LocalDate fromDate, LocalDate toDate) {
        return orderList
                .stream()
                .filter(order-> Order.getOrderDate().isBefore(fromDate))
                .filter(order-> Order.getOrderDate().isAfter(toDate))
                .collect(Collectors.toList());

    }

    public List<Order> getOrderByValue (double minValue, double maxValue) {
        return orderList
                .stream()
                .filter(order-> Order.getValue() <= minValue)
                .filter(order -> Order.getValue() >= maxValue)
                .collect(Collectors.toList());

    }

    public int getSize(){

      return orderList.size();
    }

    public double getSumOfAllOrder(){
        double sumOfOrder = 0;
        for (Order order : orderList) {
            sumOfOrder += Order.getValue();
            }
        return sumOfOrder;
    }
}
