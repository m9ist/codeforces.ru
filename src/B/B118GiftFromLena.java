package B;

import java.io.IOException;
import java.util.Scanner;

/**
 * http://codeforces.ru/problemset/problem/118/B
 */
public class B118GiftFromLena {
    public static void main(final String args[]) throws IOException {
        Scanner sc = new Scanner(System.in);
        final int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            printLine(i, n);
        }
        for (int i = n; i >= 0; i--) {
            printLine(i, n);
        }
    }

    private static void printLine(final int i, final int n) {
        boolean first = true;
        for (int j = 0; j < n - i; j++) {
            System.out.print((first ? "" : " ") + " ");
            first = false;
        }
        for (int j = 0; j <= i; j++) {
            System.out.print((i == n && j == 0 ? "" : " ") + j);
        }
        for (int j = i - 1; j >= 0; j--)
            System.out.print(" " + j);
        System.out.println();
    }
}
