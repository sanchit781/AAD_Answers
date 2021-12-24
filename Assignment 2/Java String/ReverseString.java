package com.sanchit;

import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the String");
        String st = in.nextLine();
        System.out.println("Reverse String is");
        for (int i = st.length(); i > 0 ; --i) {
            System.out.println(st.charAt(i-1)+  " ");
        }
    }
}
