package com.company.sanjae.myConverterGUI;

import com.company.sanjae.myConverterGUI.currencyConverter;

import javax.swing.*;

public class Main {

    public static void main(String[] args) throws Exception{
	// write your code here
        JFrame frame = new JFrame("CurrencyConverter");
        frame.setContentPane(new currencyConverter().currencyConverterView);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setSize(300, 300);
        frame.setVisible(true);
    }

    //currencyConverter cv = new currencyConverter();


}
