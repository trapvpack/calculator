package org.example;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        AcceptedNumbers numbers = new AcceptedNumbers();
        SelectedActions actions = new SelectedActions();
        Calculator calculator = new Calculator();
        System.out.println("Введите два числа:" + '\n');
        numbers.numberEnter();
        System.out.println("Выберите действие:" + '\n' + "1 - Сложение | " + "2 - Умножение | " + "3 - Вычитание | " + "4 - Деление");
        actions.enterAction();
        System.out.println(calculator.result(actions.getAction(), numbers.getArg1(), numbers.getArg2()));
    }
}
