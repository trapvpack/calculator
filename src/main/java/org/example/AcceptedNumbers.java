package org.example;

import java.util.Scanner;

public class AcceptedNumbers {
    float arg1;
    float arg2;

    public void numberEnter() {
        Scanner numberEnter = new Scanner(System.in);
         arg1 = numberEnter.nextFloat();
         arg2 = numberEnter.nextFloat();
    }

    public float getArg1() {
        return arg1;
    }

    public float getArg2() {
        return arg2;
    }

}
