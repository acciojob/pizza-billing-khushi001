package com.driver;

public class DeluxePizza extends Pizza {

    public DeluxePizza(Boolean isVeg) {
        super(isVeg);
        // your code goes here
        Deluxe=true;
        if(isVeg){
            price=450;
        }else{
            price = 600;
        }
        hasExtraCheese = true;
        hasExtraToppings = true;
    }
}
