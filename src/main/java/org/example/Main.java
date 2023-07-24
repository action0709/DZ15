package org.example;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random r = new Random();
        int[] ar1 = new int[100];
        for(int i = 0; i < ar1.length; i++) {
            ar1[i] = r.nextInt(100);
            System.out.print(i+"."+ar1[i] + "  ");
            System.out.println();
        }
        IntegerList integerList = new IntegerList();


    }
}