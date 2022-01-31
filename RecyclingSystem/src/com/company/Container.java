package com.company;

import java.util.ArrayList;

public class Container {
    boolean isItBottle;
    boolean isItPlastic;
    double size;

    public Container(boolean isItBottle, boolean isItPlastic, double size) {
        this.isItBottle = isItBottle;
        this.isItPlastic = isItPlastic;
        this.size = size;
    }

    public boolean isItBottle() {
        return isItBottle;
    }

    public void setItBottle(boolean itBottle) {
        isItBottle = itBottle;
    }

    public boolean isItPlastic() {
        return isItPlastic;
    }

    public void setItPlastic(boolean itPlastic) {
        isItPlastic = itPlastic;
    }

    public double getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public Pant scanItems() {

        Pant pantA = new Pant(1,"PantA");
        Pant pantB = new Pant(1.5, "PantB");
        Pant pantC = new Pant(3, "PantC");

        //Pant B
        if (isItBottle && isItPlastic && size == 0.5) {
            return pantB;
            //Pant C
        } else if (size >= 1) {
            return pantC;

            //Pant A (1 liter comes here too)
        } else {
           return pantA;
        }
    }

}
