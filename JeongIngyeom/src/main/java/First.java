public class First {

    public static void main(String[] args) {
        /*
        박지수

        1~12까지는 "오전", 13~24까지는 "오후"라고 표기하고 그 외의 숫자는 0으로 출력

        숫자를 정수로 변환 후 0보다 크고 100보다 작을경우 정수로 변환한 값 출력. 100이상일 경우 50으로 감소
        */
        int i = 1;
        System.out.println(i >= 1 && i <= 12 ? "오전" : i >= 13 && i <= 24 ? "오후" : "0");

        double d = 123.456;
        d = (int) d;
        System.out.println(d > 0 && d < 100 ? d : (d = 50));

        /*
        정예진
        - 주석을 풀지 않고 답란에 답을 적어주세요!

        1번
        char x = 'E';
        System.out.println(x > 97 ? ++x : x++);     // 1-1번 답 : E
        System.out.println(x);                      // 1-2번 답 : F
        System.out.println();

        2번
        double y = 22;
        final int z = 3;
        System.out.println(y/z == 7 ? z++ : z % 3); // 2번 답 : 오류
        */

        /*
        박수빈

        문제 1
        2030년의 J의 나이를 출력하세요.
        J는 32살 입니다.
        int future = 2030;

        문제 2
        a가 윤년이면 '윤년O', 아니면 '윤년X'로 출력하세요.
        윤년 계산법
        1. 연도/4가 나누어 떨어지고 연도/100이 나누어 떨어지지 않는다.
        2. 연도/400이 나누어 떨어진다.
        3. 둘 중 하나만 해당되도 윤년이다.
        int a = 2024;
        */
        int future = 2030;
        System.out.println(32 + (future - 2024));       // 38

        int a = 2024;
        System.out.println(a % 4 == 0 && a % 100 != 0 || a % 400 == 0 ? "윤년O" : "윤년X");     // 윤년O

        /*
        나지영

        int a = 20;
        int b = 21;
        int c = ++a + b--;
        int d = --c - 3;
        System.out.println("a = " + a + ", b = " + b + ", c = " + c + ", d = " + d);
        // a = 21, b = 20, c = 41, d = 38

        System.out.println(true + "hello" + false);     // truehellofalse
        System.out.println(90 + 80 + "hi");             // 170hi
        System.out.println('g' + 'r' + 'a' + 'm');      // 103+114+97+109 = 423
        */
    }
}
