package com.kodilla.spring.portfolio;

import org.springframework.beans.factory.annotation.Autowired;

public class BoardConfig {
    @Autowired
    TaskList task;

}

/*
 + Napisz klasę konfigurującą beany o nazwie BoardConfig,
która utworzy trzy różne beany reprezentujące listy zadań i wstrzyknie je do beana klasy Board.

 */