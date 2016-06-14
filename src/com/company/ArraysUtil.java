package com.company;

/*//package ua.artcode.week2.method;
*
 * Created by IT on 30.03.2016.
 */
public class ArraysUtil {


    /**
     * Created by serhii on 28.02.16.
     */


    public static void printArr(int[] arr) {
        // fori
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();

    }


    public static int[] generateMas(int size, int range) {
        int[] mas = new int[size];
        for (int i = 0; i < mas.length; i++) {
            mas[i] = genRandomNum(range);
        }

        return mas; // end method

        //System.out.println("sdfdsf");

    }

    public static int genRandomNum(int range) {
        return (int) (Math.random() * range);
    }


    public static int[] genRandomMasEvenNum(int size, int range) {
        int[] mas = new int[size];
        for (int i = 0; i < mas.length; i++) {
            int random = genRandomNum(range);
            // ternary operator
            mas[i] = random % 2 == 0 ? random : random + 1;
        }

        return mas;
    }

    public static int[] genRandomMasOddNum(int size, int range) {
        int[] mas = new int[size];
        for (int i = 0; i < mas.length; i++) {
            int random = genRandomNum(range);
            // ternary operator
            mas[i] = random % 2 != 0 ? random : random + 1;
        }

        return mas;
    }

    public static String convert(int[] mas) {
        String res = "";
        for (int i = 0; i < mas.length; i++) {

            res += mas[i] + ",";
        }
        return res;
    }

    public static int[][] GeneretMas(int size, int range) {
        int[][] mas = new int[size][range];

        for (int i = 0; i < mas.length; i++) {
            for (int j = 0; j < mas[i].length; j++) {
                int rand = genRandomNum(10);

                if (i % 2 == 0) {
                    mas[i][j] = rand % 2 == 0 ? rand : rand + 1;

                } else
                    mas[i][j] = rand % 2 == 0 ? rand + 1 : rand;

            }

        }

        return mas;
    }


}
