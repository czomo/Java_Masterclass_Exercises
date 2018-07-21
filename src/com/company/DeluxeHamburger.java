package com.company;

public class DeluxeHamburger extends Hamburger {
    public DeluxeHamburger(){
        super("Delux","beaceon and kebvab",10,"white");
        super.addHamburgeradd1("chips",2);
        super.addHamburgeradd2("fish",4);
    }

    @Override
    public void addHamburgeradd1(String name, double price) {
        System.out.println("ACCES deined");
    }

    @Override
    public void addHamburgeradd2(String name, double price) {
        System.out.println("ACCES deined");
    }

    @Override
    public void addHamburgeradd3(String name, double price) {
        System.out.println("ACCES deined");
    }

    @Override
    public void addHamburgeradd4(String name, double price) {
        System.out.println("ACCES deined");
    }
}
