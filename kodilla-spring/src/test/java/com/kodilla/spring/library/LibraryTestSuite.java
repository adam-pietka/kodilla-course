package com.kodilla.spring.library;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Arrays;

@SpringBootTest
public class LibraryTestSuite {

    @Autowired
    private Library library;

    @Test
    void testLoadFromDb() {
        //Given
        /*ApplicationContext context =
                new AnnotationConfigApplicationContext("com.kodilla.spring");
        Library library = context.getBean(Library.class);*/

        //When
        library.loadFromDb();

        //Then
        //do nothing
    }


    @Test
    void testSaveToDb() {
        //Given
       /* ApplicationContext context =
                new AnnotationConfigApplicationContext("com.kodilla.spring");
        Library library = context.getBean(Library.class);*/
        //When
        library.saveToDb();
        //Then
        //do nothing
    }

    @Test
    void testContext(){
        //Given
        ApplicationContext context =
                new AnnotationConfigApplicationContext("com.kodilla.spring");
//                new AnnotationConfigApplicationContext(LibraryConfig.class);

        //When $ then
        System.out.println(" === Bean list ======= >>");
        Arrays.stream(context.getBeanDefinitionNames())
                .forEach(System.out::println);
        System.out.println("<< ==== end Bean list  ============= ");

    }
}
