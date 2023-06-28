package com.example.FactorialCalculator.Tests;

import com.example.FactorialCalculator.Controller.FactorialCalculatorController;
import com.example.FactorialCalculator.Service.FactorialCalculatorService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest;

import java.time.LocalTime;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
public class FactorialCalculatorTests {
    @Autowired
    private FactorialCalculatorService factService;

    @Autowired
    private FactorialCalculatorController factController;

    @Test
    public void testgetFactorial() {
        //Arrange - Act - Assert
        assertThat(factService.getFactorial("!5")).isEqualTo(120);
    }
}
