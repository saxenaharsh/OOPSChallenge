package com.HarshSaxena;

public class Main {

    public static void main(String[] args) {
	// write your code here
        HamBurger hamBurger = new HamBurger("Base", "Garlic toasted", "Chicken sausage", 350);
        //double price = hamBurger.itemizedHamburgerPrice();
        hamBurger.addHamburgerAddition1("tomato", 25);
        hamBurger.addHamburgerAddition2("Lettuce", 25);
        hamBurger.addHamburgerAddition3("Cheese", 45);
        hamBurger.addHamburgerAddition4("Avacados" , 65.5);
        System.out.println("Price of your itemized burger is " + hamBurger.itemizedHamburgerPrice() + " ₹");

        HealthyBurger healthyBurger = new HealthyBurger("Bacon" , 250.50);
        healthyBurger.addHealthyAddition1("Eggs", 12.50);
        healthyBurger.addHealthyAddition2("Lentils", 11.50);
        System.out.println("Total price of Healthy Hamburger " + healthyBurger.itemizedHamburgerPrice());

        Deluxeburger deluxeburger = new Deluxeburger();
        deluxeburger.addHamburgerAddition1("Cannot do this" , 16);
        System.out.println(deluxeburger.itemizedHamburgerPrice()); 

    }
}
