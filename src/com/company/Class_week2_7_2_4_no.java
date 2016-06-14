package com.company;


public class Class_week2_7_2_4_no {
    /* 2.4 Сдвинуть массив на заданное количество позиций // {1,2,3,4,5} -> 2 = {4,5,1,2,3}; {1,2,3,4,5} -> 3 = {3,4,5,1,2}
        Количество позиций и массив указывает пользователь
*/
    public static void main(String[] args) {

        int[] mas = {1, 2, 3, 4, 5, 6, 7, 8, 9, 0};
        int[] test = SdvigMas(mas, 1);

        for (int i = 0; i < test.length; i++) {
            System.out.print(test[i]);
        }

    }

    public static int[] SdvigMas(int[] mas, int poz) {
        int tmp = 0;
        for (int i = 0; i < mas.length / 2; i++) {
            tmp = mas[i];

            mas[i] = mas[mas.length - i - 1];
            mas[mas.length - i - 1] = tmp;
        }

        return mas;


    }

}
