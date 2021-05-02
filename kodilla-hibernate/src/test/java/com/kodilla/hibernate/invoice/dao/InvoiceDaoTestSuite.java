package com.kodilla.hibernate.invoice.dao;

import com.kodilla.hibernate.invoice.Item;
import com.kodilla.hibernate.invoice.Product;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertNotEquals;

@SpringBootTest
public class InvoiceDaoTestSuite {

    @Autowired
    private  ProductDao productDao;
    private ItemDao itemDao;
//    private InvoiceDao invoiceDao;

    @Test
    void testSavePoduct(){
        //G
        Product productCar = new Product("Red car are faster that blue");
        //W
        productDao.save(productCar);
        int getIdProdCar =  productCar.getId();

        //T
        assertNotEquals(0, getIdProdCar);

        //CleanUp
        productDao.deleteById(getIdProdCar);

    }

    @Test
    void testSaveItems(){
        //G
        Product productPen = new Product("Gel Pen - BLUE");
        Item itemFirst = new Item(new BigDecimal(12), 1, new BigDecimal(10));
        Item itemSecond = new Item(new BigDecimal(99), 3, new BigDecimal(297));

        itemFirst.setProduct(productPen);
        itemSecond.setProduct(productPen);

        productPen.getItem().add(itemFirst);
        productPen.getItem().add(itemSecond);

        //W
        productDao.save(productPen);
        int idTest = productPen.getId();

        //T
        assertNotEquals(0, idTest);

       //CleanUp
//        productDao.deleteAll();
//        itemDao.deleteAll();

    }

    /*@Test
    void testInvoiceDaoSave(){
        //G
        Product productOne = new Product("Desk");
        Product productTwo = new Product("Lamp");
        Product productThree = new Product("Pen");

        Item itemFirst = new Item( new BigDecimal(50),3, new BigDecimal(44));
        itemFirst.getProduct().add(productOne);
        itemFirst.getProduct().add(productTwo);
        itemFirst.getProduct().add(productThree);

        //W

        //T
    }*/

}

/* Napisz test o nazwie testInvoiceDaoSave(),
    sprawdzający, czy faktura z kilkoma pozycjami
     zapisuje się poprawnie w bazie danych */
