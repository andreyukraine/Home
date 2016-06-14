package com.company;

import java.util.Scanner;

/**
 * Created by IT on 19.03.2016.
 */
public class Class_addition_1 {
    public static void main(String[] args) {

        Scanner sc1 = new Scanner(System.in);
        Scanner sc2 = new Scanner(System.in);
        Scanner sc3 = new Scanner(System.in);

        String r1 = sc1.nextLine();
        String r2 = sc2.nextLine();
        String r3 = sc3.nextLine();

        int x = Integer.parseInt(r1);
        int y = Integer.parseInt(r2);
        int z = Integer.parseInt(r3);

        if (x == y && y == z && x == z) {
            System.out.print("Является прямоугольным");
        } else {
            System.out.print("Является не прямоугольным");
        }
    }
}
