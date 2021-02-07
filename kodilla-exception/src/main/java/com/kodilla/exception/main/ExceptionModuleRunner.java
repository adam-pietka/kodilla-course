package com.kodilla.exception.main;

import com.kodilla.exception.io.FileReader;
import com.kodilla.exception.io.FileReaderException;
import com.kodilla.exception.io.FileReaderWithoutHandling;
import com.kodilla.exception.test.SecondChallenge;

import javax.imageio.IIOException;
import java.io.IOException;

public class ExceptionModuleRunner {
    public static void main(String[] args) throws Exception {

        // ver 3
        FileReader fileReader = new FileReader();
        try {
            fileReader.readFile();
        } catch (FileReaderException e ) {
            System.out.println("Problem while reading FILE!!!");
        }

        // ver 2
        /*FileReaderWithoutHandling fileReader = new FileReaderWithoutHandling();
        try {
            fileReader.readFile();
        } catch (IOException e) {
            System.out.println("Error" + e);
        }*/
        // ver 1
        /*FileReader fileReader = new FileReader();
        fileReader.readFile();*/


    }
}