package com.company;

import java.util.Scanner;

/**
 * Created by IT on 19.03.2016.
 */
public class Class_addition_8 {
    public static void main(String[] args) {

        Scanner sc1 = new Scanner(System.in);
        String r1 = sc1.nextLine();

        int price = Integer.parseInt(r1);

        if (price > 1000) {
            double price_new = price / 1.1;
            System.out.println("Ваша скидка 10% к оплате " + price_new + "$");
        } else {
            System.out.println("Ваша скидка 0% к оплате " + price + "$");
            int info = 1000 - price;
            System.out.println("Купите еще на " + info + "$ и получите 10% скидки");
        }


    }

}
