package com.study;

public class Study01 {
    public static void main(String[] args) {
        // 박지수
        //1~12까지는 "오전", 13~24까지는 "오후"라고 표기하고 그 외의 숫자는 0으로 출력
        int a1 = 11;
        System.out.println(a1 >= 1 && a1 <=12 ? "오전" : (a1 >= 13 && a1 <= 24 ? "오후" : "0"));

        //숫자를 정수로 변환 후 0보다 크고 100보다 작을경우 정수로 변환한 값 출력. 100이상일 경우 50으로 감소
        int k = 15;
        double p = 0;
        System.out.println((k + p > 0) && (k + p < 100) ? k + p : 50);


        // 정예진 주석을 풀지 않고 답란에 답을 적어주세요!
        // 1번
        /*
        char x = 'E';
        System.out.println(x > 97 ? ++x : x++); // 1-1번 답 : E
        System.out.println(x); // 1-2번 답 : F
        System.out.println();
        */


        // 2번
        /*
        double y = 22;
        final int z = 3;
        System.out.println(y/z == 7 ? z++ : z % 3); // 2번 답 : error
        */

        // 나지영
        int a = 20;
        int b = 21;
        int c = ++a + b--;
        int d = --c - 3;
        System.out.println("a = " + a + ", b = " + b + ", c = " + c + ", d = " + d);
        // a = ?, b = ?, c = ?, d = ?
        // a = 21, b = 20, c = 41, d = 38

        System.out.println(true + "hello" + false);     // truehellofalse
        System.out.println(90 + 80 + "hi");             // 170hi
        System.out.println('g' + 'r' + 'a' + 'm');      // 423

        // 정인겸
        int i = Integer.MAX_VALUE;
        int j = i++;
        int l = --i;
        System.out.println(j == l);     // true or false? true

        int a2 = 95;
        int b2 = 80;
        int c2 = 100;
        int d2 = (a2 + b2 + c2) / 3;
        double e = (a2 + b2 + c2) / 3;
        System.out.println(d2 == e);     // true or false? true
    }
}
