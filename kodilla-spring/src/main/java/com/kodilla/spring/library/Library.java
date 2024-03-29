package com.kodilla.spring.library;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class Library {

    private final List<String> books = new ArrayList<>();
    private LibraryDbController libraryDbController;

    public Library(final LibraryDbController libraryDbController) {
        this.libraryDbController = libraryDbController;
    }

    public Library() {
    }

    public void saveToDb() {
        libraryDbController.saveData();
    }

    public void loadFromDb() {
        libraryDbController.loadData();
    }

    /*private final List<String> books = new ArrayList<>();

    @Autowired
    private  LibraryDbController libraryDbController;

    public void  saveToDb(){
        libraryDbController.saveData();
    }

    public void loadFromDb() {
        libraryDbController.loadData();
    }*/
/*    private  LibraryDbController libraryDbController;

    @Autowired
    public Library( LibraryDbController libraryDbController) {
        this.libraryDbController = libraryDbController;
    }

    public Library(){
        //do nothing
    }

    public void saveToDb() {
        libraryDbController.saveData();
    }

    public void loadFromDb() {
        libraryDbController.loadData();
    }*/
}
