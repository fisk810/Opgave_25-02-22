package com.company;

import org.junit.Test;

import java.math.BigDecimal;
import java.math.MathContext;

import static org.junit.Assert.*;

public class Opgave1Test {
    Opgave1 op1 = new Opgave1();

    @Test
    public void sphereVolume() {
        double res = op1.sphereVolume(10);
        BigDecimal bd = new BigDecimal(res);
        bd = bd.round(new MathContext(6));
        assertEquals(4188.79, bd.doubleValue(),0);
    }


    @Test
    public void taxAdd() {
        double res = op1.taxAdd(10);
        assertEquals(10.5,res,0);
    }
}