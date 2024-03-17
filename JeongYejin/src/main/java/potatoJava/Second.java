package potatoJava;

import java.util.Scanner;

public class Second {
    public static void main(String[] args) {
        Second second = new Second();
//        second.baekjoon3052();
        second.baekjoon10798();
    }

    public void baekjoon3052() {
        Scanner sc = new Scanner(System.in);
        int[] rest = new int[10];
        for (int i = 0; i < 10; i++) {
            int num = sc.nextInt();
            rest[i] = num % 42;
        }
        for (int i = 0; i < rest.length; i++) {
            for (int j = i+1; j < rest.length; j++) {
                System.out.println();
                if ((rest[i] != -1) && (rest[i] == rest[j])) {
                    rest[j] = -1;
                }
            }
        }
        int sum = 0;
        for (int i = 0; i < rest.length; i++) {
            System.out.println(rest[i]);
            if (rest[i] != -1){
                sum += 1;
            }
        }
        System.out.println(sum);
    }

    public void baekjoon10798() {
        Scanner sc = new Scanner(System.in);
        char[][] zerorock = new char[5][15];

        for (int i = 0; i < zerorock.length; i++) {
            String words = sc.next();
            for (int j = 0; j < words.length(); j++) {
                zerorock[i][j] = words.charAt(j);
            }
        }

        for (int j = 0; j < 15 ; j++) {
            for (int i = 0; i < zerorock.length; i++) {
                if (zerorock[i][j] != '\0') {
                    System.out.print(zerorock[i][j]);
                }
            }
        }
    }
}