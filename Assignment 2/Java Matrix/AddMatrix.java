package com.sanchit;

public class AddMatrix {
    public static void main(String[] args) {
        int a[][] = {{2,5,6},{7,3,1},{4,9,0}};
        int b[][] = {{5,5,5},{2,4,7},{6,7,6}};

        int c[][] = new int[3][3];

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                c[i][j] = a[i][j] + b[i][j];
                System.out.println(c[i][j]+" ");
            }
            System.out.println();
        }
    }
}
