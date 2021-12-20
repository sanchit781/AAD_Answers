package com.sanchit;

import java.util.Scanner;

public class Spynum {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("ENTER THE NUMBER");
        int n = in.nextInt();
        int sum = 0;
        int product = 1;
        while (n > 0) {
            int digit = n % 10;
            sum = sum + digit;
            product = product * digit;
            n /= 10;
        }

        if(sum == product) {
            System.out.println("Yes is a spy number");
        }
        else {
            System.out.println("No it is not a spy number");
        }
    }
}
