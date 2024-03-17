package com.study;

import java.util.Scanner;

public class Study02 {
    public static void main(String[] args) {
        // 문제1 - 백준 3052번
//        Scanner sc = new Scanner(System.in);
//
//        int[] list = new int[10];
//        for (int i = 0; i < 10; i++) {
//            System.out.print("> 정수 입력 (1 ~ 1000): "); // 백준에서 제외. 넣으면 틀림.
//            int num = sc.nextInt();
//
//            list[i] = num % 42;
//        }
//
//        int cnt = 0;
//        for (int i = 0; i < list.length; i++) {
//            for (int j = 0; j < list.length; j++) {
//                if(i == j || i > j) {
//                   continue;
//                }
//                if(list[i] == list[j]) {
//                    cnt += 1;
//                    break;
//                }
//            }
//        }
//        System.out.println("서로 다른 나머지 값 갯수 : " + (10 - cnt)); // 문구 제외. 넣으면 틀림.

        // 문제2 - 백준 10798번
        Scanner sc = new Scanner(System.in);

        String[][] arr = new String[5][15];
        for(int i = 0; i < arr.length; i++) {
            System.out.print("입력 : ");
            String str = sc.next();
            for(int j = 0; j < str.length(); j++) {
                arr[i][j] = String.valueOf(str.charAt(j));
            }
        }

        for(int i = 0; i < arr[arr.length - 1].length; i++) {
            for(int j = 0; j < arr.length; j++) {
                if(arr[j][i] == null) {
                    continue;
                }else {
                    System.out.print(arr[j][i]);
                }
            }
        }
    }
}
