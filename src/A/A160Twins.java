package A;

import java.util.Arrays;
import java.util.Scanner;

/**
 * http://codeforces.ru/problemset/problem/160/A
 */
public class A160Twins {
    public static void main(final String args[]) {
        final Scanner sc = new Scanner(System.in);
        final int n = sc.nextInt();
        final int[] money = new int[n];
        int sum = 0;
        for (int i = 0; i < n; i++) {
            money[i] = sc.nextInt();
            sum += money[i];
        }
        Arrays.sort(money);
        final int middle = sum / 2;
        sum = 0;
        for (int i = n - 1; i >= 0; i--) {
            sum += money[i];
            if (sum > middle) {
                System.out.print(n - i);
                return;
            }
        }
    }
}
