package com.xworkz.shopapp.shop;

public class Tubelight implements Switch{
    @Override
    public void sOn() {
        System.out.println("Tube light is turned on");
    }

    @Override
    public void sOff() {
        System.out.println("Tube light is turned off");


    }
}
