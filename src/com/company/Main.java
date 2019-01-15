package com.company;

public class Main {

    public static void main(String[] args) {
        Sandwich reuben = new Sandwich(5.75, "Reuben");
        Sandwich bec = new Sandwich(2.00, "BEC");
        Salad waldorf = new Salad(7.27, "Waldorf");
        Salad caeser = new Salad(4.50, "Caeser");
        Drink icedTea = new Drink(1.50, "Iced Tea");
        Drink smoothie = new Drink(5.50, "Smoothie");

        Trio trio1 = new Trio(reuben, waldorf, icedTea);
        Trio trio2 = new Trio(bec, caeser, smoothie);
        Trio trio3 = new Trio(bec, caeser, icedTea);

        System.out.println(trio1.getName() + " Price: " + trio1.getPrice());
        System.out.println(trio2.getName() + " Price: " + trio2.getPrice());
        System.out.println(trio3.getName() + " Price: " + trio3.getPrice());

    }
}
