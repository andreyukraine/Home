package com.company;

import java.util.Scanner;

/**
 * Created by IT on 18.03.2016.
 */
public class Class_446 {
    public static void main(String[] args) {
        Scanner sc1 = new Scanner(System.in);
        Scanner sc2 = new Scanner(System.in);
        String t1 = sc1.nextLine();
        String t2 = sc1.nextLine();
        int r1 = Integer.parseInt(t1);
        int r2 = Integer.parseInt(t2);
        int w = r1 + r2;
        if (w > 11 && w < 19) {
            System.out.print(w);
        }


    }
}
