package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Menu {


    public void start() {
        ArrayList<Pant> pantList = new ArrayList<>();

        boolean loop = true;

        while (loop) {

            System.out.println("Welcome to Recycling!\n");
            System.out.println("Scan a container!\n");

            System.out.println("Is plastic?");
            boolean isItPlastic = userBoolean();

            System.out.println("Is it a bottle?");
            boolean isItBootle = userBoolean();

            System.out.println("How many liters?");

            double size = userDouble();

            Container container = new Container(isItPlastic, isItBootle, size);
            pantList.add(container.scanItems());


            System.out.println("Do you wanna fool around some more? y/n");
            boolean answer = userBoolean();

            if (!answer) {
                loop = false;
            }
        }
        Pant.printReceipt(pantList);

            start();
    }

    public boolean userBoolean() {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();

        if (input.equals("y")) {
            return true;
        } else {
            return false;
        }
    }

    public double userDouble() {
        Scanner sc = new Scanner(System.in);
        double input = sc.nextDouble();

        return input;

    }

}
