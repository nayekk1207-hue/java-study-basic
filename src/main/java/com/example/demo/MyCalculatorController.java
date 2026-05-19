package com.example.demo;

import org.springframework.web.bind.annotation.*;

@RestController
public class MyCalculatorController {

    private final CalculatorService calculatorService;

    public MyCalculatorController(CalculatorService calculatorService) {
        this.calculatorService = calculatorService;
    }

    @GetMapping("/add")
    public int add(
            @RequestParam int number1,
            @RequestParam int number2
    ) {
        return calculatorService.add(number1, number2);
    }

    @GetMapping("/subtract")
    public int subtract(
            @RequestParam int number1,
            @RequestParam int number2
    ) {
        return calculatorService.subtract(number1, number2);
    }

    @PostMapping("/multiply")
    public int multiply(
            @RequestBody MultiplyRequest request
    ) {
        return calculatorService.multiply(
                request.getNumber1(),
                request.getNumber2()
        );
    }

    @PostMapping("/divide")
    public int divide(
            @RequestBody MultiplyRequest request
    ) {
        return calculatorService.divide(
                request.getNumber1(),
                request.getNumber2()
        );
    }
}