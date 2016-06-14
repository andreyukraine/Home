package com.company;


public class Class_week2_4_3 {
    /*Найти минимальное и максимальное значения в массиве и вывести их на консоль*/
    public static void main(String[] args) {
        int[] swe = {1, 8, 8, 43, 5, 6};
        int[] mas = {1, 8, 8, 5, 5, 7};

        for (int i = 0; i < swe.length; i++) {
            System.out.print(swe[i] + " ");
        }
        System.out.print("\n");

        for (int i = 0; i < mas.length; i++) {
            System.out.print(mas[i] + " ");
        }

        System.arraycopy(swe, 0, mas, 0, 6);
        System.out.print("\n");
        System.out.println("New mass arrays");
        for (int i = 0; i < mas.length; i++) {
            System.out.print(mas[i] + " ");
        }


    }


}
