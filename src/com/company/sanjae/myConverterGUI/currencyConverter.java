package com.company.sanjae.myConverterGUI;

import jdk.dynalink.Operation;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import java.beans.PropertyChangeListener;

public class currencyConverter {
    private JTextField convertText;
    private JButton clearButton;
    private JButton convertButton;
    private JComboBox currencyTypeComboBox;
    private JTextField jmdValue;
    private JLabel JMDValueLabel;
    private JLabel currencyTypeLabel;
    private JLabel lblInputValue;
    private double iv, ov;
    String x;

    JPanel currencyConverterView;

    findConversionUSD usd = new findConversionUSD();

    currencyConverter(){

        clearButton.addActionListener(e -> {
            jmdValue.setText("");
            convertText.setText("");
            currencyTypeComboBox.setSelectedIndex(0);

        });
        convertButton.addActionListener(e -> {

        });
        convertText.addFocusListener(new FocusAdapter() {
            @Override
            public void focusGained(FocusEvent e) {
                super.focusGained(e);
                iv = Double.parseDouble(convertText.getText());

            }
        });
        jmdValue.addActionListener(e -> {

        });
    }

    private void actionPerformed(ActionEvent e) {
        usd.setValues(iv);
        ov = usd.getConversionResult();
        x = String.valueOf(ov);
        jmdValue.setText(x);
    }

}