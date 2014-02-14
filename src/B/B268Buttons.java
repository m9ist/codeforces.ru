package B;

import java.util.Scanner;

/**
 * http://codeforces.ru/problemset/problem/268/B
 */
public class B268Buttons {
    public static void main(final String args[]) {
        final Scanner sc = new Scanner(System.in);
        final int n = sc.nextInt();

        int count = 0;
        for (int i = 1; i <= n; i++) {
            count += i * (n - i) + 1;
        }
        System.out.print(count);
    }
}
