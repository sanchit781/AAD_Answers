package com.sanchit;

import java.util.Scanner;

public class CountChar {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("ENTER THE LINE");
        String st = in.nextLine();
        int count = 0;
        for (int i = 0; i < st.length() ; i++) {
            if(st.charAt(i) != ' '){
                count++;
            }
        }
        System.out.println("Total numbers of characters are " + count);
    }
}
