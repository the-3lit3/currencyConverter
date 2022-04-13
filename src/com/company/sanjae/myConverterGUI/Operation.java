package com.company.sanjae.myConverterGUI;

import java.util.function.DoubleBinaryOperator;

public enum Operation {
    ADDITION((X,Y) -> X+Y),
    SUBTRACTION((X,Y) -> X-Y),
    MULTIPLICATION((X,Y) -> X*Y),
    DIVISION((X,Y) -> X/Y),
    PERCENTAGE((X,Y) -> X%Y);

    private DoubleBinaryOperator operator;

    Operation(DoubleBinaryOperator op){
        this.operator = op;
    }

    public DoubleBinaryOperator getOperator(){

        return operator;
    }
}
