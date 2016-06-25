package com.week3.Task3;

import java.util.Scanner;

/**
 * Created by IT on 22.06.2016.
 */
public class Main {
    public static void main(String[] args) {
        //Матрицы генерировать случайными числами и размер матрицы вводит юзер.
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите количество строк матрицы");
        String input_size_m = scanner.nextLine();
        System.out.println("Введите количество столбцов матрицы");
        String input_size_n = scanner.nextLine();
        int size_m = Integer.parseInt(input_size_m);
        int size_n = Integer.parseInt(input_size_n);

        Matrix matrix = new Matrix(size_m, size_n);

    }

}
