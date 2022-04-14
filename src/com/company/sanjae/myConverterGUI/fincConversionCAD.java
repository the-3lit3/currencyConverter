package com.company.sanjae.myConverterGUI;

public class fincConversionCAD {
    private double Rate;
    private double inValue;

    public fincConversionCAD(){}

    public void setValues(double iVal){
        this.inValue = iVal;
        this.Rate = 97.50;



    }

    public double getConversionResult(){
        double jmdValue = inValue * Rate;

        return jmdValue;
    }
}
