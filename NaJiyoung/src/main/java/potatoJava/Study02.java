package potatoJava;

import java.util.Scanner;

// 2주차 스터디 2024/03/17
public class Study02 {
    public static void main(String[] args) {
        Study02 study = new Study02();
        study.test();
    }

    public void test() {
        Scanner sc = new Scanner(System.in);
        int num = 0;    // 입력받은 숫자
        int[] numsArr = new int[10];    // 숫자를 넣은 배열
        int[] remain = new int[10]; // 숫자들을 42로 나눈 나머지를 넣은 배열
        int[] result = new int[10];    // 나머지 수가 서로 같을 때 중복 제거
        int[] temp = new int[0];     // 중복을 넣을 배열
        int cnt = 0;    // 중복 횟수

        for (int i = 0; i < numsArr.length; i++) {
            System.out.print("숫자 입력 : ");
            num = sc.nextInt();

            if (num > 0 && num <= 1000) {
                numsArr[i] = num;
                remain[i] = numsArr[i] % 42;

                if(i>=1 && remain[i-1]!=remain[i]) {
                    cnt ++;
                    // temp.length = cnt;
                    temp[i] = remain[i-1];
                }
            } else {
                System.out.println("숫자는 1,000보다 작거나 같고, 음이 아닌 정수여야 합니다.");
                return;
            }
        }
        System.out.println("42로 나누었을 때, 서로 다른 나머지 갯수 : " + temp.length);
    }
}