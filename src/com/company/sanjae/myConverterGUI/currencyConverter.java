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
    private JLabel currencyConvLbl;
    JPanel currencyConverterView;

    currencyConverter(){

        DecimalFormat df = new DecimalFormat("0.00");
        convertButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //Code for converting currency from a foreign denomination to a local denomination.
                    try{
                        //Try clause to test the code logic and provide for a way to handle any errors that may arise
                        double inputValue = Double.parseDouble(convertText.getText());
                        if(inputValue == 0) {
                            JOptionPane.showMessageDialog(convertText, "Invalid input. Input text field appears empty.", "Error", JOptionPane.WARNING_MESSAGE);
                        }
                        int currencyType = currencyTypeComboBox.getSelectedIndex();
                        if(currencyType == 0) {
                            JOptionPane.showMessageDialog(currencyTypeComboBox, "Invalid input. Select an option from the dropdown box.", "Error", JOptionPane.WARNING_MESSAGE);
                        }
                        switch(currencyType){
                            //Switch statement to control the selection of currency type
                            case 1:{
                                double jmdConversion = inputValue * 129.02f;
                                jmdValue.setText(String.valueOf(df.format(jmdConversion)));
                                break;
                            }
                            case 2:{
                                double jmdConversion = inputValue * 97.50f;
                                jmdValue.setText(String.valueOf(jmdConversion));
                                break;
                            }
                            case 3:{
                                double jmdConversion = inputValue * 164.33f;
                                jmdValue.setText(String.valueOf(jmdConversion));
                                break;
                            }

                        }
                    }catch(Exception ex){
                        //Catch clause to catch and handle all errors that may arise and display meaningful message to user
                        JOptionPane.showMessageDialog(currencyConverterView, "Invalid input. One or more field may be empty.", "Error", JOptionPane.WARNING_MESSAGE);

                    }

            }
        });
        clearButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //Code for resetting form
                jmdValue.setText("");
                convertText.setText("");
                currencyTypeComboBox.setSelectedIndex(0);
            }
        });
    }

}