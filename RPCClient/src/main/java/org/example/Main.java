package org.example;

import org.example.service.SimpleMethod;

import java.rmi.Naming;

public class Main {
    public static void main(String[] args) {
        try {
            SimpleMethod calculator = (SimpleMethod) Naming.lookup("rmi://localhost:1099/CalculatorService");
            int result = calculator.add(10, 20);
            System.out.println("Result: " + result);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}