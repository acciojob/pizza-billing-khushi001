package com.driver;

public class DeluxePizza extends Pizza {

    public DeluxePizza(Boolean isVeg) {
        super(isVeg);
        // your code goes here
        Deluxe = true;
        hasExtraCheese = true;
        hasExtraToppings = true;
    }
}
