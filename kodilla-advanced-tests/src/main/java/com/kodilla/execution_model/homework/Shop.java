package com.kodilla.execution_model.homework;

import java.util.ArrayList;
import java.util.List;

public class Shop {

    private List<Order> orderList = new ArrayList<>();

    public void addOrder(Order order){
        this.orderList.add(order);
    }

    public int getSize(){
        return this.orderList.size();
    }
}
