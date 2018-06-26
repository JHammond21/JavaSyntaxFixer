package GUI;

import javax.swing.*;
import java.awt.*;

public class Frame {
    public void frame() {
        //create the frame
        JFrame jFrame = new JFrame();

        //set the dimensions of the frame and loading location
        Dimension dimension = Toolkit.getDefaultToolkit().getScreenSize();
        final int height = dimension.height;
        final int width = dimension.width;
        jFrame.setSize(height / 2, width / 2);
        jFrame.setLocationRelativeTo(null);

        //adding a text field for the code to be entered
        JTextField textField = new JTextField("This is a text");
        String content = textField.getText();
        jFrame.add(textField, BorderLayout.CENTER);

        //:TODO add a button for user to press when code has been added

        //:TODO GET TEXT FROM TEXT BOX ALSO NEEDED
        //set frame visible and close
        jFrame.setDefaultCloseOperation(jFrame.EXIT_ON_CLOSE);

        jFrame.setVisible(true);


    }
}
