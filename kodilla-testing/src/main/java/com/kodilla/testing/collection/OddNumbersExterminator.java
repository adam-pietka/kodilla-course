package com.kodilla.testing.collection;

import java.util.*;
import java.lang.*;

public class OddNumbersExterminator {

    public List<Integer> exterminate(List<Integer> numbers){

        List<Integer> resultList = new ArrayList<>();
        for (Integer i : numbers) {
            if (i % 2 == 0){
                resultList.add(i);
            }
        }
        return resultList;
    }
}


/*
*
*
* ++ W utworzonym pakiecie stwórz klasę OddNumbersExterminator,
* posiadającą metodę public List<Integer> exterminate(List<Integer> numbers)
*       przyjmującą jako argument kolekcję List liczb typu Integer,
*       która zwraca również
*               kolekcję List liczb typu Integer, stanowiącą podzbiór kolekcji wejściowej z pominięciem liczb nieparzystych.
* */