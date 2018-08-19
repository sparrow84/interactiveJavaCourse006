package com.company;

import javax.swing.*;
import java.awt.*;

public class Main {

    public static void createTestGUI() {
        JFrame frame = new JFrame("Test frame 11111111");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JLabel label = new JLabel("Test label 22222222");
        frame.getContentPane().add(label);
        frame.setPreferredSize(new Dimension(200,100));
        frame.pack();
        frame.setVisible(true);
    }

    public static void GUI() {

    }

    public static void main(String[] args) {
//        JFrame.setDefaultLookAndFeelDecorated(true);
/*
        javax.swing.SwingUtilities.invokeLater(
            new Runnable() {
                public void run() {
                    createTestGUI();
                }
            }
        );
*/

        // Create window
//        JFrame frame = new JFrame("Vertical Layout");

        // Determine the size
//        frame.setSize(260,150);
//        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Create panel with manager vertical layout
//        JPanel contents = new JPanel(new VerticalLayout());


        GUI gui1 = new GUI();

    }

}
