package com.kodilla.patterns.builder.bigmac;

import java.util.ArrayList;
import java.util.List;

public class BigMac {
    private final String bun;
    private final int burgers;
    private final String sauce;
    private List<String> ingredients = new ArrayList<>();

    public static class BigMacBuilder {
        public String bun;
        public int burgers;
        public String sauce;
        public List<String> ingredients = new ArrayList<>();

        public BigMacBuilder bunType(String bun){
            this.bun = bun;
            return this;
        }

        public BigMacBuilder burgersQuantity(int burgers){
            this.burgers = burgers;
            return this;
        }

        public BigMacBuilder sauceType(String sauce){
            this.sauce = sauce;
            return  this;
        }

        public BigMacBuilder ingredient(String ingredient){
            ingredients.add(ingredient);
            return this;
        }
        public BigMac buildBigMAc(){
            return new BigMac(bun, burgers, sauce, ingredients);
        }

    }
    private BigMac(final String bun,final int burgers,final String sauce, List<String> ingredients) {
        this.bun = bun;
        this.burgers = burgers;
        this.sauce = sauce;
        this.ingredients = new ArrayList<>(ingredients);
    }
//*********************************************************************************1
    public String getBun() {
        return bun;
    }

    public int getBurgers() {
        return burgers;
    }

    public String getSauce() {
        return sauce;
    }

    public List<String> getIngredients() {
        return ingredients;
    }

    @Override
    public String toString() {
        String ingr = "";
        for (int i = 0 ; i< ingredients.size() ; i++){
            ingr = ingr + "\t* " +  ingredients.get(i) + "\n";
        }

        return "BigMac{" +
                "bun='" + bun + '\'' +
                ", burgers=" + burgers +
                ", sauce='" + sauce + '\'' +
                ", ingredients: " +  "\n" + ingr;
    }
}
