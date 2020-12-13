package com.HarshSaxena;

public class Deluxeburger extends HamBurger {
    public Deluxeburger() {
        super("Deluxe", "White toasted", "Sausage & Bacon", 450);
        super.addHamburgerAddition1("Chips" , 17);
        super.addHamburgerAddition2("Drinks", 25);

    }

    @Override
    public void addHamburgerAddition1(String name, double price) {
        System.out.println("Cannot add additional items to deluxe burger");
    }

    @Override
    public void addHamburgerAddition2(String name, double price) {
        System.out.println("Cannot add additional items to deluxe burger");
    }

    @Override
    public void addHamburgerAddition3(String name, double price) {
        System.out.println("Cannot add additional items to deluxe burger");
    }

    @Override
    public void addHamburgerAddition4(String name, double price) {
        System.out.println("Cannot add additional items to deluxe burger");
    }
}
