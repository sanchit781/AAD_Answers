package com.sanchit;

import java.util.Scanner;

public class NeonNum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number you want to check for neon number: ");
        int n = input.nextInt();
        int squared = n*n;
        int new_n = 0;
        while(squared > 0) {
            int rem = squared % 10;
            new_n = new_n + rem;
            squared /= 10;
        }

        if(new_n == n) {
            System.out.println("Given number is neon number");
        }
        else {
            System.out.println("No, it is not a neon number");
        }
    }


}
