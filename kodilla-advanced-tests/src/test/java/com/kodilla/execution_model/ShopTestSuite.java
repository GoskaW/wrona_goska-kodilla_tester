package com.kodilla.execution_model;

import com.kodilla.execution_model.homework.Order;
import com.kodilla.execution_model.homework.Shop;

import java.time.LocalDate;

public class ShopTestSuite {

    Shop shop = new Shop();
    Order order1 = new Order(350, LocalDate.of(2022,11,22), "nn222");       // dodam kilka zamówien

    public void shouldAddOrder() {          //czy dodają sie zamówienia

    }
    public void shouldReturnValueOfOrder() {
                                                    //zwrócić wartość zamówienia
           }

           public void shouldReturnDateOfOrder(){
                                                        //data zamówienia

           }

           public void checkSumValueOfOrder() {
                                                    // suma zamówień
           }


           public void shouldReturnOrderFindByLogin() {
                                                            // zamówienie wyszukane po loginie
           }
}

