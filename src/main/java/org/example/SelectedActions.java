package org.example;

import java.util.Scanner;

public class SelectedActions {

    /*охуенный коммент*/
    int action;
    public void enterAction(){
        action = readAction();

    }

    private int readAction() {
        int action = new Scanner(System.in).nextInt();

        if (!isValidAction(action)) {
            System.out.println("Неверное действие попробуйте еще раз");

            action = readAction();
        }

        return action;
    }

    public int getAction() {
        return action;
    }

    public boolean isValidAction(int action) {
        return action <= 4 && action > 0;
    }
}
