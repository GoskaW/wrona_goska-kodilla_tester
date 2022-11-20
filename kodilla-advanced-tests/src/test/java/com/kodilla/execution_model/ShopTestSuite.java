package com.kodilla.execution_model;

import com.kodilla.execution_model.homework.Order;
import com.kodilla.execution_model.homework.Shop;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;

public class ShopTestSuite {

    Shop shop = new Shop();
    Order order1 = new Order(350, LocalDate.of(2022,11,10), "nn222");
    Order order2 = new Order(250, LocalDate.of(2022,11,19), "dwse3");
    Order order3 = new Order(52, LocalDate.of(2022,11,17), "bb54");
    Order order4 = new Order(199, LocalDate.of(2022,11,24), "mjnhb7");
    Order order5 = new Order(758, LocalDate.of(2022,11,15), "mklop");
    Order order6 = new Order(36, LocalDate.of(2022,11,11), "edres");

        @Test
    public void shoulAddOrder(){
        int orders = shop.getSize();

        assertEquals(6, shop.getSize());
    }
    @Test
    public void shouldReturnValueOfOrder() {
            double result = order1.getValue();

            assertEquals(350, order1.getValue());
           }
           @Test
           public void shouldReturnDateOfOrder(){

               Set<Order> findOrder = new HashSet<>();
            LocalDate.of(2022,11,19);

            Set<Order> orders = new HashSet<>();
            orders.add(order2);

            assertEquals(findOrder, orders);
           }

           @Test
           public void checkSumValueOfOrder() {
               shop.getSumOfAllOrder();
               assertEquals(1645, shop.getSumOfAllOrder());

           }

           @Test
           public void checkLogin() {
               String login = order1.getLogin();
               String login2 = order2.getLogin();

               assertTrue(login.contains("nn222"));
               assertTrue(login2.contains("dwse3"));














           }

           @BeforeEach
    public void initializeOrder(){
        shop.addOrder(order1);
        shop.addOrder(order2);
        shop.addOrder(order3);
        shop.addOrder(order4);
        shop.addOrder(order5);
        shop.addOrder(order6);
           }

    @BeforeAll
    public static void displayIntroMessage() {
        System.out.println("Starting testing");
    }
}

