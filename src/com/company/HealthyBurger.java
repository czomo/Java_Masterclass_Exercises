package com.company;

public class HealthyBurger extends  Hamburger {
    private String healthyName;
    private double healthyPrice;
    private String healthyName1;
    private  double healthyPrice1;

    public HealthyBurger(String meat, double price) {
        super("healthy", meat, price, "brown");
    }
    public void addHealtAddition1(String name,double price){
        this.healthyName=name;
        this.healthyPrice=price;
    }
    public void addHealtAddition2(String name,double price){
        this.healthyName1=name;
        this.healthyPrice1=price;
    }

    @Override
    public double prizeHam() {
        double HamburgerPrize= super.prizeHam();
        if(this.healthyName!=null){
            HamburgerPrize+=healthyPrice;
            System.out.println("Added "+this.healthyName+" for an extra"+this.healthyPrice);
        }
        if(this.healthyName1!=null){
            HamburgerPrize+=healthyPrice1;
            System.out.println("Added "+this.healthyName1+" for an extra"+this.healthyPrice1);
        }
        return HamburgerPrize;
    }
}
