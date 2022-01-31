package com.company;

public class Container {
    boolean isItBottle;
    boolean isItPlastic;
    double size;

    public Container(boolean isItBottle, boolean isItPlastic, double size) {
        this.isItBottle = isItBottle;
        this.isItPlastic = isItPlastic;
        this.size = size;
    }

    //Scan individual containers and returns correct Pant object.
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
