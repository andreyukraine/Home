package com.company;

import java.util.Scanner;

/**
 * Created by IT on 18.03.2016.
 */
public class Class_442 {
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

        if (x < y && y < z) {
            System.out.println(x);
            System.out.println(z);
        }
        if (z < y && y < x) {
            System.out.println(z);
            System.out.println(x);
        }


        if (y < x && x < z) {
            System.out.println(y);
            System.out.println(z);
        }
        if (z < x && x < y) {
            System.out.println(z);
            System.out.println(y);
        }


        if (y < z && z < x) {
            System.out.println(y);
            System.out.println(x);
        }
        if (x < z && z < y) {
            System.out.println(x);
            System.out.println(y);
        }


    }


}

