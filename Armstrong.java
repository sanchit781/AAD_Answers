package com.sanchit;

import java.util.Scanner;

public class Armstrong {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter number to check Armstrong: ");
        int n = in.nextInt();
        int clone_n = n;
        int clone_n_2 = n;
        int new_n = 0;
        int count = 0;

        while(clone_n_2 != 0) {
            clone_n_2 = clone_n_2 / 10;
            count ++;
        }

        while (clone_n > 0) {
            int digit = clone_n % 10;
            new_n = (int) (new_n + Math.pow(digit, count));
            clone_n /= 10;
        }


        if (new_n == n) {
            System.out.println("Given Number is Armstrong");
        }
        else {
            System.out.println("Number is not Armstrong");
        }

    }
}
