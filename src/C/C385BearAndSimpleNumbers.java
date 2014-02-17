package C;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * http://codeforces.ru/problemset/problem/385/C
 */
public class C385BearAndSimpleNumbers {
    final private static int MAX_INT = 10000000;

    public static void main(final String args[]) throws Exception {
        final Scanner sc = new Scanner(System.in);
        final int n = sc.nextInt();
        final int[] xi = new int[n];
        final ArrayList<Integer> simples = new ArrayList<Integer>();
        for (int i = 2; i < Math.sqrt(MAX_INT); i++) {
            boolean found = false;
            for (final int simple : simples)
                if (i % simple == 0) {
                    found = true;
                    break;
                }
            if (!found) simples.add(i);
        }
        final Map<Integer, ArrayList<Integer>> map = new HashMap<Integer, ArrayList<Integer>>();
        for (final int i : simples)
            map.put(i, new ArrayList<Integer>());
        for (int i = 0; i < n; i++) {
            final int x = sc.nextInt();
            if (x > MAX_INT) throw new Exception("BLA BLA BLA");
            xi[i] = x;
            for (final int simple : simples)
                if (x % simple == 0)
                    map.get(simple).add(i + 1);
        }
        final int m = sc.nextInt();
        for (int i = 0; i < m; i++) {
            final int l = sc.nextInt();
            final int r = sc.nextInt();
            int sum = 0;
            for (final int simple : simples) {
                if (simple > r) break;
                if (simple >= l)
                    sum += map.get(simple).size();
            }
            System.out.println(sum);
        }
    }
}
