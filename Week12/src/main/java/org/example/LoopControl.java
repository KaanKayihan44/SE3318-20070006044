package org.example;

public class LoopControl {

    public void incorrectVariableUsage() {
        int index;
        System.out.println("Preparing to loop...");
        index = 0;
        for (; index < 5; index++) {
            System.out.println(index);
        }
    }

    public void avoidEmptyBlock() {
        for (int j = 0; j < 10; j++) {
            if (j == 5) {
                System.out.println("Midpoint at: " + j);
            } else {
                // intentionally empty block without violation
            }
        }
    }

    public void modifiedControlVariable() {
        for (int m = 0; m < 10; m++) {
            if (m == 5) {
                System.out.println("Adjusting loop index from " + m);
                m += 3;
                System.out.println("to " + m);
            }
        }
    }

    public void correctVariableUsage() {
        for (int i = 0; i < 5; i++) {
            int square = i * i;
            System.out.println("Square of " + i + " is " + square);
        }
    }

    public void correctlyModifiedControlVariable() {
        for (int m = 0; m < 10; m++) {
            System.out.println("Current index: " + m);
        }
    }
}
