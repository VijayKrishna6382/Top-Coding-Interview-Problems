package zoho;

import java.util.*;

public class RemoveDuplicates {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        boolean[] visited = new boolean[256];
        String ans = "";

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if (!visited[ch]) {
                visited[ch] = true;
                ans += ch;
            }
        }

        System.out.println(ans);
    }
}
