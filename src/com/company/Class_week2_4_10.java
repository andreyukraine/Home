package com.company;


public class Class_week2_4_10 {
    /* брезать массив по границам start и end
*/
    public static void main(String[] args) {

        int[] d = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int[] g = splitArray(d, 2, 7);
        // System.out.print(g);

    }

    public static int[] splitArray(int[] mas, int start, int end) {


        for (int i = start; i < mas.length; i++) {
            if (mas[i] <= end) {
                System.out.print(mas[i] + " ");
            }
        }
        return mas;
    }

}
