package com.company;

import java.util.Scanner;

/**
 * Created by IT on 19.03.2016.
 */
public class Class_448_no {
    public static void main(String[] args) {
        Scanner sc1 = new Scanner(System.in);
        Scanner sc2 = new Scanner(System.in);
        String t1 = sc1.nextLine();
        String t2 = sc1.nextLine();
        int r1 = Integer.parseInt(t1);
        int r2 = Integer.parseInt(t2);


        int q = r1 % r2;
        System.out.print(q);


    }
}
