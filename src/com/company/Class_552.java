package com.company;

import java.util.Scanner;

/**
 * Created by IT on 19.03.2016.
 */
public class Class_552 {
    public static void main(String[] args) {

        Scanner sc1 = new Scanner(System.in);
        String t = sc1.nextLine();
        int n = Integer.parseInt(t);

        int y = 1;

        for (int i = 1; i <= n; i++) {
            y = y * i;
        }
        System.out.print(n + "!=");
        System.out.print(y);

    }
}
