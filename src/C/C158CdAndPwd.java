package C;

import java.util.Scanner;

/**
 * http://codeforces.ru/problemset/problem/158/C
 */
public class C158CdAndPwd {
    public static void main(final String args[]) {
        final Scanner sc = new Scanner(System.in);
        final int n = Integer.parseInt(sc.nextLine());
        String path = "/";
        for (int i = 0; i < n; i++) {
            String cmd = sc.nextLine();
            if ("pwd".equals(cmd)) {
                System.out.println(path);
                continue;
            }
            cmd = cmd.substring(3);
            if (!cmd.startsWith("/")) path += cmd;
            else path = cmd;
            path = (path + "/").replace("//", "/");
            while (true) {
                final String p = path.replaceAll("[a-z]+/\\.\\./", "");
                if (p.equals(path)) break;
                path = p;
            }
            //System.out.println(path);
        }
    }
}
