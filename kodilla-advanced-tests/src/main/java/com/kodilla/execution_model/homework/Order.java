package com.kodilla.execution_model.homework;

import java.time.LocalDate;
import java.util.Objects;

public class Order {

    private static double value;
    private static LocalDate orderDate;
    private String login;

    public Order(double value, LocalDate orderDate, String login) {
        this.value = value;
        this.orderDate = orderDate;
        this.login = login;
    }

    public static double getValue() {
        return value;
    }

    public static LocalDate getOrderDate() {
        return orderDate;
    }

    public String getLogin() {
        return login;
    }


    @Override
    public String toString() {
        return "Order{" +
                "value=" + value +
                ", orderDate=" + orderDate +
                ", login='" + login + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Order order = (Order) o;
        return Double.compare(order.value, value) == 0 && Objects.equals(orderDate, order.orderDate) && Objects.equals(login, order.login);
    }

    @Override
    public int hashCode() {
        return Objects.hash(value, orderDate, login);
    }
}

