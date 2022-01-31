package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Menu {

    //Start of scanning and printing process
    public void start() {
        ArrayList<Pant> pantList = new ArrayList<>();

        boolean loop = true;

        //Loop to scan and print forever
        while (loop) {

            System.out.println("Welcome to Recycling!\n");
            System.out.println("Scan a container!\n");

            //Gets user input/ scan if container is a plastic.
            System.out.println("Is plastic?");
            boolean isItPlastic = userBoolean();

            //Gets user input/ scan if container is a bottle.
            System.out.println("Is it a bottle?");
            boolean isItBottle = userBoolean();

            //Get user input for size/ litre of container.
            System.out.println("How many liters?");
            double size = userDouble();

            //Create container object from parameters.
            Container container = new Container(isItPlastic, isItBottle, size);

            //Scans container, returns Pant type object, add it to List.
            pantList.add(container.scanItems());

            //Option to scan container again
            System.out.println("Do you wanna fool around some more? y/n");
            boolean answer = userBoolean();

            if (!answer) {
                loop = false;
            }
        }

        //After last scan, print recipe, reset/restart program.
        Pant.printReceipt(pantList);
        start();
    }

    //Reads user String input and returns a boolean it
    public boolean userBoolean() {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();

        if (input.equals("y")) {
            return true;
        } else {
            return false;
        }
    }

    //Reads user double input and returns it
    public double userDouble() {
        Scanner sc = new Scanner(System.in);
        double input = sc.nextDouble();

        return input;
    }
}
