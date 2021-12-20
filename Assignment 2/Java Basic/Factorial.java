package com.sanchit;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number");
        int i = in.nextInt();
        int fact = 1;
        if(i == 0 || i == 1){
            System.out.println("Factorial of "+ i + " is 1");
        }
        
        else {
            for (int j = 1; j < i+1; j++) {
                fact = fact * j;
            }
            System.out.println("Factorial is "+ fact);
        }

    }
}
