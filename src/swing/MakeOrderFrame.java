package swing;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by IT on 12.06.2016.
 */


public class MakeOrderFrame extends JFrame {

    public MakeOrderFrame() {
        setTitle("Make Order");
        setSize(400, 600);
        init();
        setVisible(true);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

    }

    private void init() {
        GridLayout gridLayout = new GridLayout(6, 2);
        setLayout(gridLayout);

        JLabel phoneLabel = new JLabel("Phone");
        final JTextArea phoneText = new JTextArea();

        JLabel fromLabel = new JLabel("From");
        JTextArea fromText = new JTextArea();

        JLabel toLabel = new JLabel("To");
        JTextArea toText = new JTextArea();


        JLabel priceLabel = new JLabel("Price");
        final JTextArea priceText = new JTextArea();
        priceText.setEditable(false);


//        for (int i = 0; i < arr.length ; i++) {
//            System.out.println(i + ":" + arr[i]);
//        }


        JLabel distanceLabel = new JLabel("Distance");
        final JLabel distanceText = new JLabel();


        JPanel buttomPanel = new JPanel(new GridLayout(1, 2));
        JButton calculate = new JButton("Calculate");
        JButton good = new JButton("Good");
        good.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                new MainFrame();
            }
        });
        String price = "";
        String from = fromText.getText();
        String to = toText.getText();


        price = "3500";

        final String finalPrice = price;
        calculate.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                priceText.setText(String.valueOf(finalPrice));
                distanceText.setText(String.valueOf(System.currentTimeMillis()));
            }
        });

        buttomPanel.add(calculate);
        buttomPanel.add(good);

        getContentPane().add(phoneLabel);
        getContentPane().add(phoneText);
        getContentPane().add(fromLabel);
        getContentPane().add(fromText);
        getContentPane().add(toLabel);
        getContentPane().add(toText);
        getContentPane().add(priceLabel);
        getContentPane().add(priceText);
        getContentPane().add(distanceLabel);
        getContentPane().add(distanceText);

        getContentPane().add(buttomPanel);


    }


}
