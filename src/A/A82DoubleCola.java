package A;

import java.io.IOException;
import java.util.Scanner;

/**
 * http://codeforces.ru/problemset/problem/82/A
 */
public class A82DoubleCola {
    public static void main(final String args[]) throws IOException {
        final Scanner sc = new Scanner(System.in);
        final long n = sc.nextLong();
        //final long n = 75;
        final String[] names = new String[]{"Sheldon", "Leonard", "Penny", "Rajesh", "Howard"};
        //while ((1 << pow2) < ((n - 1) / 5 + 1)) pow2++;
        int group = 1;
        long groupCount = 5;
        while (groupCount + 5 * (1 << group) < n) {
            groupCount += 5 * (1 << group);
            group++;
        }
        if (n <= 5) {
            System.out.print(names[((int) (n - 1))]);
            return;
        }
        final long diff = n - groupCount - 1;
        final int nc = (int) (diff / (1 << group));
        System.out.print(names[nc]);
    }
}
