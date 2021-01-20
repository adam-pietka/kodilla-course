package com.kodilla.testing.collection;

import com.kodilla.testing.collection.OddNumbersExterminator;
import org.junit.jupiter.api.*;

import java.util.*;

public class CollectionTestSuite {
     @BeforeEach
    public void beforeEach(){
        System.out.println("Test Case for \'Collection\': begin.");
    }
    @AfterEach
    public void afterEach(){
         System.out.println("Test Case for \'Collections\': end.\n");
    }

    @BeforeAll
    public static void beforeAll(){
         System.out.println("******************* Test Suite: BEGINE!!! **********************\n");
    }

    @AfterAll
    public  static void afterAll(){
        System.out.println("************* Test Suite: END pls check result. *************");
    }

    @DisplayName("Test for empty list")
    @Test
    void testOddNumbersExterminatorEmptyList(){
        List<Integer> emptyList = new ArrayList<>();
        OddNumbersExterminator testEmptyList = new OddNumbersExterminator();

        List<Integer> compareEmptyList = new ArrayList<>(); // [utworzenie póstej listy do porównania]

        Assertions.assertEquals( compareEmptyList, testEmptyList.exterminate(emptyList));
    }

    @DisplayName("Test for normal list, with numbers")
    @Test
    void testOddNumbersExterminatorNormalList() {
        List<Integer> test01 = new ArrayList<>();
        test01.add(0);
        test01.add(1);
        test01.add(2);
        test01.add(3);
        test01.add(4);
        test01.add(5);
        test01.add(-54);

        OddNumbersExterminator listTest01 = new OddNumbersExterminator();

        List<Integer> selectedNumbers = new ArrayList<>(); // [utworzenie listy z liczbami parzystymi]
        selectedNumbers.add(0);
        //selectedNumbers.add(1);
        selectedNumbers.add(2);
        //selectedNumbers.add(3);
        selectedNumbers.add(4);
        //selectedNumbers.add(5);
        selectedNumbers.add(-54);

        //listTest01.exterminate(test01);
        Assertions.assertEquals(selectedNumbers, listTest01.exterminate(test01));
    }
}