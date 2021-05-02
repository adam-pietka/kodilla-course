package com.kodilla.hibernate.invoice.dao;

import com.kodilla.hibernate.invoice.Invoice;
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
    @Autowired
    private ItemDao itemDao;
    @Autowired
    private InvoiceDao invoiceDao;

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

    @Test
    void testInvoiceDaoSave(){
        //G
        Product productOne = new Product("Desk");
//        Product productTwo = new Product("Lamp");

        Item itemFirst = new Item( new BigDecimal(50),3, new BigDecimal(44));
        Item itemSecond = new Item( new BigDecimal(11),2, new BigDecimal(22));

        itemFirst.setProduct(productOne);
        productOne.getItem().add(itemFirst);

        itemSecond.setProduct(productOne);
        productOne.getItem().add(itemSecond);

        Invoice invoiceTest = new Invoice("INV: 2021/858");
        itemFirst.setInvoice(invoiceTest);
        itemSecond.setInvoice(invoiceTest);

        invoiceTest.getItems().add(itemFirst);
        invoiceTest.getItems().add(itemSecond);

//        productDao.save(productOne);
        invoiceDao.save(invoiceTest);
        //W

        //T

    }

}

/* Napisz test o nazwie testInvoiceDaoSave(),
    sprawdzający, czy faktura z kilkoma pozycjami
     zapisuje się poprawnie w bazie danych */
