package com.company;


public class Class_week2_4_9 {
    /* Задать два массива случайными числами от 25 до 75. Определить у какого из массивов больше парных елементов.
*/
    public static void main(String[] args) {

        int[] arr1 = GenerMass(50, 75);
        int[] arr2 = GenerMass(50, 75);
        int count1 = 0;
        int count2 = 0;

        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] % 2 == 0) {
                System.out.print(arr1[i] + " ");
                count1++;
            }
        }

        System.out.print("-" + count1 + "-");


        System.out.print("\n");
        for (int i = 0; i < arr2.length; i++) {
            if (arr2[i] % 2 == 0) {
                System.out.print(arr2[i] + " ");
                count2++;
            }
        }

        System.out.print("-" + count2 + "-");

        System.out.print("\n");
        String out = count1 > count2 ? "Больше в первом массиве" : "Больше во втором массиве";
        System.out.print(out);
    }


    public static int[] GenerMass(int size, int range) {

        int[] mas = new int[size];

        for (int i = 0; i < mas.length; i++) {
            int round = ArraysUtil.genRandomNum(range);
            if (round >= 25 && round <= 75) {
                mas[i] = round;
            } else {
                mas[i] = round + 25;
            }
        }
        return mas;

    }


}
