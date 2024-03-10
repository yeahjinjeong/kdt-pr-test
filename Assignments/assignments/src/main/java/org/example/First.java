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

        // 나지영
        int a = 20;
        int b = 21;
        int c = ++a + b--;
        int d = --c - 3;
        System.out.println("a = " + a + ", b = " + b + ", c = " + c + ", d = " + d);
        // a = ?, b = ?, c = ?, d = ?

        System.out.println(true + "hello" + false);     // 출력 화면
        System.out.println(90 + 80 + "hi");             // 출력 화면
        System.out.println('g' + 'r' + 'a' + 'm');      // 출력 화면

    }
}
