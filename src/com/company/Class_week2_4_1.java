package com.company;


public class Class_week2_4_1 {
    /*Найти минимальное и максимальное значения в массиве и вывести их на консоль*/
    public static void main(String[] args) {
        int[] swe = {1, 2, 3, 43, 5, 6};

        int min = swe[0];
        int max = swe[0];

        for (int i = 0; i < swe.length; i++) {
            if (min > swe[i]) {
                min = swe[i];
            }

            if (max < swe[i]) {
                max = swe[i];
            }
        }
        System.out.println(min);
        System.out.println(max);


    }


}
