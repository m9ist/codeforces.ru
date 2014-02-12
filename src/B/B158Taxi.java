package B;

import java.io.IOException;
import java.util.Scanner;

/**
 * http://codeforces.ru/problemset/problem/158/B
 */
public class B158Taxi {
    public static void main(final String args[]) throws IOException {
        final Scanner sc = new Scanner(System.in);
        final int n = sc.nextInt();
        sc.nextLine();
        final int[] ns = new int[4];
        for (int i = 0; i < n; i++) {
            final int ni = sc.nextInt();
            if (ni < 1 || ni > 4) return;
            ns[ni - 1]++;
        }
        int count = ns[3] + ns[2];
        ns[0] = Math.max(0, ns[0] - ns[2]);
        count += (ns[1] / 2) + (ns[1] % 2);
        if (ns[0] > 0 && (ns[1] % 2 == 1)) ns[0] = Math.max(0, ns[0] - 2);
        count += ns[0] / 4;
        if (ns[0] % 4 > 0) count++;
        System.out.print(count);
    }
}
