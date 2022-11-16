package com.kodilla.exception.homework;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class WarehouseTestSuite {

    @Test

    public void testGetOrder_withException () {
        Warehouse warehouse = new Warehouse();

        assertThrows(OrderDoesntExistException.class, () -> warehouse.getOrder("578"));

    }
@Test
    public void TestGetOrder() throws OrderDoesntExistException {
        Warehouse warehouse = new Warehouse();
        warehouse.addOrder(new Order("5236"));

        Order expected = warehouse.getOrder("5236");

        Order expected2 = warehouse.getOrder("5236");
        assertNotNull(expected);
                                                                    // given, then, when muszą mieć ten sam numer zamówienia, inaczej test nie przejdzie.





    }

}