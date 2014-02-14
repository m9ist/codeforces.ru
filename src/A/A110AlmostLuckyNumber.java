package A;

import java.util.Scanner;

/**
 * http://codeforces.ru/problemset/problem/110/A
 */
public class A110AlmostLuckyNumber {
    public static void main(final String args[]) {
        final Scanner sc = new Scanner(System.in);
        final String s = sc.nextLine();
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            final String c = s.substring(i, i + 1);
            if ("4".equals(c) || "7".equals(c)) count++;
        }
        if (count <= 0) {
            System.out.print("NO");
            return;
        }
        while (count > 0) {
            final int c = count % 10;
            if (c != 4 && c != 7) {
                System.out.print("NO");
                return;
            }
            count /= 10;
        }
        System.out.print("YES");
    }
}
