package org.example;

public class First {

    public static void main(String[] args) {
        // 정인겸
        int i = Integer.MAX_VALUE;
        int j = i++;
        int l = --i;
        System.out.println(j == l);     // true or false?

        int a = 95;
        int b = 80;
        int c = 100;
        int d = (a + b + c) / 3;
        double e = (a + b + c) / 3;
        System.out.println(d == e);     // true or false?


    }
}
