package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        ArrayList<Pant> pantList = new ArrayList<>();


        boolean loop = true;

while (loop) {

    System.out.println("Welcome to the Jungle!");
    System.out.println("Do you wanna feed me? I'm a dirty dirty boy!");
    System.out.println("Create a container:");
    System.out.println("Is plastic?");


    boolean isItPlastic = Main.userBoolean();
    System.out.println("Is it a bottle?");

    boolean isItBootle = Main.userBoolean();
    System.out.println("How many liters, big boy?");

    double size = Main.userDouble();


    Container container = new Container(isItPlastic, isItBootle, size);
    pantList.add(container.scanItems());


    System.out.println("Do you wanna fool around some more? y/n");
    boolean answer = Main.userBoolean();

    if (!answer) {
        loop = false;
    }
}


        Container container1 = new Container(true, true, 1);
        Container container2 = new Container(false, true, 0.5);
        Container container3 = new Container(false, false, 0.33);
        Container container4 = new Container(true, true, 1.5);
        Container container5 = new Container(true, true, 0.5);






        /*
        pantList.add(container1.scanItems());
        pantList.add(container2.scanItems());
        pantList.add(container3.scanItems());
        pantList.add(container4.scanItems());
        pantList.add(container5.scanItems());
*/

        Pant.printReceipt(pantList);

    }


public static boolean userBoolean() {
    Scanner sc = new Scanner(System.in);
    String input = sc.nextLine();

    if (input.equals("y")) {
        return true;
    } else {
        return false;
    }

}

    public static double userDouble() {
        Scanner sc = new Scanner(System.in);
        double input = sc.nextDouble();

        return input;

        }


}
