package com.company;

import java.util.ArrayList;

public class Pant {
    private String type;
    private double price;

    public Pant(double price, String type) {
        this.price = price;
        this.type = type;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public static void printReceipt(ArrayList<Pant> pantList) {
        double total = 0;
        int number = 0;
        int counterA = 0;
        int counterB = 0;
        int counterC = 0;

        for (Pant pant : pantList
        ) {
            if (pant.type.equals("PantA")) {
                counterA++;
            } else if (pant.type.equals("PantB")) {
                counterB++;
            } else if (pant.type.equals("PantC")) {
                counterC++;
            }
            number++;

            total += pant.price;
        }

        System.out.println();
        System.out.println("\"-------------------------------------------------\"");
        System.out.println("|                                                 |");
        System.out.println("| =============================================== |");
        System.out.println("|             M Å S K E R E C Y C L I N G         |");
        System.out.println("| =============================================== |");
        System.out.println(String.format("%-50s%s", "|  Pant A: " + counterA + "x = " + counterA * 1 + " DKK.", "|"));
        System.out.println(String.format("%-50s%s", "|  Pant B: " + counterB + "x = " + counterB * 1.5 + " DKK.", "|"));
        System.out.println(String.format("%-50s%s", "|  Pant C: " + counterC + "x = " + counterC * 3 + " DKK.", "|"));
        System.out.println(String.format("%-50s%s", "|  Total pieces: " + number, "|"));
        System.out.println(String.format("%-50s%s", "|", "|"));
        System.out.println(String.format("%-50s%s", "|  Total amount: " + total + " DKK.", "|"));
        System.out.println("\"-------------------------------------------------\"");
        System.out.println();
    }
}
