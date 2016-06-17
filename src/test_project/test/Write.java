package test_project.test;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

/**
 * Created by IT on 16.06.2016.
 */
public class Write {


    public Write(String name, String phone) throws IOException {
        //Создаём объект файла

        File flt = new File("C:\\Users\\IT\\Desktop/document.doc");
        //Объект, позволяющий осуществить запись в файл
        FileWriter wrt = new FileWriter(flt, true);
        CharSequence cq = name + " " + phone + "\n";
        wrt.write((String) cq);
        wrt.flush();
        wrt.close();
    }


}
