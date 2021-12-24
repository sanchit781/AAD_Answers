package com.sanchit;

import java.util.Scanner;

public class FrequencyChar {
    public static void main(String[] args) {
        Scanner in  =new Scanner(System.in);
        System.out.println("Enter the String");
        String st = in.nextLine();
        int[] freq = new int[st.length()];
        int i,j;
        char string[] = st.toCharArray();

        for (int k = 0; k < st.length(); k++) {
            freq[k] = 1;
            for (int l = 0; l < st.length() ; l++) {
                if(string[k] == string[l]){
                    freq[k]++;
                }
            }
        }

    }
}
