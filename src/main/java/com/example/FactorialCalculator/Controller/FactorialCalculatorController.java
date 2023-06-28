package com.example.FactorialCalculator.Controller;

import com.example.FactorialCalculator.Service.FactorialCalculatorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalTime;

@RestController
@RequestMapping("/api")
public class FactorialCalculatorController {

    private FactorialCalculatorService factService;

    @Autowired
    public FactorialCalculatorController(FactorialCalculatorService factService) {
        this.factService = factService;
    }

    @GetMapping("/total")
    public int getTotal() {
        return factService.getTotal();
    }

    @GetMapping("/number")
    public int getFactorial(@RequestParam(required = true) String number) {
        return factService.getFactorial(number);
    }
}
