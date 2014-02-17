package B;

import java.util.Arrays;
import java.util.Scanner;

/**
 * http://codeforces.ru/problemset/problem/160/B
 */
public class B160UnluckyTicket {
    public static void main(final String args[]) {
        final Scanner sc = new Scanner(System.in);
        final int n = Integer.parseInt(sc.nextLine());
        final String tmp = sc.nextLine();
        final int[] vals1 = new int[n];
        final int[] vals2 = new int[n];
        int s1 = 0, s2 = 0;
        for (int i = 0; i < 2 * n; i++) {
            if (i < n) {
                vals1[i] = Integer.parseInt(tmp.substring(i, i + 1));
                s1 += vals1[i];
            } else {
                vals2[i % n] = Integer.parseInt(tmp.substring(i, i + 1));
                s2 += vals2[i % n];
            }
        }
        Arrays.sort(vals1);
        Arrays.sort(vals2);
        boolean isTrue = true;
        for (int i = 0; i < n; i++) {
            if (s1 > s2) {
                if (vals1[i] <= vals2[i]) isTrue = false;
            } else if (vals1[i] >= vals2[i]) isTrue = false;
        }
        System.out.print(isTrue ? "YES" : "NO");
    }
}
