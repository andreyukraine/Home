package com.company;

import java.util.Scanner;

/**
 * Created by IT on 18.03.2016.
 */
public class Class_443 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String e = sc.nextLine();
        double t = Integer.parseInt(e);
        double y = 7;
        if (t % y == 0) {
            double g = t + 2;
            System.out.print(g);
        } else {
            System.out.print("Не делится");
        }
    }
}
