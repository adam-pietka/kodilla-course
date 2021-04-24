package com.kodilla.stream.invoice.simple;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class SimpleInvoiceTestSuite {

    @Test
    void testGetValueToPay() {
        //Given
        SimpleInvoice invoice = new SimpleInvoice();

        //When
        invoice.addItem(new SimpleItem(new SimpleProduct("Product 1", 17.28), 2.0));
        invoice.addItem(new SimpleItem(new SimpleProduct("Product 2", 11.99), 3.5));
        invoice.addItem(new SimpleItem(new SimpleProduct("Product 3",  6.49), 5.0));

        invoice.getValueToPay();

        //Then
        assertEquals(108.975, invoice.getValueToPay(), 0.001);
    }

    @Test
    void testGetValue(){


        /*Twoim celem jest prześledzenie metody getValue() klasy SimpleItem,
         ale tylko w sytuacji, gdy produktem, którego dotyczy pozycja faktury,
          jest produkt o nazwie "Product 2".
         * Zdefiniuj w tej metodzie breakpoint warunkowy
         (z warunkiem na nazwę produktu),
         a następnie uruchom test w trybie "debug".
         Zrób zrzut ekranu pokazujący wartości zmiennych
         w metodzie getValue().*/
    }
}