package com.company;


public class Class_week2_4_6 {
    /*Найти минимальное и максимальное значения в массиве и вывести их на консоль*/
    public static void main(String[] args) {
        int[] swe = {1, 2, 3, 43, 5, 6};

        double centersum = 0;
        int sum = 0;

        for (int i = 0; i < swe.length; i++) {
            sum += swe[i];

        }

        centersum = sum / swe.length;


        System.out.println(sum);
        System.out.println(swe.length);
        System.out.println(centersum);


    }


}
