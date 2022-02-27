package com.company;

import java.math.BigDecimal;
import java.math.MathContext;

public class Opgave1 {

    public double sphereVolume(double radius){
        return (double)4/3 * Math.PI * Math.pow(radius,3);
    }

    public double taxAdd(double currencyAmount){
        return currencyAmount + currencyAmount * 0.05;
    }


}
