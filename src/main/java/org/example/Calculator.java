package org.example;

public class Calculator {

    SelectedActions actions = new SelectedActions();

    float result(int action, float args1, float args2){
        float result = 0;

        switch (action) {
            case 1 -> result = amount(args1, args2);
            case 2 -> result = multiplication(args1, args2);
            case 3 -> result = difference(args1, args2);
            case 4 -> result = division(args1, args2);
            default -> System.out.println("Invalid input");
        }

        return result;
    }

    float amount(float arg1, float arg2) {
        return arg1+arg2;
    }

    float multiplication(float arg1, float arg2) {
        return arg1*arg2;
    }

    float division(float arg1, float arg2) {
        return arg1/arg2;
    }

    float difference(float arg1, float arg2) {
        return arg1 - arg2;
    }
}
