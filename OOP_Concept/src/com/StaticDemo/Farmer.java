package com.StaticDemo;

import java.util.Scanner;

class Launch {

    private static float RI;

    static {
        RI = 5.0f;
    }

    private float PA;
    private float TD;
    private float SI;

    public void getData() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Kindly Enter the Amount that You Want.");
        PA = scanner.nextFloat();

        System.out.println("Kindly Enter Time Duration to Repay.");
        TD = scanner.nextFloat();
        //I=2.5f;
    }

    public void compute() {
        SI = (PA * TD * RI) / 100;
    }

    public void display() {
        System.out.println("Simple Interest:" + SI);
    }

}

public class Farmer {
    public static void main(String[] args) {
        Launch launch = new Launch();
        launch.getData();
        launch.compute();
        launch.display();
    }
}
