package com.company;

import java.util.Scanner;

/**
 * Created by IT on 17.03.2016.
 */
public class Class_441 {
    public static void main(String[] args) {

        //int t = 9,10,11,12,13,14,15,16,17,18;

        Scanner sc = new Scanner(System.in);
        String g = sc.nextLine();
        int g1 = Integer.parseInt(g);


        if (g1 > 9 && g1 < 19) {
            System.out.print("Я работаю");

        } else {
            System.out.print("Я отдыхаю");
        }
    }
}
