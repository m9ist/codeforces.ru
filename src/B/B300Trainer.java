package B;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

/**
 * http://codeforces.ru/problemset/problem/300/B
 */
public class B300Trainer {
    public static void main(final String args[]) throws IOException {
        Scanner sc = new Scanner(System.in);
        final int n = sc.nextInt();
        final int m = sc.nextInt();
        final HashMap<Integer, ArrayList<Integer>> arr = new HashMap<Integer, ArrayList<Integer>>();
        final boolean[] hasFriend = new boolean[n];
        final boolean[] hasOutput = new boolean[n];
        for (int i = 0; i < m; i++) {
            final int a = sc.nextInt() - 1;
            final int b = sc.nextInt() - 1;
            hasFriend[a] = true;
            hasFriend[b] = true;
            if (arr.containsKey(a) && arr.containsKey(b)) {
                final ArrayList<Integer> toReplace = arr.get(a);
                final ArrayList<Integer> toAdd = arr.get(b);
                if (toAdd != toReplace) {
                    for (final int aToAdd : toAdd)
                        toReplace.add(aToAdd);
                }
                arr.put(b, toReplace);
            } else if (arr.containsKey(a)) {
                arr.get(a).add(b);
                arr.put(b, arr.get(a));
            } else if (arr.containsKey(b)) {
                arr.get(b).add(a);
                arr.put(a, arr.get(b));
            } else {
                final ArrayList<Integer> toAdd = new ArrayList<Integer>();
                toAdd.add(a);
                toAdd.add(b);
                arr.put(a, toAdd);
                arr.put(b, toAdd);
            }
        }
        final StringBuilder sb = new StringBuilder();
        final StringBuilder sbTmp = new StringBuilder();
        int lastWithoutFriends = 0;
        for (final int i : arr.keySet()) {
            final ArrayList<Integer> friends = arr.get(i);
            {
                int j = 0;
                while (j < friends.size()) {
                    int s = j + 1;
                    while (s < friends.size()) {
                        if (friends.get(s).equals(friends.get(j))) {
                            friends.remove(s);
                        } else {
                            s++;
                        }
                    }
                    j++;
                }
            }
            if (friends.size() > 3) {
                System.out.println("-1");
                return;
            }
            boolean alreadyDone = false;
            for (final int j : friends) {
                if (hasOutput[j]) {
                    alreadyDone = true;
                    break;
                }
                hasOutput[j] = true;
                append(sbTmp, j);
            }
            if (alreadyDone) continue;
            if (friends.size() < 3) {
                for (int j = 3 - friends.size(); j > 0; j--) {
                    boolean found = false;
                    for (int k = lastWithoutFriends; k < n; k++) {
                        lastWithoutFriends++;
                        if (!hasFriend[k] && !hasOutput[k]) {
                            found = true;
                            hasOutput[k] = true;
                            append(sbTmp, k);
                            break;
                        }
                    }
                    if (!found) {
                        System.out.println("-1");
                        return;
                    }
                }
            }
            sb.append("\n").append(sbTmp.toString());
            sbTmp.setLength(0);
        }
        int count = 0;
        for (int k = lastWithoutFriends; k < n; k++) {
            if (!hasOutput[k]) {
                hasOutput[k] = true;
                append(sbTmp, k);
                count++;
            }
            if (count == 3) {
                count = 0;
                sb.append("\n").append(sbTmp.toString());
                sbTmp.setLength(0);
            }
        }
        sb.replace(0, 1, "");
        System.out.print(sb.toString());
    }

    private static void append(final StringBuilder sb, final int i) {
        if (sb.length() > 0) sb.append(" ");
        sb.append((i + 1));
    }
}
