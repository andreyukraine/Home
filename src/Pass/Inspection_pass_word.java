package Pass;

/**
 * Created by IT on 08.04.2016.
 */
public class Inspection_pass_word {


    public static String inspection_word(String enter_pass1) {
        String f = "";
        String one = "password";
        String tvo = "pass";
        String tree = "gfhjkm";

        if (enter_pass1.indexOf(one) != -1) {
            f = "true";
        } else if (enter_pass1.indexOf(tvo) != -1) {
            f = "true";
        } else if (enter_pass1.indexOf(tree) != -1) {
            f = "true";
        } else {
            f = "false";
        }

        return f;
    }

}

