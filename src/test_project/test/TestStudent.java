package test_project.test;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;


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


        final DefaultListModel model = new DefaultListModel();
        for (int i = 0; i < nb.length; i++) {
            model.addElement(nb[i]);
        }

        final JList list = new JList(model);

        list.setLayoutOrientation(JList.VERTICAL);
        list.setSize(400, 400);
        list.setFixedCellWidth(350);

        frame.add(list);
        JScrollPane scrollPane = new JScrollPane(list);
        frame.add(scrollPane);

        menuItem.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                new addStudent();
            }
        });

        //удаляем студента
        menuItem2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                model.remove(list.getSelectedIndex());
                try {
                    OutputStream f5 = new FileOutputStream("C:\\Users\\IT\\Desktop/document.doc");

                } catch (FileNotFoundException e1) {
                    e1.printStackTrace();
                }
                System.out.println(model);

            }
        });

        menuBar.add(menu);
        frame.setVisible(true);

        //Выводим по символьно значение файла
//        FileReader reader = null;
//        try {
//            reader = new FileReader("C:\\Users\\IT\\Desktop/document.doc");

        //String mass [] = {"one","two","tree","one","two","tree","one","two","tree","one","two","tree","one","two","tree","one","two","tree","one","two","tree","one","two","tree"};

        //Scanner scanner = new Scanner(reader);

//            while (scanner.hasNextInt()) {
//                mass = scanner.nextLine();
//
//            }

        //делаем форму вывода листом и добавляем данные


//            ArrayList catnamesList = new ArrayList();
//            int c;
//            while ((c = reader.read()) != -1) {
//                catnamesList.add(c);
//              //  System.out.println(catnamesList);
//                JList list = new JList();
//                list.setLayoutOrientation(JList.VERTICAL);
//                list.setSize(400,400);
//                list.setFixedCellWidth(350);
//                frame.add(list);
//                JScrollPane scrollPane = new JScrollPane(list);
//                frame.add(scrollPane);
//            }
//            String[] nb = new String[100];
//            System.out.println(nb);
//            String line = null;
//            try(BufferedReader br = new BufferedReader(reader)) {
//            int i = 0;
//                while((line = br.readLine()) != null){
//                    nb[i] = i+ " " + line;
//                    System.out.println(i + line);
//                    i++;
//
//
//                  //frame.add();
//                }
//            }
//
//
//
//
//
//
//        } catch (FileNotFoundException e) {
//            e.printStackTrace();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//

        // TableModel model = new TableModel();

//        String[] str = new String[2];
//        str[0] = "0";
//        str[1] = "name";

        // model.addDate(str);


        // JTable table = new JTable(model);
        //JScrollPane scrollPane = new JScrollPane(table);
        // scrollPane.setPreferredSize(new Dimension(150, 150));


        // frame.add(scrollPane, new GridBagConstraints(0, 0, 1, 1, 1, 1, GridBagConstraints.NORTH, GridBagConstraints.BOTH, new Insets(1, 1, 1, 1), 0, 0));




        //student.init("Andrey", "0674682939", "Kiev", "ccc", 4000);


        //System.out.println(student.convertStudents());

    }


}
