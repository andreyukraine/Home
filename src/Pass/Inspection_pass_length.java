package Pass;


/**
 * Created by IT on 05.04.2016.
 */
public class Inspection_pass_length {

    public static String pass_length(String passw_str) {

        int i = passw_str.length();

        String result = "";

        if (i > 8 && i < 20) {
            result = "true";
        } else {
            result = "false";
        }

        return result;
    }

}
