package com.kodilla.stream.beautifier;

public class PoemBeautifier {
    // klasa - która będzie posiadała metodę beautify,
    // której jako parametry będzie można przekazać tekst do upiększenia
    // oraz wyrażenie lambda upiększające tekst.
    public void beautify(String text, PoemDecorator poemDecorator){
        String result = poemDecorator.decorate(text);
        System.out.println("Result of PoemDecorator is: " + result);
    }
}