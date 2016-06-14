package com.company;


public class Class_week2_4_8_no {
    /*Eсть два массива одинаковой длины arr1 и arr2 вывести в консоль значения массива,
       который получается в результате суммы arr1[i] + arr2[i]
*/
    public static void main(String[] args) {
        int[] arr1 = {9, 9, 9, 9, 5, 6, 8, 9};
        int[] arr2 = {1, 1, 2, 9, 6, 6, 5, 5};
        int[] arr3 = new int[8];


        for (int i = 0; i < arr1.length; i++) {

            System.out.print(arr1[i]);
            System.out.print("\n");


            for (int j = 0; j < arr2.length; j++) {

                System.out.print(arr2[j]);

            }

        }


        for (int i = 0; i < arr3.length; i++) {
            //  System.out.println(arr3[i]);
        }


    }


}
