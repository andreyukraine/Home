package test_project.test;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 * Created by IT on 21.06.2016.
 */
public class ListStudent {


    public static String[] ListStudent() {
        FileReader reader = null;
        String[] nb = new String[100];
        try {
            reader = new FileReader("C:\\Users\\IT\\Desktop/document.doc");

            System.out.println(nb);
            String line = null;
            try (BufferedReader br = new BufferedReader(reader)) {
                int i = 0;
                while ((line = br.readLine()) != null) {
                    nb[i] = i + " " + line;
                    // System.out.println(i + line);
                    i++;

                }
            }


        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println(nb);
        return nb;
    }

}
