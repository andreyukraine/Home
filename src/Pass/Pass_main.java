package Pass;

import java.util.Scanner;


public class Pass_main {
    /* 3.12*. Строки. Ввод пароля.
        Написать программу ввода пароля пользователя. Пользователь вводит пароль 2 раза. Пароль должен удовлетворять следующим требованиям:
		- длинна пароля должна быть от 8 до 20 символов
		- в пароле должны быть как маленькие так и большие буквы
		- должны быть цифры
		- не должен содержать слов 'password', 'pass', 'gfhjkm'
		- генерировать случайный пароль используя символы: a-z A-Z 0-9
    */
    public static void main(String[] args) {


        Scanner scan1 = new Scanner(System.in);
        Scanner scan2 = new Scanner(System.in);
        String enter_pass1 = scan1.next();
        String enter_pass2 = scan2.next();


        if (enter_pass1.equals(enter_pass2)) {
            //Проверяем длину пароля от 8 до 20 символов

            String s = Inspection_pass_length.pass_length(enter_pass1);
            if (s.equals(true)) {
                System.out.println("Длина пароля больше 8 и меньше 20");
            } else {
                System.out.println("Длина пароля меньше 8 и меньше 20");
            }
            //Проверяем принадлежность слов 'password', 'pass', 'gfhjkm'
            String por = Inspection_pass_word.inspection_word(enter_pass1);
            if (por.equals(false)) {
                System.out.println("В пароле нет слов password, pass, gfhjkm");
            } else {
                System.out.println("В пароле есть слова password, pass, gfhjkm");
            }

            //Генерируем случайный пароль
            if (s.equals(false) && por.equals(false)) {
                System.out.println("Ваш пароль очень слабый");
                System.out.println("Сгенерировать пароль?");
                Scanner scan = new Scanner(System.in);
                boolean enter_true = scan.nextBoolean();
                if (enter_true = true) {
                    System.out.println("Ваш новый пароль:");
                    String ff = generate_pass.generate_pass_new();
                    System.out.print(ff);
                }
            }
        } else {
            System.out.print("Пароли не совпадают");
        }


    }


}




