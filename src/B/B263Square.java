package B;

import java.util.Arrays;
import java.util.Scanner;

/**
 * http://codeforces.ru/problemset/problem/263/B
 */
public class B263Square {
    public static void main(final String args[]) {
        final Scanner sc = new Scanner(System.in);
        final int n = sc.nextInt();
        final int k = sc.nextInt();
        if (k > n) {
            System.out.print(-1);
            return;
        }
        final int[] ai = new int[n];
        for (int i = 0; i < n; i++)
            ai[i] = sc.nextInt();
        Arrays.sort(ai);
        System.out.print("0 " + ai[n - k]);
    }
}
