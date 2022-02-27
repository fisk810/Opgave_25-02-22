package com.company;

import org.junit.Test;

import static org.junit.Assert.*;

public class Opgave2Test {

    @Test
    public void polynomial() {
        Opgave2 op2 = new Opgave2();
        double res = op2.polynomial(10);
        assertEquals(314964,res,0);
    }
}