package com.company;

/**
 * Created by IT on 19.03.2016.
 */
public class Class_553 {
    public static void main(String[] args) {

        //Scanner sc1 = new Scanner(System.in);
        //String tm = sc1.nextLine();
        // int n = Integer.parseInt(tm);

        String word = "Hello";
        String text = "H Hello HelloH again Hello";
        int position = 0, counter = 0;
        char t = ' ';


        do {
            position = text.indexOf(word, position + 1);
            System.out.println(position);
            char k = ((position + word.length()) == text.length()) ? ' ' : text.charAt(position + word.length());
            if (position >= 0 && (t == k)) {
                counter++;
                position += word.length();
            }
        } while (position >= 0);

        System.out.println(counter);

    }
}
