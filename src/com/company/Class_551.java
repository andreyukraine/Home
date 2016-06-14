package com.company;

import java.util.Scanner;

/**
 * Created by IT on 19.03.2016.
 */
public class Class_551 {
    public static void main(String[] args) {

        Scanner sc1 = new Scanner(System.in);
        String t = sc1.nextLine();
        int y = Integer.parseInt(t);

        String t1 = Integer.toBinaryString(y);
        int t2 = Integer.parseInt(String.valueOf(y), 2);

        System.out.println(t1);
        System.out.println(t2);

    }
}
