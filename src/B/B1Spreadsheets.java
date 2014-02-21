package B;

import java.io.IOException;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * http://codeforces.ru/problemset/problem/1/B
 */
public class B1Spreadsheets {
    public static void main(final String args[]) throws IOException {
        Scanner sc = new Scanner(System.in);
        final int n = Integer.parseInt(sc.nextLine());
        //final int n = 1;
        for (int i = 0; i < n; i++) {
            final String s = sc.nextLine();
            //final String s = "R228C494";
            if (Pattern.compile("R\\d+C\\d+").matcher(s).find()) {
                final int val2 = Integer.parseInt(s.substring(s.indexOf("C") + 1));
                final int val1 = Integer.parseInt(s.substring(1, s.indexOf("C")));
                System.out.print(intToString(val2) + val1 + "\n");
            } else {
                Matcher m = Pattern.compile("(\\d+)").matcher(s);
                m.find();
                final int val2 = Integer.parseInt(m.group());
                m = Pattern.compile("([^\\d]+)").matcher(s);
                m.find();
                final String val1 = m.group();
                System.out.print(String.format("R%dC%d\n", val2, stringToInt(val1)));
            }
        }
    }

    private static int stringToInt(final String inp) {
        if (inp.length() == 0) return 0;
        final char c = inp.charAt(inp.length() - 1);
        final int diff = c - 'A' + 1;
        if (inp.length() == 1) return diff;
        return diff + 26 * stringToInt(inp.substring(0, inp.length() - 1));
    }

    private static String intToString(final int inp) {
        if (inp == 0) return "";
        final int s = (inp - 1) % 26;
        final String c = String.valueOf((char) ('A' + s));
        return intToString((inp - 1) / 26) + c;
    }
}
