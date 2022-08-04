// try1 -fail : 무한 루프
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            // 공백
            for (int j = 0; j < n - 1 - i; j++) {
                System.out.print("  ");
            }

            // 문자
            for (int j = 0; j < i + 1; j++) {
                System.out.print("@ ");
            }

            System.out.println();
        }

        for (int i = n - 2; i >= 0; i++) { // 오류. i++ 이 아니라 i-- 를 사용해야함.
            // 문자
            for (int j = 0; j < i + 1; j++) {
                System.out.print("@ ");
            }

            // 공백
            for (int j = 0; j < n - 1 - i; j++) {
                System.out.print("  ");
            }

            System.out.println();
        }
    }
}

// try2 - pass
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            // 공백
            for (int j = 0; j < n - 1 - i; j++) {
                System.out.print("  ");
            }

            // 문자
            for (int j = 0; j < i + 1; j++) {
                System.out.print("@ ");
            }

            System.out.println();
        }

        for (int i = n - 2; i >= 0; i--) {
            // 문자
            for (int j = 0; j < i + 1; j++) {
                System.out.print("@ ");
            }

            // 공백
            for (int j = 0; j < n - 1 - i; j++) {
                System.out.print("  ");
            }

            System.out.println();
        }
    }
}

// 선생님 답안
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 변수 선언 및 입력
        int n = sc.nextInt();

        // 모양에 맞게 윗쪽 별을 출력합니다.
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < n - i - 1; j++)
                System.out.print("  ");
            for(int j = 0; j <= i; j++)
                System.out.print("@ ");
            System.out.println();
        }

        // 모양에 맞게 아랫쪽 별을 출력합니다.
        for(int i = n - 2; i >= 0; i--) {
            for(int j = 0; j <= i; j++)
                System.out.print("@ ");
            System.out.println();
        }
    }
}