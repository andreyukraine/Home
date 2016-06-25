package com.week3.Task3_9;

import com.company.ArraysUtil;

/**
 * Created by IT on 23.06.2016.
 */
public class Matrix3 {
    public Matrix3(int size_m, int size_n) {


        // создаем матрицы
        int[][] matrix = new int[size_m][size_n];
        int[][] matrix1 = new int[size_m][size_n];
        int[][] matrix2 = new int[size_m][size_n];

        System.out.println("Генерируем первую матрицу:");


        // цикл по первой размерности
        for (int i = 0; i < size_m; i++) {
            // цикл по второй размерности

            for (int j = 0; j < size_n; j++) {

                //генерируем числа
                int random = ArraysUtil.genRandomNum(10);

                //инициализация элементов массива

                matrix[i][j] = random;


                //вывод элементов массива
                System.out.print(matrix1[i][j] + "\t");
            }
            System.out.println();
        }


        System.out.println("Генерируем вторую матрицу:");
        // цикл по первой размерности
        for (int i = 0; i < size_m; i++) {
            // цикл по второй размерности

            for (int j = 0; j < size_n; j++) {

                //генерируем числа
                int random = ArraysUtil.genRandomNum(10);

                //инициализация элементов массива

                matrix2[i][j] = random;


                //вывод элементов массива
                System.out.print(matrix2[i][j] + "\t");
            }
            System.out.println();
        }

        int m = matrix1.length;
        int n = matrix2[0].length;
        int s = matrix2.length;
        System.out.println("Переумножаем матрицы:");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                for (int k = 0; k < s; k++) {
                    matrix[i][j] = matrix1[i][k] * matrix2[k][j];
                    //вывод элементов массива
                    System.out.print(matrix[i][j] + "\t");
                }
                System.out.println();
            }
        }


    }
}
