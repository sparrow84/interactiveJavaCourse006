package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GUI1 extends JFrame {
    public GUI1() {
        setTitle("Calculator");
        // Set action for close button
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // Set size window
        setBounds(600,300,220,200);

        // Make new text field
        JTextField textField = new JTextField();

        JPanel buttonPanel = new JPanel();

        // Set layout GUI1 JFrame
        setLayout(new BoxLayout(getContentPane(), BoxLayout.Y_AXIS));

        // Set layout JPanel
        buttonPanel.setLayout(new GridLayout(5, 4));

        // Create buttons
        JButton b1 = new JButton("1");
        JButton b2 = new JButton("2");
        JButton b3 = new JButton("3");
        JButton b4 = new JButton("4");
        JButton b5 = new JButton("5");
        JButton b6 = new JButton("6");
        JButton b7 = new JButton("7");
        JButton b8 = new JButton("8");
        JButton b9 = new JButton("9");
        JButton b0 = new JButton("0");
        JButton bPlus = new JButton("+");
        JButton bMinus = new JButton("-");
        JButton bDivision = new JButton("/");
        JButton bMultilplication = new JButton("*");
        JButton bSquaring = new JButton("^2");
        JButton bC = new JButton("C");
        JButton bResult = new JButton("=");
        JButton b12 = new JButton("1");
        JButton b13 = new JButton("1");
        JButton b14 = new JButton("1");

        buttonPanel.add(b1);
        buttonPanel.add(b2);
        buttonPanel.add(b3);
        buttonPanel.add(bPlus);
        buttonPanel.add(b4);
        buttonPanel.add(b5);
        buttonPanel.add(b6);
        buttonPanel.add(bMinus);
        buttonPanel.add(b7);
        buttonPanel.add(b8);
        buttonPanel.add(b9);
        buttonPanel.add(bMultilplication);
        buttonPanel.add(bC);
        buttonPanel.add(b0);
        buttonPanel.add(bSquaring);
        buttonPanel.add(bDivision);
        buttonPanel.add(bResult);
        buttonPanel.add(b12);
        buttonPanel.add(b13);
        buttonPanel.add(b14);

        b1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println(b1.getText());
            }
        });


        add(textField);

        add(buttonPanel);


        setVisible(true);
    }


}
