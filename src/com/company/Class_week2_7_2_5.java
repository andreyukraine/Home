package com.company;


public class Class_week2_7_2_5 {
    /* 2.5 Заменить в строке все символы 'a' на '@' и вывести новую строку // "array is a data type" -> "@rr@y is @ d@t@ type"
*/
    public static void main(String[] args) {

        String a = "array is a data type";
        System.out.print(a);
        System.out.print("\n");
        System.out.print(parser(a, "a", "@"));


    }

    public static String parser(String mas, String asd, String new_asd) {
        String par_rez = mas.replace(asd, new_asd);
        return par_rez;
    }


}




