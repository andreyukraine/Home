package com.company;

import java.util.Scanner;

/**
 * Created by IT on 18.03.2016.
 */
public class Class_444 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        double f = Double.parseDouble(a);

        if (f > 0 && f < 1) {
            System.out.print("В диапазоне");
        } else {
            System.out.print("Не в диапазоне");
        }
    }
}
