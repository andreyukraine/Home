package com.company;


public class Class_week2_4_7 {
    /*Найти минимальное и максимальное значения в массиве и вывести их на консоль*/
    public static void main(String[] args) {
        int[] swe = {9, 9, 9, 9, 5, 6, 8, 9};


        int sum1 = 0;
        int sum2 = 0;
        double csum1 = 0;
        double csum2 = 0;


        for (int i = 0; i < swe.length / 2; i++) {
            sum1 += swe[i];

        }

        for (int i = swe.length / 2; i < swe.length; i++) {
            sum2 += swe[i];

        }

        csum1 = sum1 / (swe.length / 2);
        csum2 = sum2 / (swe.length / 2);

        double qw = csum1 > csum2 ? csum1 : csum2;


        System.out.print(sum1 + " ");
        System.out.print(csum1);
        System.out.print("\n");
        System.out.print(sum2 + " ");
        System.out.print(csum2);
        System.out.print("\n");
        System.out.print(qw);


    }


}
