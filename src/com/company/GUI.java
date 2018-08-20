package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GUI extends JFrame {
    public GUI() {
        setTitle("Calculator");
        // Set action for close button
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // Set size window
        setBounds(600, 300, 220, 200);

        // Make new text field
        JTextField textField = new JTextField();

        JPanel buttonPanel = new JPanel();

        // Set layout GUI JFrame
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
//        JButton bSquaring = new JButton("x²");ⁿ
        JButton bSquaring = new JButton("xⁿ");
        JButton bC = new JButton("C");
        JButton bResult = new JButton("=");
        JButton b12 = new JButton("");
        JButton b13 = new JButton("");
        JButton b14 = new JButton("");

        buttonPanel.add(bC);
        buttonPanel.add(b12);
        buttonPanel.add(bSquaring);
        buttonPanel.add(bPlus);
        buttonPanel.add(b1);
        buttonPanel.add(b2);
        buttonPanel.add(b3);
        buttonPanel.add(bMinus);
        buttonPanel.add(b4);
        buttonPanel.add(b5);
        buttonPanel.add(b6);
        buttonPanel.add(bMultilplication);
        buttonPanel.add(b7);
        buttonPanel.add(b8);
        buttonPanel.add(b9);
        buttonPanel.add(bDivision);
        buttonPanel.add(b13);
        buttonPanel.add(b0);
        buttonPanel.add(bResult);
        buttonPanel.add(b14);


        b0.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Logic.getExpresoinPart(b0.getText());
                textField.setText(Logic.getStringBufer());
            }
        });
        b1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Logic.getExpresoinPart(b1.getText());
                textField.setText(Logic.getStringBufer());
            }
        });
        b2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Logic.getExpresoinPart(b2.getText());
                textField.setText(Logic.getStringBufer());
            }
        });
        b3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Logic.getExpresoinPart(b3.getText());
                textField.setText(Logic.getStringBufer());
            }
        });
        b4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Logic.getExpresoinPart(b4.getText());
                textField.setText(Logic.getStringBufer());
            }
        });
        b5.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Logic.getExpresoinPart(b5.getText());
                textField.setText(Logic.getStringBufer());
            }
        });
        b6.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Logic.getExpresoinPart(b6.getText());
                textField.setText(Logic.getStringBufer());
            }
        });
        b7.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Logic.getExpresoinPart(b7.getText());
                textField.setText(Logic.getStringBufer());
            }
        });
        b8.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Logic.getExpresoinPart(b8.getText());
                textField.setText(Logic.getStringBufer());
            }
        });
        b9.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Logic.getExpresoinPart(b9.getText());
                textField.setText(Logic.getStringBufer());
            }
        });

        bPlus.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Logic.getExpresoinPart(bPlus.getText());
            }
        });
        bMinus.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Logic.getExpresoinPart(bMinus.getText());
            }
        });
        bMultilplication.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Logic.getExpresoinPart(bMultilplication.getText());
            }
        });
        bDivision.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Logic.getExpresoinPart(bDivision.getText());
            }
        });
        bResult.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Logic.getExpresoinPart(bResult.getText());
                textField.setText(Double.toString(Logic.getRes()));
                Logic.resetAll();
            }
        });

        bC.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Logic.resetAll();
                textField.setText("");
            }
        });

//        bSquaring.addActionListener(new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent e) {
//                Logic.getExpresoinPart(bSquaring.getText());
//                textField.setText(Double.toString(Logic.getRes()));
//                Logic.resetAll();
//            }
//        });

        bSquaring.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Logic.getExpresoinPart(bSquaring.getText());
            }
        });


        add(textField);

        add(buttonPanel);


        setVisible(true);
    }


}
