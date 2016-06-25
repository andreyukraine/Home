package com.week3.Task3_1;

import com.company.ArraysUtil;

/**
 * Created by IT on 23.06.2016.
 */
public class Matrix2 {
    public Matrix2(int size_m, int size_n) {


        // создаем матрицу
        int[][] matrix = new int[size_m][size_n];


        System.out.println("Ваша матрица:");


        // цикл по первой размерности
        for (int i = 0; i < size_m; i++) {
            // цикл по второй размерности

            for (int j = 0; j < size_n; j++) {

                //генерируем числа
                int random = ArraysUtil.genRandomNum(100);

                //инициализация элементов массива
                if (random % 5 == 0) {
                    System.out.print("(" + random + ")" + " ");
                    matrix[i][j] = 8;
                } else {
                    matrix[i][j] = random;
                }

                //вывод элементов массива
                System.out.print(matrix[i][j] + "\t");
            }
            System.out.println();
        }

    }
}
