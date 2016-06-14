package com.company;


public class Class_week2_7_2_1 {
    /* 2.1 Инвертировать массив (без использования допольнительного массива)
*/
    public static void main(String[] args) {

        int[] d = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};


        for (int i = 0; i < d.length / 2; i++) {
            int temp = d[i];
            d[i] = d[d.length - i - 1];
            d[d.length - i - 1] = temp;

        }
        for (int i = 0; i < d.length; i++) {
            System.out.print(d[i]);
        }

    }


}
