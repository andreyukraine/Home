package com.company;

import java.util.Scanner;

/**
 * Created by IT on 19.03.2016.
 */
public class Class_addition_7 {
    public static void main(String[] args) {

        Scanner sc1 = new Scanner(System.in);
        String r1 = sc1.nextLine();

        int month = Integer.parseInt(r1);


        if (month >= 1 && month <= 3) {
            System.out.println("Winter");
        } else if (month >= 3 && month <= 6) {
            System.out.println("Spring");
        } else if (month >= 6 && month <= 9) {
            System.out.println("Summer");
        } else if (month >= 9 && month <= 12) {
            System.out.println("Autumn");
        } else {
            System.out.println("Error");
        }


    }
}
