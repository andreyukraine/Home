package com.company;

import java.util.Scanner;

/**
 * Created by IT on 18.03.2016.
 */
public class Class_447 {
    public static void main(String[] args) {
        Scanner sc1 = new Scanner(System.in);
        Scanner sc2 = new Scanner(System.in);
        String t1 = sc1.nextLine();
        String t2 = sc1.nextLine();
        double r1 = Integer.parseInt(t1);
        double r2 = Integer.parseInt(t2);

        if (r1 % r2 == 0) {
            double q = Math.log(r1 / r2);
            System.out.print("True " + q);
        } else {
            double q1 = Math.log(r1 / r2);
            System.out.print("False " + q1);
        }


    }
}
