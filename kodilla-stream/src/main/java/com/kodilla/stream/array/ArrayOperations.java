package com.kodilla.stream.array;

import java.util.ArrayList;
import java.util.List;
import java.util.OptionalDouble;
import java.util.stream.IntStream;

public interface ArrayOperations {

    static double getAverage(int[] numbers) {
        //int[] receivedTable = numbers;
        List<Integer> listRec = new ArrayList<>();
        for (int i : numbers) {
            listRec.add(i);
        }
        IntStream.range(0, listRec.size())
                .map(n -> listRec.get(n) )
                .forEach(System.out::println);

        return   IntStream.range(0,listRec.size())
                //.mapToDouble(n -> listRec.get(n))
                .map(n -> listRec.get(n))
                .average().getAsDouble();
    }
}