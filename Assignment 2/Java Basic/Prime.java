package com.sanchit;
import java.util.Scanner;

public class PrimeNum {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("ENTER THE NUMBER YOU WANT TO CHECK FOR PRIME");
        int n = in.nextInt();
        int flag = 0;
        int m = n/2;
        for (int i = 2; i < m ; i++) {
            if(n % i == 0) {
              flag = 1;
              break;
            }

        }

        if (flag == 1) {
            System.out.println(n + " number is not prime");
        }
        else {
            System.out.println(n + " number is prime");
        }
        }
    }

