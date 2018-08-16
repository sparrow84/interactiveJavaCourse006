package com.company;

import javax.swing.*;
import java.awt.*;

public class Main {
//                     createGUI
    public static void createGUI() {
        JFrame frame = new JFrame("Test frame 11111111");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JLabel label = new JLabel("Test label 22222222");
        frame.getContentPane().add(label);
        frame.setPreferredSize(new Dimension(200,100));
        frame.pack();
        frame.setVisible(true);
    }

    public static void main(String[] args) {
//        JFrame.setDefaultLookAndFeelDecorated(true);
        javax.swing.SwingUtilities.invokeLater(
            new Runnable() {
                public void run() {
                    createGUI();
                }
            }
        );
    }

}
