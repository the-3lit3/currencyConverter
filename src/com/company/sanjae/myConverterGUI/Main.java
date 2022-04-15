package com.company.sanjae.myConverterGUI;

import javax.swing.*;

public class Main {

    public static void main(String[] args) throws Exception{
        JFrame frame = new JFrame("CurrencyConverter");
        frame.setContentPane(new currencyConverter().currencyConverterView);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        //frame.setSize(300, 300);
        frame.setVisible(true);
    }
}
