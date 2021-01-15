package com.kodilla.testing.calculator;

public class Calculator {
    private int valueA;
    private int valueB;

    public Calculator(int valueA, int valueB){
        this.valueA =valueA;
        this.valueB = valueB;
    }

    public int addValues(){
        return valueA + valueB;
    }
    public int subtractValue(){
        return valueA - valueB;
    }
}
