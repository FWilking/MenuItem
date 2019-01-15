package com.company;

public class Trio implements MenuItem{

    private final Sandwich sandwich;
    private final Salad salad;
    private final Drink drink;

    public Trio(Sandwich sandwich, Salad salad, Drink drink){
        this.sandwich = sandwich;
        this.salad = salad;
        this.drink = drink;
    }

    public String getName() {
        return this.sandwich.getName() + ", " + this.salad.getName() + ", " + this.drink.getName();
    }

    public double getPrice() {
        double price = 0.0;
        if (this.salad.getPrice() < this.drink.getPrice() && this.salad.getPrice() < this.sandwich.getPrice()){
            price += this.drink.getPrice() + this.sandwich.getPrice();
        }
        else if (this.drink.getPrice() < this.sandwich.getPrice() && this.drink.getPrice() < this.salad.getPrice()){
            price += this.salad.getPrice() + this.sandwich.getPrice();
        }
        else{
            price += this.drink.getPrice() + this.salad.getPrice();
        }
        return price;
    }
}
