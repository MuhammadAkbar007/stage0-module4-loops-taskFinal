package school.mjc.stage0.loops.finalTask;

import java.util.Scanner;

public class MultiplicationTable {
    public void printTable(int numberTableToPrint) {
        if (numberTableToPrint <= 0) {
            System.out.println("number is not positive");
        } else {
            for (int i = 1; i < 11; i++) {
                System.out.println(numberTableToPrint + " x " + i + " = " + numberTableToPrint * i);
            }
        }
    }
}
