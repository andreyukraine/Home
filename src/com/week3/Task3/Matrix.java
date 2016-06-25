package com.week3.Task3;

import com.company.ArraysUtil;

/**
 * Created by IT on 23.06.2016.
 */
public class Matrix {
    public Matrix(int size_m, int size_n) {


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
                matrix[i][j] = random;


                //вывод элементов массива
                System.out.print(matrix[i][j] + "\t");
            }
            System.out.println();
        }

    }
}
