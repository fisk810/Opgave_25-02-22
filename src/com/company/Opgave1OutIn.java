package com.company;

import java.util.Scanner;

public class Opgave1OutIn{
    Scanner input = new Scanner(System.in);
    private Opgave1 op1 = new Opgave1();

    public double sphereVolumeIn(){
        double radius = input.nextInt();
        return op1.sphereVolume(radius);
    }

    public double taxAddIn(){
        double currencyAmount = input.nextInt();
        return op1.taxAdd(currencyAmount);
    }
}
