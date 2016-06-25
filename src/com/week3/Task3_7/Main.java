package com.week3.Task3_7;

import java.util.Scanner;

/**
 * Created by IT on 23.06.2016.
 */
public class Main {
    public static void main(String[] args) {
        //3.7. Найти самое длинное слово в строке (разделенное одним пробелом)
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();

        System.out.println("Cамое длинное слово в строке:");
        Utils2 utils2 = new Utils2();
        System.out.println(utils2.searchLongWord(text));

    }
}

