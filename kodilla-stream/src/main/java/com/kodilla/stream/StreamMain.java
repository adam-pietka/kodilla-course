package com.kodilla.stream;
import com.kodilla.stream.lambda.ExpressionExecutor;
import  com.kodilla.stream.beautifier.PoemBeautifier;


public class StreamMain {

    public static void main(String[] args) {
        System.out.println("============  Lest start modul no. 7 ================================== ");
        //SaySomething saySomething = new SaySomething();
        //saySomething.say();



        //Kod dla trzeciej  wersji kodu ************************
        // ****************************************************************************
        ExpressionExecutor expressionExecutor = new ExpressionExecutor();
        System.out.println("Calculating expressions with lambdas");
        System.out.println();

        PoemBeautifier poemBeautifier = new PoemBeautifier();
        poemBeautifier.beautify("aaaa", (text)-> text + "bbb");
        poemBeautifier.beautify("Pitt", (text)-> "Start " + text + " END");
        poemBeautifier.beautify("Pitt", (text)-> "Start " + text + " END");
        poemBeautifier.beautify("bang bang lucky luck", (text)->  text.toUpperCase());
        poemBeautifier.beautify("this is short sentence.",(text)-> text + ". Length of it, it's: " +  text.length());
        poemBeautifier.beautify("UP and Down, AND UP and DOWN!!!",(text)-> text.toLowerCase() );
//        poemBeautifier.beautify("UP and Down, AND UP and DOWN!!!",(text)-> text.toCharArray() );
        poemBeautifier.beautify("CryFish goes back.",(text) -> {
            String reverseWord = "";
            int wordLenght = text.length()  ;
            for(int i= 0; i < wordLenght  ; i++ ){
                reverseWord = reverseWord + text.charAt(wordLenght - (i+1) ) ;
            }
            return reverseWord;
        } );


        /*
        expressionExecutor.executeExpression(10, 5, (a, b) -> a + b);
        expressionExecutor.executeExpression(10, 5, (a, b) -> a - b);
        expressionExecutor.executeExpression(10, 5, (a, b) -> a * b);
        expressionExecutor.executeExpression(10, 5, (a, b) -> a / b);


        System.out.println("Calculating expressions with method references");
        expressionExecutor.executeExpression(3, 4, FunctionalCalculator::multiplyAByB);
        expressionExecutor.executeExpression(3, 4, FunctionalCalculator::addAToB);
        expressionExecutor.executeExpression(3, 4, FunctionalCalculator::subBFromA);
        expressionExecutor.executeExpression(3, 4, FunctionalCalculator::divideAByB);

         */

 /*
        // Kod dla drugirj  wersji kodu ************************
        Processor processor = new Processor();
        Executor codeToExecute = () ->  {
            System.out.println("This is an example text.");
            System.out.println("second code line");
        };
        //Executor codeToExecute = () ->  System.out.println("without{} when code in ONE line ");
        processor.execute(codeToExecute);

  */


        /*
        Kod dla pierszej wersji kodu ************************
        Processor processor = new Processor();
        ExecuteSaySomething executeSaySomething =new ExecuteSaySomething();
        processor.execute(executeSaySomething);

         */
    }
}

