package com.company;

import java.util.Scanner;

/**
 * Created by IT on 19.03.2016.
 */
public class Class_addition_3 {
    public static void main(String[] args) {

        Scanner sc1 = new Scanner(System.in);


        String r1 = sc1.nextLine();


        String q1 = r1.substring(0, 1);
        String q2 = r1.substring(1, 2);
        String q3 = r1.substring(2, 3);

        int x1 = Integer.parseInt(q1);
        int x2 = Integer.parseInt(q2);
        int x3 = Integer.parseInt(q3);

        if (x1 == x2 && x2 == x3 && x1 == x3) {
            System.out.println("Все числа одинаковы");
        } else {
            System.out.println("Все числа не одинаковы");
        }
        if (x1 == x2 || x2 == x3 || x1 == x3) {
            System.out.println("Есть числа одинаковые");
        } else {
            System.out.println("Нет чисел одинаковы");
        }
    }
}
