package A;

import java.util.Arrays;
import java.util.Scanner;

/**
 * http://codeforces.ru/problemset/problem/339/A
 */
public class A339MathHurryToHelp {
    public static void main(final String args[]) {
        final Scanner sc = new Scanner(System.in);
        final String s = sc.nextLine();
        final String[] toSort = new String[(s.length() + 1) / 2];
        for (int i = 0; i < s.length(); i += 2) {
            final String c = s.substring(i, i + 1);
            toSort[i / 2] = c;
        }
        Arrays.sort(toSort);
        final StringBuilder sb = new StringBuilder(toSort[0]);
        for (int i = 1; i < toSort.length; i++)
            sb.append("+").append(toSort[i]);
        System.out.print(sb.toString());
    }
}
