import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n;
        int cnt = 0;

        // 입력
        n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            if ((i % 4 == 0 && i % 100 != 0) || (i % 400 == 0)) {
                cnt++;
            }
        }

        System.out.println(cnt);
    }
}