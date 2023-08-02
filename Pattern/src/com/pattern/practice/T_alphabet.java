package com.pattern.practice;

public class T_alphabet {
    public static void main(String[] args) {

        //Scanner scanner=new Scanner(System.in);
        //System.out.println("Enter the Size of Alhabet: ");
        int n = 5; //=scanner.nextInt();

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i == 0 || j == n / 2) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }

            }
            System.out.println();
        }
    }
}
