package A;

import java.util.Scanner;

/**
 * http://codeforces.ru/problemset/problem/96/A
 */
public class A96PetiaAndFootball {
    public static void main(final String args[]) {
        final Scanner sc = new Scanner(System.in);
        final String pl = sc.nextLine();
        String lastCh = "";
        int count = 1;
        for (int i = 0; i < pl.length(); i++) {
            final String c = pl.substring(i, i+1);
            if (!"".equals(lastCh)) {
                if (lastCh.equals(c)) count++;
                else count = 1;
            }
            lastCh = c;
            if (count >=7) {
                System.out.print("YES");
                return;
            }
        }
        System.out.print("NO");
    }
}
