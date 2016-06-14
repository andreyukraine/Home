package com.company;


public class Class_week2_4_5 {
    /* Заполнить массив случайными значениями. На четных индексах парные значения, на нечетных непарные*/
    public static void main(String[] args) {

        int[][] a = ArraysUtil.GeneretMas(3, 10);


        for (int i = 0; i < a.length; i++) {
            System.out.print("\n");

            for (int j = 0; j < a[i].length; j++) {
                int l = a[i][j];
                System.out.print(l + ", ");
            }
        }


    }


}
