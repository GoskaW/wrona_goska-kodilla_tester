package com.kodilla.execution_model.homework;

import java.util.HashSet;
import java.util.Set;

public class Shop {

   Set<Order> orderSet = new HashSet<>();

    public void addOrder(Order order){
        this.orderSet.add(order);
    }


    public int getSize(){
        return this.orderSet.size();
    }
}
