package zajecia_XII_16;

import javax.swing.*;

/**
 * Created on 16.12.16, at 18:10
 */
public class Saper {
    private JPanel fff;
    private JButton a1Button;
    private JButton a2Button;
    private JButton a3Button;
    private JButton a4Button;
    private JButton a5Button;
    private JButton pokazMinyButton;

    ///////////////////////////////////
    // Model




    public static void main(String[] args) {
        JFrame frame = new JFrame("Saper");
        frame.setContentPane(new Saper().fff);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}
