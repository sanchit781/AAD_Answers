package com.sanchit;

import java.util.Scanner;

public class NaturalNum {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number for sum of natural number");
        int n = in.nextInt();
        int sum = (n*(n+1))/2;
        System.out.println(sum);
    }
}
