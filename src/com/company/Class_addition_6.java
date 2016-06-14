package com.company;

import java.util.Scanner;

/**
 * Created by IT on 19.03.2016.
 */
public class Class_addition_6 {
    public static void main(String[] args) {

        Scanner sc1 = new Scanner(System.in);
        Scanner sc2 = new Scanner(System.in);

        String r1 = sc1.nextLine();
        String r2 = sc2.nextLine();


        int distanc = Integer.parseInt(r1);
        int speed = Integer.parseInt(r2);

        double time = distanc / speed;

        System.out.println(time);

    }
}
