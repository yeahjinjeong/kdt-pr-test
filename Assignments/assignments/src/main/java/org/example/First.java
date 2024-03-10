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

        // 정예진 주석을 풀지 않고 답란에 답을 적어주세요!
        // 1번
        /*
        char x = 'E';
        System.out.println(x > 97 ? ++x : x++); // 1-1번 답 :
        System.out.println(x); // 1-2번 답 :
        System.out.println();
        */

        // 2번
        /*
        double y = 22;
        final int z = 3;
        System.out.println(y/z == 7 ? z++ : z % 3); // 2번 답 :
        */

    }
}
