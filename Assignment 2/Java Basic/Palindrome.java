package com.sanchit;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner in  = new Scanner(System.in);
        System.out.println("ENTER NUMBER TO CHECK FOR PALINDROME");
        int n = in.nextInt();
        // creating a temporary variable to store value of number
        int temp = n;
        // creating variable to store reversed number
        int reversed = 0;

        while(n > 0){
            int rem = n%10;
            reversed = reversed*10 + rem;
            n /= 10;
        }
        if(temp == reversed) {
            System.out.println("GIVEN NUMBER IS A PALINDROME ");
        }

        else{
            System.out.println("IT IS NOT A PALINDROME ");
        }
    }
}
