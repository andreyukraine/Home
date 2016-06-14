package Pass;


/**
 * Created by IT on 05.04.2016.
 */
public class Inspection_pass_registr {

    public static void pass_registr(String passw_str) {

        char[] mas = passw_str.toCharArray();

        for (int i = 0; i < mas.length; i++) {
            if (Character.isLowerCase(mas[i])) {
                System.out.print("true");
            }
        }

        for (int i = 0; i < mas.length; i++) {

            if (Character.isUpperCase(mas[i])) {
                System.out.print("true");
            }
        }

    }

}
