package D;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * http://codeforces.ru/problemset/problem/158/D
 */
public class D158FrostSculpture {
    public static void main(final String args[]) {
        final Scanner sc = new Scanner(System.in);
        final int n = sc.nextInt();
        final ArrayList<Integer> arr = new ArrayList<Integer>();
        for (int i = 3; i <= n; i++)
            if (n % i == 0) arr.add(i);
        final ArrayList<ArrayList<Integer>> arrbig = new ArrayList<ArrayList<Integer>>();
        for (int i = 0; i < arr.size(); i++) {
            final ArrayList<Integer> v = new ArrayList<Integer>();
            for (int j = 0; j < (n / arr.get(i)); j++) v.add(j, 0);
            arrbig.add(i, v);
        }

        for (int i = 0; i < n; i++) {
            final int v = sc.nextInt();
            for (int j = 0; j < arr.size(); j++) {
                final int dom = arr.get(j);
                final ArrayList<Integer> domv = arrbig.get(j);
                final int index = i % (n / dom);
                domv.set(index, domv.get(index) + v);
            }
        }
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.size(); i++) {
            final ArrayList<Integer> domv = arrbig.get(i);
            for (Integer aDomv : domv)
                max = Math.max(max, aDomv);
        }
        System.out.print(max);
    }
}
