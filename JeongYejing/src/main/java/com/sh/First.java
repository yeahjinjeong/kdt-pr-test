package com.sh;

public class First {

    public static void main(String[] args) {
        // 정인겸
//        int i = Integer.MAX_VALUE; // 2147483647
//        int j = i++; // j = 2147483647, i = 2147483648
//        int l = --i; // l = 2147483647
//        System.out.println(j == l);     // true or false? // true
//
//        int a = 95;
//        int b = 80;
//        int c = 100;
//        int d = (a + b + c) / 3; // d = 91
//        double e = (a + b + c) / 3; // e = 91.6666667
//        System.out.println(d == e);     // true or false? // false -> 답은 true !
//        System.out.println(e);
//        e = (a + b + c) / 3.0;
//        System.out.println(e);

        // 박지수
//        //1~12까지는 "오전", 13~24까지는 "오후"라고 표기하고 그 외의 숫자는 0으로 출력
//        int currentTime;
//        System.out.println(currentTime >= 1 && currentTime <= 12 ? "오전" : (currentTime >= 13 && currentTime <= 24 ? "오후" : 0));
//
//        //숫자를 정수로 변환 후 0보다 크고 100보다 작을경우 정수로 변환한 값 출력. 100이상일 경우 50으로 감소
//        double num;
//        num = (int) num;
//        System.out.println(num >= 0 && num <= 100 ? num : num - 50);

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
        System.out.println(y/z == 7 ? z++ : z % 3); // 2번 답 : 오류
        */

        // 박수빈
        //문제 1
        // 2030년의 J의 나이를 출력하세요.
        // J는 32살 입니다.
//        int future = 2030;
//        System.out.println("J는 " + (32 + future) + "살 입니다.");

        // 문제 2
        // a가 윤년이면 '윤년O', 아니면 '윤년X'로 출력하세요.
        // 윤년 계산법
        // 1. 연도/4가 나누어 떨어지고 연도/100이 나누어 떨어지지 않는다.
        // 2. 연도/400이 나누어 떨어진다.
        // 3. 둘 중 하나만 해당되도 윤년이다.
//        int a = 2024;
//        System.out.println((a % 4 == 0 && a % 100 != 0) || a % 400 == 0 ? "윤년O" : "윤년X");

        // 나지영
//        int a = 20;
//        int b = 21;
//        int c = ++a + b--; // 21 + 21 = 42, b = 20
//        int d = --c - 3; // 41 - 3 = 38
//        System.out.println("a = " + a + ", b = " + b + ", c = " + c + ", d = " + d);
//        // a = 21, b = 20, c = 41, d = 38
//
//        System.out.println(true + "hello" + false);     // 출력 화면 //truehellofalse
//        System.out.println(90 + 80 + "hi");             // 출력 화면 //170hi
//        System.out.println('g' + 'r' + 'a' + 'm');      // 출력 화면 //gram -> 423
    }
}