package com.example.FactorialCalculator.Service;

import org.springframework.stereotype.Service;

import java.text.ParseException;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

@Service
public class FactorialCalculatorService {

    int total = 0;
    int gesamtnum = 1;

    public int getTotal() {
        total += gesamtnum;
        return total;
    }

    public int getFactorial(String number) {
        int num;
        num = Integer.parseInt(number.substring(1,number.length()));

        String ersteszeichen = number.substring(0,1);

        if (num > 0 && ersteszeichen.equals("!")) {
            for (int i = 1; i <= num; i++) {
                gesamtnum *= i;
            }
        }
        return gesamtnum;
    }
}
