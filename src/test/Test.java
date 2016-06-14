package test;

import java.awt.*;
import java.util.Arrays;

/**
 * Created by IT on 17.03.2016.
 */
public class Test {
    private static Component frame;

    public static void main(String[] args) {


        String a = "Andrey";
        String pu = a.substring(a.length() - 1);
        // System.out.print(pu+a);

        //***************Получаем количество значения в строке****************************************
        int d = a.length();
        System.out.println(d);

        //***************Вычитаем значения справа на лево по номеру в строке****************************************
        String b = a.substring(0, 5);
        //System.out.println(b);

        //***************Получаем значения в строке по номеру в строке.****************************************
        char c = a.charAt(4);
        //System.out.println(c);

        //***************Сравниваем два значения не зависимо от нижнего или верхнего регистра****************************************
        boolean u = a.equalsIgnoreCase("andrey");
        //System.out.println(u);

        //***************Заменяем "nd" на новое значения "Cool"***************************************
        String r = a.replace("nd", "Cool");
        //System.out.println(r);

        //***************Получаем номер значения в строке****************************************
        int q = a.lastIndexOf("y");
        //System.out.println(q);

        //***************Перефодим строку в нижний регистр****************************************
        String w = a.toLowerCase();
        //System.out.println(w);


        //***************Формы и работа с ними****************************************

        // String nam = JOptionPane.showInputDialog("Как тебя зовут?");
        // String win = JOptionPane.showInputDialog("Сколько тебе нужно денег?");
        // String age = JOptionPane.showInputDialog("На сколько дней ты в командеровки?");
        // int gn = Integer.parseInt(win);
        // int gh = Integer.parseInt(age);

        // double sum = (gn/gh);

        // if (sum <= 10){
        //    JOptionPane.showMessageDialog(frame, sum + "$ Нормуль");
        // }else{
        //     JOptionPane.showMessageDialog(frame, "Многовато");
        // };

        // System.out.println(win);
        //System.out.println(gh);


        //***************Копируем значения в массива в другой массив****************************************


        //***************Копируем значение с массива****************************************
        //int[] as = {1,2,3,4,5};
        //int[] bs = {6,7,8,9,0};
        //System.arraycopy(as,2,bs,1,2);
        //for (int i = 0; i < bs.length; i++){
        //   System.out.println(i + ":" + bs[i]);
        //}

        //***************Сортировка значений в массиве****************************************
        int[] as = {1, 2, 5, 4, 3};
        Arrays.sort(as);
        for (int i = 0; i < as.length; i++) {
            //System.out.println(i + ":" + as[i]);
        }

    }
}
