package test_project.test;

import test_project.model.Student;

import javax.swing.*;
import java.awt.*;


/**
 * Created by IT on 04.05.2016.
 */
public class TestStudent {
    public static void main(String[] args) {
        Student student = new Student();


        JMenuBar menuBar = new JMenuBar();
        JFrame frame = new JFrame();
        frame.setSize(150, 150);
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


        TableModel model = new TableModel();

        String[] str = new String[2];
        str[0] = "0";
        str[1] = "name";

        model.addDate(str);


        JTable table = new JTable(model);
        JScrollPane scrollPane = new JScrollPane(table);
        scrollPane.setPreferredSize(new Dimension(150, 150));


        frame.add(scrollPane, new GridBagConstraints(0, 0, 1, 1, 1, 1, GridBagConstraints.NORTH, GridBagConstraints.BOTH, new Insets(1, 1, 1, 1), 0, 0));


        menuBar.add(menu);

        frame.setVisible(true);

        student.init("Andrey", "0674682939", "Kiev", "ccc", 4000);


        System.out.println(student.convertStudents());

    }


}
