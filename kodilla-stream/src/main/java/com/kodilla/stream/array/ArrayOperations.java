package com.kodilla.stream.array;

import java.util.ArrayList;
import java.util.List;
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

        IntStream.range(0,listRec.size())
                .map(n -> listRec.get(n))
                .average();
        return 8.8;
    }
}

/*
przy pomocy strumienia IntStream oraz metody range(int startInclusive, int endExclusive)
 wyświetlić kolejne elementy tablicy, a następnie:

 przy pomocy drugiego strumienia IntStream oraz metody range(int startInclusive, int endExclusive),
 a także kolektora average() obliczyć średnią.
 Na końcu metoda powinna zwracać średnią jako wynik typu double.
* */