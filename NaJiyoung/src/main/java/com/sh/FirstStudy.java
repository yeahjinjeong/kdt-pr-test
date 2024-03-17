package com.sh;

public class FirstStudy {
    public static void main(String[] args) {
        // 정인겸
        int i = Integer.MAX_VALUE;      // 21_4748_3648
        int j = i++;                    // i == 7, j == 8
        int l = --i;                    // i == 7, l == 7
        System.out.println(j == l);     // true

        int a = 95;
        int b = 80;
        int c = 100;
        int d = (a + b + c) / 3;        // 91
        double e = (a + b + c) / 3;     // // a + b + c 가 int 여서 int로 출력됨
        System.out.println(d == e);     // true
        // false로 나오려면 (a + b + c) / 3.0이어야 double 형으로 출력됨

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
        System.out.println(y/z == 7 ? z++ : z % 3); // 2번 답 : 컴파일 오류
        // final 변수는 변경할 수 없다.
        */

        // 박수빈
        //문제 1
        // 2030년의 J의 나이를 출력하세요.
        // J는 32살 입니다.
        int future = 2030;
        int J = 32;
        int ageOfJ = 2062;
        System.out.println("J의 나이는 " + ageOfJ + " 입니다.");

        // 문제 2
        // a가 윤년이면 '윤년O', 아니면 '윤년X'로 출력하세요.
        // 윤년 계산법
        // 1. 연도/4가 나누어 떨어지고 연도/100이 나누어 떨어지지 않는다.
        // 2. 연도/400이 나누어 떨어진다.
        // 3. 둘 중 하나만 해당되도 윤년이다.
        int a = 2024;
        System.out.println((a%4==0 && a%100!=0) || (a%400==0)? "윤년O" : "윤년X");

        // 나지영
        int a = 20;
        int b = 21;
        int c = ++a + b--;
        int d = --c - 3;
        System.out.println("a = " + a + ", b = " + b + ", c = " + c + ", d = " + d);
        // a = 21, b = 20, c = 41, d = 38

        System.out.println(true + "hello" + false);     // truehellofalse
        System.out.println(90 + 80 + "hi");             // 170hi
        System.out.println('g' + 'r' + 'a' + 'm');      // 423

    }
}