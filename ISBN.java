package com.sanchit;

import java.util.Scanner;

public class ISBN {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = 10;
        int arr[] = new int[10];
        for (int i = 0; i < n; i++) {
            arr[i] = input.nextInt();
        }
        int sum = arr[9] * 1 + arr[8] * 2 + arr[7] * 3 + arr[6] * 4 + arr[5] * 5 + arr[4] * 6 + arr[3] * 7 + arr[2] * 8 + arr[1] * 9 + arr[0] * 10;
        System.out.println(sum);
        if (sum % 11 == 0) {
            System.out.println("Yes, it is a ISBN Number");
        } else {
            System.out.println("NO, it is not a ISBN Number");
        }
    }
}
