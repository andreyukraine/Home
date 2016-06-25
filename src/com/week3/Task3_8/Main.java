package com.week3.Task3_8;

import java.util.Scanner;

/**
 * Created by IT on 23.06.2016.
 */
public class Main {
    public static void main(String[] args) {
        //        3.8. Верхний регистр.
        //
        //        Напишите программу, которая позволяет пользователю ввести в консоли строку,
        //        переводит первый символ слов в верхний регистр и результат выводит в консоль
        //
        //        Вход:
        //        иван васильевич
        //
        //        Выход:
        //        Иван Васильевич
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();
        Utils utils = new Utils(text);

    }
}
