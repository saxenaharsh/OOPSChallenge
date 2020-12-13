package com.HarshSaxena;

public class HealthyBurger extends HamBurger {

    public HealthyBurger(String meat, double price) {
        super("Healthy Burgers", "Brown Rye", meat, price);

    }

    private String healthyAddition1Name;
    private double healthyAddition1Price;

    private String healthyAddition2Name;
    private double healthyAddition2Price;

    public void addHealthyAddition1(String name, double price){
        this.healthyAddition1Name = name;
        this.healthyAddition1Price = price;

    }

    public void addHealthyAddition2(String name, double price){
        this.healthyAddition2Name = name;
        this.healthyAddition2Price = price;

    }

    @Override
    public double itemizedHamburgerPrice() {
        double hamburgerPrice = super.itemizedHamburgerPrice();


        if(healthyAddition1Name != null){
            hamburgerPrice += healthyAddition1Price;
            System.out.println("Added extra " + this.healthyAddition1Name + " for an additional price of " +
                    this.healthyAddition1Price);
        }
        if(healthyAddition2Name != null){
            hamburgerPrice += healthyAddition2Price;
            System.out.println("Added extra " + this.healthyAddition2Name + " for an additional price of " +
                    this.healthyAddition2Price);
        }
        return hamburgerPrice;


    }
}
