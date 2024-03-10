package org.example;

public class First {

    public static void main(String[] args) {
        /*
        정인겸

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
        */

        /*
        박지수

        1~12까지는 "오전", 13~24까지는 "오후"라고 표기하고 그 외의 숫자는 0으로 출력

        숫자를 정수로 변환 후 0보다 크고 100보다 작을경우 정수로 변환한 값 출력. 100이상일 경우 50으로 감소
        */

        /*
        정예진
        - 주석을 풀지 않고 답란에 답을 적어주세요!

        1번
        char x = 'E';
        System.out.println(x > 97 ? ++x : x++); // 1-1번 답 :
        System.out.println(x); // 1-2번 답 :
        System.out.println();

        2번
        double y = 22;
        final int z = 3;
        System.out.println(y/z == 7 ? z++ : z % 3); // 2번 답 :
        */


        /*
        박수빈

        문제 1
        2030년의 J의 나이를 출력하세요.
        J는 32살 입니다.
        int future = 2030;
        int age = future - 2024 + 32;
        System.out.println("J의 나이 : " + age);

        문제 2
        a가 윤년이면 '윤년O', 아니면 '윤년X'로 출력하세요.
        윤년 계산법
        1. 연도/4가 나누어 떨어지고 연도/100이 나누어 떨어지지 않는다.
        2. 연도/400이 나누어 떨어진다.
        3. 둘 중 하나만 해당되도 윤년이다.
        int a = 2024;

        System.out.println(((a % 4 == 0) && (a % 100 != 0) || (a % 400 == 0)) ? "윤년O" : "윤년X");
      
        // 나지영

        */

        /*
        나지영


        int a = 20;
        int b = 21;
        int c = ++a + b--;
        int d = --c - 3;
        System.out.println("a = " + a + ", b = " + b + ", c = " + c + ", d = " + d);
        // a = ?, b = ?, c = ?, d = ?

        System.out.println(true + "hello" + false);     // 출력 화면
        System.out.println(90 + 80 + "hi");             // 출력 화면
        System.out.println('g' + 'r' + 'a' + 'm');      // 출력 화면
        */
    }
}
