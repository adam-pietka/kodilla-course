package com.kodilla.patterns.builder.bigmac;

import java.util.ArrayList;
import java.util.List;

public class BigMac {
    private final String bun;
    private final int burgers;
    private List<String> sauces = new ArrayList<>();
    private List<String> ingredients = new ArrayList<>();

    public static class BigMacBuilder {
        public String bun;
        public int burgers;
        public List<String> sauces = new ArrayList<>();
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
            sauces.add(sauce);
            return this;
        }

        public BigMacBuilder ingredient(String ingredient){
            ingredients.add(ingredient);
            return this;
        }
        public BigMac buildBigMAc(){
            if (bun == null || burgers == 0){
                System.out.println("BUN and at least one burger are required.");
                throw new  IllegalStateException("BUN and at least one burger are required.");
            }

            return new BigMac(bun, burgers, sauces, ingredients);
        }

    }
    private BigMac(final String bun,final int burgers,final List<String> sauces, List<String> ingredients) {
        this.bun = bun;
        this.burgers = burgers;
        this.sauces = new ArrayList<>(sauces);
        this.ingredients = new ArrayList<>(ingredients);
    }
//*********************************************************************************1
    public String getBun() {
        return bun;
    }

    public int getBurgers() {
        return burgers;
    }

    public List<String> getSauce() {
        return sauces;
    }

    public List<String> getIngredients() {
        return ingredients;
    }

    public String toString() {
        return "BigMac {" +
                "bun='" + bun + '\'' +
                ", burgers=" + burgers +
                ", sauce='" + sauces + '\'' +
                ", ingredients: " +  ingredients + "}.";
    }
}
