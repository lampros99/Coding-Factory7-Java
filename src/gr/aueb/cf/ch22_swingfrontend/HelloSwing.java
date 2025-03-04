package gr.aueb.cf.ch22_swingfrontend;

import javax.swing.*;


public class HelloSwing {

    public static void main(String[] args) {
        JFrame jframe = new JFrame();

        jframe.setTitle("First Swing app");
        jframe.setSize(600, 300);
        jframe.setLocationRelativeTo(null); //aligns to the center of the screen
        jframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


        JPanel contentPane = new JPanel();
        jframe.setContentPane(contentPane);

        contentPane.add(new JLabel("Hello World"));
        jframe.setVisible(true);

    }
}
