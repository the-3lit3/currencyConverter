package com.company.sanjae.myConverterGUI;

import jdk.dynalink.Operation;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class currencyConverter {
    private JTextField convertText;
    private JButton clearButton;
    private JButton convertButton;
    private JComboBox currencyTypeComboBox;
    private JTextField jmdValue;
    private JLabel JMDValueLabel;
    private JLabel currencyTypeLabel;
    private JLabel lblInputValue;
    private double leftOperand;
    private String ct;
    private double ov, rate;

    JPanel currencyConverterView;

    currencyConverter(){

        convertText.addActionListener(e -> leftOperand = Double.parseDouble(convertText.getText()));

        currencyTypeComboBox.addActionListener(e -> {
            ct = String.valueOf(currencyTypeComboBox.getSelectedIndex());
        });
        jmdValue.addActionListener(e -> {
            ov = Double.parseDouble(jmdValue.toString());
        });

        convertButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });

        clearButton.addActionListener(e -> {
            jmdValue.setText("");
            convertText.setText("");
            currencyTypeComboBox.setSelectedIndex(0);
            leftOperand = 0.0;

        });


    }
    private class operate implements ActionListener{
        private Operation op;

        public operate(Operation tOp){
            this.op = tOp;

        }

        @Override
        public void actionPerformed(ActionEvent e) {

        }
    }
}