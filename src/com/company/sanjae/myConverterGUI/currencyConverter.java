package com.company.sanjae.myConverterGUI;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;

public class currencyConverter {
    private JTextField convertText;
    private JButton clearButton;
    private JButton convertButton;
    private JComboBox currencyTypeComboBox;
    private JTextField jmdValue;
    private JLabel JMDValueLabel;
    private JLabel currencyTypeLabel;
    private JLabel lblInputValue;
    JPanel currencyConverterView;
    private JLabel jmdAmountLabel;
    private JLabel currencyConvLbl;

    currencyConverter(){

        DecimalFormat df = new DecimalFormat("0.00");
        convertButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                    try{
                        double inputValue = Double.parseDouble(convertText.getText());
                        if(inputValue == 0) {
                            JOptionPane.showMessageDialog(convertText, "Invalid input. Input text field appears empty.", "Error", JOptionPane.WARNING_MESSAGE);
                        }
                        int currencyType = currencyTypeComboBox.getSelectedIndex();
                        if(currencyType == 0) {
                            JOptionPane.showMessageDialog(currencyTypeComboBox, "Invalid input. Select an option from the dropdown box.", "Error", JOptionPane.WARNING_MESSAGE);
                        }
                        switch(currencyType){
                            case 1:{
                                double jmdConversion = inputValue * 129.02f;
                                jmdAmountLabel.setText(String.valueOf(df.format(jmdConversion)));
                                break;
                            }
                            case 2:{
                                double jmdConversion = inputValue * 97.50f;
                                jmdAmountLabel.setText(String.valueOf(jmdConversion));
                                break;
                            }
                            case 3:{
                                double jmdConversion = inputValue * 164.33f;
                                jmdAmountLabel.setText(String.valueOf(jmdConversion));
                                break;
                            }

                        }
                    }catch(Exception ex){
                        JOptionPane.showMessageDialog(currencyConverterView, "Invalid input. One or more field may be empty.", "Error", JOptionPane.WARNING_MESSAGE);

                    }

            }
        });
        clearButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                jmdAmountLabel.setText("");
                convertText.setText("");
                currencyTypeComboBox.setSelectedIndex(0);
            }
        });
    }
}