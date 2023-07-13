package com.driver;

public class Pizza {

    public int price;
    private Boolean isVeg;
    private String bill;
    public boolean hasExtraCheese;
    public boolean hasExtraToppings;
    private boolean takeaway;
    public boolean Deluxe;

    public Pizza(Boolean isVeg){
        this.isVeg = isVeg;
        // your code goes here
        if(isVeg){
            price=300;
        }else{
            price = 400;
        }

    }

    public int getPrice(){
        return this.price;
    }

    public void addExtraCheese(){
        // your code goes here
        if (!hasExtraCheese) {
            hasExtraCheese = true;
        }
    }

    public void addExtraToppings(){
        // your code goes here
        if (!hasExtraToppings) {
            hasExtraToppings = true;
        }
    }

    public void addTakeaway(){
        // your code goes here
        if (!takeaway) {
            takeaway = true;
        }
    }

    public String getBill(){
        // your code goes here
        bill=("Base Price Of The Pizza: ");
        bill+=(isVeg ? 300 : 400);
        bill+=("\n");
        price = (isVeg ? 300 : 400);
        if(Deluxe){
            if (!isVeg) {
                price+=200;
                bill+=("Extra Cheese Added: 80\n");
                bill+=("Extra Toppings Added: 120\n");
                if (takeaway) {
                    price+=20;
                    bill+=("Paperbag Added: 20\n");
                }
            } else {
                price+=150;
                bill+=("Extra Cheese Added: 80\n");
                bill+=("Extra Toppings Added: 70\n");
                if (takeaway) {
                    price+=20;
                    bill+=("Paperbag Added: 20\n");
                }
            }
        }
        else{
            if (!isVeg) {
                if (hasExtraCheese) {
                    price+=80;
                    bill+=("Extra Cheese Added: 80\n");
                }
                if (hasExtraToppings) {
                    price+=120;
                    bill+=("Extra Toppings Added: 120\n");
                }
                if (takeaway) {
                    price+=20;
                    bill+=("Paperbag Added: 20\n");
                }
            } else {
                if (hasExtraCheese) {
                    price+=80;
                    bill+=("Extra Cheese Added: 80\n");
                }
                if (hasExtraToppings) {
                    price+=70;
                    bill+=("Extra Toppings Added: 70\n");
                }
                if (takeaway) {
                    price+=20;
                    bill+=("Paperbag Added: 20\n");
                }
            }
        }

        bill+=("Total Price: "+price+"\n");


        return this.bill;
    }
}
