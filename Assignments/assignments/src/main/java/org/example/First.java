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

        // 박지수
        //1~12까지는 "오전", 13~24까지는 "오후"라고 표기하고 그 외의 숫자는 0으로 출력

        //숫자를 정수로 변환 후 0보다 크고 100보다 작을경우 정수로 변환한 값 출력. 100이상일 경우 50으로 감소


    }
}
