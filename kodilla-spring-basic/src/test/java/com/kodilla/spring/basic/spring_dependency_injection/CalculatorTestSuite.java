package com.kodilla.spring.basic.spring_dependency_injection;

import com.kodilla.spring.basic.spring_dependency_injection.homework.Calculator;
import com.kodilla.spring.basic.spring_dependency_injection.homework.Display;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootTest
public class CalculatorTestSuite {

    @Test
    public void shouldReturnSum() {
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring.basic");
        Calculator bean = context.getBean(Calculator.class);
        double sum = bean.add(34, 2);
        Assertions.assertEquals(36,sum);
    }

    @Test
    public void shouldReturnSub() {
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring.basic");
        Calculator bean = context.getBean(Calculator.class);
        double sub = bean.sub(55, 25);
        Assertions.assertEquals(30, sub);
    }

    @Test
    public void shouldReturnMul() {
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring.basic");
        Calculator bean = context.getBean(Calculator.class);
        double mul = bean.mul(5, 7);
        Assertions.assertEquals(35, mul);
    }

    @Test
    public void shouldReturnDivide() {
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring.basic");
        Calculator bean = context.getBean(Calculator.class);
        double divide = bean.divide(6,2);
        Assertions.assertEquals(3, divide);

    }
    @Test
    public void shouldReturnNotNull() {
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring.basic");
        Display bean = context.getBean(Display.class);
        double value = bean.display(9);
        Assertions.assertNotNull(value);
    }
}
