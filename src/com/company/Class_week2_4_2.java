package com.company;


public class Class_week2_4_2 {
    /*Найти минимальное и максимальное значения в массиве и вывести их на консоль*/
    public static void main(String[] args) {
        int[] swe = {1, 2, 3, 43, 5, 6};

        int min = swe[0];
        int max = swe[0];
        int imax = 0;
        int imin = 0;

        for (int i = 0; i < swe.length; i++) {
            if (min > swe[i]) {
                min = swe[i];
                imin = i;
            }

            if (max < swe[i]) {
                max = swe[i];
                imax = i;
            }


        }

        swe[imin] = max;
        swe[imax] = min;

        for (int i = 0; i < swe.length; i++) {
            System.out.println(swe[i]);
        }


    }


}
