package A;

import java.util.Scanner;

/**
 * http://codeforces.ru/problemset/problem/38/A
 */
public class A38Army {
    public static void main(final String args[]) {
        final Scanner sc = new Scanner(System.in);
        final int n = sc.nextInt();
        final int[] arr = new int[n - 1];
        for (int i = 0; i < n - 1; i++) {
            arr[i] = sc.nextInt();
        }
        final int a = sc.nextInt();
        final int b = sc.nextInt();
        int count = 0;
        for (int i = a - 1; i < b - 1; i++)
            count += arr[i];
        System.out.print(count);
    }
}
