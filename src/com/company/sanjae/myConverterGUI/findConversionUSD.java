package com.company.sanjae.myConverterGUI;

public class findConversionUSD {
    private double Rate;
    private double inValue;

    public findConversionUSD(){}

    public void setValues(double iVal){
        this.inValue = iVal;
        this.Rate = 129.02;



    }

    public double getConversionResult(){
        double jmdValue = inValue * Rate;

        return jmdValue;
    }
}
