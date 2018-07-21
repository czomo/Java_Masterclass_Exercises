package com.company;

public class Hamburger {
    private String name;
    private String meat;
    private double price;
    private String breadRoal;

    private String add1;
    private double add1Price;
    private String add2;
    private double add2Price;
    private String add3;
    private double add3Price;
    private String add4;
    private double add4Price;
    public Hamburger(String name,  String meat, double price, String breadRoal) {
        this.name = name;
        this.meat = meat;
        this.price = price;
        this.breadRoal = breadRoal;
    }
    public void addHamburgeradd1(String name,double price){
        this.add1=name;
        this.add1Price=price;
    }
    public void addHamburgeradd2(String name,double price){
        this.add2=name;
        this.add2Price=price;
    }
    public void addHamburgeradd3(String name,double price){
        this.add3=name;
        this.add3Price=price;
    }
    public void addHamburgeradd4(String name,double price){
        this.add4=name;
        this.add4Price=price;
    }
    public double prizeHam(){
        double HamburgerPrize=this.price;
        System.out.println(this.name+" hamburger "+" on a"+this.breadRoal+" roll "
        +" prize is "+this.price);
        if(this.add1!=null){
            HamburgerPrize+=this.add1Price;
            System.out.println("Added "+this.add1+" for an extra "+this.add1Price);
        }
        if(this.add2!=null){
            HamburgerPrize+=this.add2Price;
            System.out.println("Added "+this.add2+" for an extra "+this.add2Price);
        }
        if(this.add3!=null){
            HamburgerPrize+=this.add3Price;
            System.out.println("Added "+this.add3+" for an extra "+this.add3Price);
        }
        if(this.add4!=null){
            HamburgerPrize+=this.add4Price;
            System.out.println("Added "+this.add4+" for an extra "+this.add4Price);
        }
        return HamburgerPrize;
    }
}
