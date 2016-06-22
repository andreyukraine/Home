package test_project.test;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

/**
 * Created by IT on 14.06.2016.
 */
public class addStudent extends JFrame {

    public addStudent() {

        setTitle("Добавляем студента");
        setSize(200, 200);
        init();
        setVisible(true);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

    }

    private void init() {

        GridLayout gridLayout = new GridLayout(3, 2);
        setLayout(gridLayout);


        final JLabel name = new JLabel("name");
        final JTextArea nametext = new JTextArea();

        final JLabel phone = new JLabel("phone");
        final JTextArea phonetext = new JTextArea();

        JButton add = new JButton("Записать");


        add.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                //вызов метода
                try {
                    //переводим в стринг
                    String getnametext = nametext.getText();
                    String getphonetext = phonetext.getText();

                    new Write(getnametext, getphonetext);
                    System.out.println("Записали");
                } catch (IOException e1) {
                    e1.printStackTrace();
                }
            }
        });


        JButton exit = new JButton("Отменить");

        exit.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                dispose();
            }
        });


        getContentPane().add(name);
        getContentPane().add(nametext);
        getContentPane().add(phone);
        getContentPane().add(phonetext);
        getContentPane().add(add);
        getContentPane().add(exit);
    }


}
