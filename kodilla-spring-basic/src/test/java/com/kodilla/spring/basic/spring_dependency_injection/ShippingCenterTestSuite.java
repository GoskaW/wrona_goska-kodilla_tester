package com.kodilla.spring.basic.spring_dependency_injection;

import com.kodilla.spring.basic.spring_dependency_injection.homework.NotificationService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootTest
public class ShippingCenterTestSuite {
    @Test
    public void shouldReturnMessage() {
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring.basic");
        NotificationService bean = context.getBean(NotificationService.class);
        String message = bean.fail("124 Jeryho Str.");
        String message2 = bean.success("33 Black Road");
        Assertions.assertEquals("Package not delivered to: 124 Jeryho Str.", message);
        Assertions.assertEquals("Package delivered to: 33 Black Road", message2);
    }

    @Test
    public void shouldReturnNotNull(){
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring.basic");
        NotificationService bean = context.getBean(NotificationService.class);
        String message = bean.success("33 Denver Road");
        Assertions.assertNotNull(message);
    }


}
