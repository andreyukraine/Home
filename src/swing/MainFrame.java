package swing;

import javax.swing.*;
import java.awt.*;

/**
 * Created by IT on 12.06.2016.
 */
public class MainFrame extends JFrame {
    public MainFrame() throws HeadlessException {
        setTitle("Make Order2");
        setSize(400, 400);
        init();
        setVisible(true);
        setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);

    }

    private void init() {
        final JLabel message = new JLabel("Ваш заказ оформлен.");


        System.out.print(message);


        getContentPane().add(message);
    }
}
