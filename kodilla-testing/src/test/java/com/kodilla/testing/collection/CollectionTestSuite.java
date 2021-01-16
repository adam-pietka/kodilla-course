package com.kodilla.testing.collection;

import com.kodilla.testing.collection.OddNumbersExterminator;
import org.junit.jupiter.api.*;

import java.util.*;

public class CollectionTestSuite {


    @BeforeEach
    public void beforeEach(){
        System.out.println("Test Case for \'Collection\': begin. " +
                "Result is available below.");
    }
    @AfterEach
    public void afterEach(){
        System.out.println("Test Case for \'Collections\': end.\n");
    }
    @BeforeAll
    public static void beforeAll(){
        System.out.println("Test Suite: BEGINE!!!\n");
    }
    @AfterAll
    public  static void afterAll(){
        System.out.println("Test Suite: END pls check result.");
    }

    @DisplayName("Test for empty list")
    @Test
    void testOddNumbersExterminatorEmptyList(){
        List<Integer> emptyList = new ArrayList<>();
        OddNumbersExterminator testEmptyList = new OddNumbersExterminator();
        testEmptyList.exterminate(emptyList);
        System.out.println(testEmptyList.exterminate(emptyList));
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
        listTest01.exterminate(test01);
        System.out.println(listTest01.exterminate(test01));

    }


}


/*
* W utworzonym pakiecie stwórz klasę testową (zbiór testów) CollectionTestSuite, a w niej napisz testy sprawdzające,
* czy metoda filtrująca liczby nieparzyste działa poprawnie:
        *   testOddNumbersExterminatorEmptyList – sprawdzający, czy klasa zachowuje się poprawnie, gdy lista jest pusta,
        *   testOddNumbersExterminatorNormalList – sprawdzający, czy klasa zachowuje się poprawnie, gdy lista zawiera liczby parzyste i nieparzyste.

* Korzystając z adnotacji @DisplayName nadaj powyższym metodom nazwę określającą, co dany test sprawdza.
* Użyj również adnotacji @BeforeEach oraz @AfterEach, aby wyświetlić informację o tym, jakie operacje (testy) są aktualnie wykonywane.
* */