package com.kodilla.exception.homework;

public class WarehouseApp {
    public static void main(String[] args) {
        Warehouse warehouse = new Warehouse();
        warehouse.addOrder(new Order("5236"));
        warehouse.addOrder(new Order("2145ds"));
        warehouse.addOrder(new Order("tr45dfv"));
        warehouse.addOrder(new Order("14fv1"));
        warehouse.addOrder(new Order("236dc"));


    }
}