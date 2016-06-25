package com.week3.Task3_8;

/**
 * Created by IT on 23.06.2016.
 */
public class Utils {
    public Utils(String text) {
        //создаем массив
        char[] masschar = text.toCharArray();
        //проходимся массиву
        for (String s : text.split(" ")) {
            //получаем первую букву слова переводим в вверхний регистр и добавляем урезаное слово без первой буквы и складываем
            String fistletter = s.substring(0, 1).toUpperCase() + s.substring(1);
            System.out.print(fistletter + " ");

        }


    }
}
