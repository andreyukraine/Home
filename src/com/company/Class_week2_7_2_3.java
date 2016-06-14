package com.company;


public class Class_week2_7_2_3 {
    /* 2.3 Посчитать колличество букв 'a' в строке (искомый символ может быть разным)
*/
    public static void main(String[] args) {

        String d = "Я не спал всю ночь и на утро спать хотел";
        String[] h = d.split("");
        int count = 0;
        String g = "н";
        for (int i = 0; i < h.length; i++) {
            if (g.equals(h[i])) {
                count++;
            }
        }

        System.out.print("В строке " + count + " букв");

    }


}
