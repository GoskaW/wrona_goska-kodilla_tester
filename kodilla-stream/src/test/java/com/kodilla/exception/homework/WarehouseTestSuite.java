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
        warehouse.addOrder(new Order("2523"));

        Order expected = warehouse.getOrder("5124");

        Order expected2 = warehouse.getOrder("5124");
        assertEquals(expected2, expected);
                                                                    // AssertTrue zwraca boolean, a ja nie mam metody z tym typem
                                                                    // AssertThrow - powtórze asercje z testu z Exception (więc bez sensu)
                                                                    // najbardziej pasuje assertEqual, ale coś tu jest nie tak





    }

}