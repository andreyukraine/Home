package Pass;

import java.util.Random;

/**
 * Created by IT on 08.04.2016.
 */
public class generate_pass {


    public static String generate_pass_new() {

        String letters = "abcdefghijklmnopqrstuvwxyz0123456789";

        char[] symbols = letters.toCharArray();
        char[] ss = new char[10];
        String g = "";
        Random random = new Random();

        for (int i = 0; i < symbols.length; i++) {
            //ss[i] = (char) letters.charAt(random.nextInt(letters.length())) ;
            if (i < 10) {
                g += String.valueOf(letters.charAt(random.nextInt(letters.length())));
            }
        }


        return g;
    }

}

