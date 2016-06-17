package test_project.test;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;


/**
 * Created by IT on 04.05.2016.
 */
public class TestStudent {
    public static void main(String[] args) {
        Student student = new Student();


        JMenuBar menuBar = new JMenuBar();
        JFrame frame = new JFrame();
        frame.setSize(400, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setJMenuBar(menuBar);
        frame.setLocationRelativeTo(null);
        frame.setLayout(new GridBagLayout());
        JMenu menu = new JMenu("Menu1");
        JMenuItem menuItem = new JMenuItem("Добавить студента");
        JMenuItem menuItem2 = new JMenuItem("Удалить студента");
        JMenuItem menuItem3 = new JMenuItem("Найти студента");
        JMenuItem menuItem4 = new JMenuItem("Все студенты");

        menu.add(menuItem);
        menu.add(menuItem2);
        menu.add(menuItem3);
        menu.add(menuItem4);

        menuItem.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                new addStudent();
            }
        });

        //Выводим по символьно значение файла
        FileReader reader = null;
        try {
            reader = new FileReader("C:\\Users\\IT\\Desktop/document.doc");

            String mass[];

            Scanner scanner = new Scanner(reader);

            while (scanner.hasNextInt()) {
                mass[]=scanner.nextLine();
                System.out.println(scanner.nextInt());
            }


//            String line = null;
//            try(BufferedReader br = new BufferedReader(reader)) {
//                while((line = br.readLine()) != null){
//                    System.out.println(line);
//                  //  frame.add();
//                }
//            }

            // читаем посимвольно
//            int c;
//            while((c = reader.read())!=-1){
//
//                JTextArea jTextArea = new JTextArea(String.valueOf((char)c)+ "\n");
//                frame.add(jTextArea);
//            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }


        // TableModel model = new TableModel();

//        String[] str = new String[2];
//        str[0] = "0";
//        str[1] = "name";

        // model.addDate(str);


        // JTable table = new JTable(model);
        //JScrollPane scrollPane = new JScrollPane(table);
        // scrollPane.setPreferredSize(new Dimension(150, 150));


        // frame.add(scrollPane, new GridBagConstraints(0, 0, 1, 1, 1, 1, GridBagConstraints.NORTH, GridBagConstraints.BOTH, new Insets(1, 1, 1, 1), 0, 0));


        menuBar.add(menu);

        frame.setVisible(true);

        //student.init("Andrey", "0674682939", "Kiev", "ccc", 4000);


        //System.out.println(student.convertStudents());

    }


}
