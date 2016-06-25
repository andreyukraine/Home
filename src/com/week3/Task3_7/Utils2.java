package com.week3.Task3_7;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Created by IT on 23.06.2016.
 */
public class Utils2 {
    public String searchLongWord(String text) {
        //обьявляем переменную
        String result = "";
        //обьявляем массив
        List<String> list = new ArrayList<>();

        Scanner sc = new Scanner(text);

        while (sc.hasNext()) {

            list.add(sc.next());
        }

        for (String aList : list) {

            if (result.length() < aList.length()) {

                result = aList;
            }
        }

        return result;
    }


}
