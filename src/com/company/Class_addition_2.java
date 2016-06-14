package com.company;

import java.util.Scanner;

/**
 * Created by IT on 19.03.2016.
 */
public class Class_addition_2 {
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

        if (x > 0) {
            double s1 = Math.pow(x, 3);
            System.out.println(s1);
        } else {
            x = 0;
            System.out.println(x);
        }


        if (y > 0) {
            double s2 = Math.pow(y, 3);
            System.out.println(s2);
        } else {
            y = 0;
            System.out.println(y);
        }


        if (z > 0) {
            double s3 = Math.pow(z, 3);
            System.out.println(s3);
        } else {
            z = 0;
            System.out.println(z);
        }
    }
}
