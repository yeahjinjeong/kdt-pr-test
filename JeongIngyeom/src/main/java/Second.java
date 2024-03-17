import java.util.Scanner;

public class Second {
    public static void main(String[] args) {
        Second.baekjoon3052();
        Second.baekjoon10798();
    }

    public static void baekjoon3052() {
        Scanner sc = new Scanner(System.in);

        int[] arr = new int[42];
        int n, result = 0;
        for (int i = 0; i < 10; i++) {
            n = sc.nextInt();
            arr[n % 42]++;
        }

        for (int i = 0; i < 42; i++) {
            if (arr[i] > 0) {
                result++;
            }
        }
        System.out.println(result);
    }

    public static void baekjoon10798() {
        Scanner sc = new Scanner(System.in);

        char[][] arr = new char[5][15];
        for (int i = 0; i < 5; i++) {
            String s = sc.next();

            for (int j = 0; j < s.length(); j++) {
                arr[i][j] = s.charAt(j);
            }
        }

        for (int i = 0; i < 15; i++) {
            for (int j = 0; j < 5; j++) {
                if (arr[j][i] == '\0') {
                    continue;
                }
                System.out.print(arr[j][i]);
            }
        }

        /*
        Scanner sc = new Scanner(System.in);

        String[] arr = new String[5];
        int max = 0;
        for (int i = 0; i < 5; i++) {
            arr[i] = sc.next();
            max = Math.max(max, arr[i].length());
        }

        for (int i = 0; i < max; i++) {
            for (int j = 0; j < 5; j++) {
                if (arr[j].length() <= i) {
                    continue;
                }
                System.out.print(arr[j].charAt(i));
            }
        }
         */
    }
}