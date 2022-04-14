package com.company.sanjae.myConverterGUI;

public class findConversionEUR {
    private double Rate;
    private double inValue;

    public findConversionEUR(){}

    public void setValues(double iVal){
        this.inValue = iVal;
        this.Rate = 164.33;



    }

    public double getConversionResult(){
        double jmdValue = inValue * Rate;

        return jmdValue;
    }
}
