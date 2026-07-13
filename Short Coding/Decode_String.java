package zoho;

import java.util.*;

public class Decode_String {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        Stack<Integer> numStack = new Stack<>();
        Stack<String> strStack = new Stack<>();

        String curr = "";
        int num = 0;

        for (int i = 0; i < s.length(); i++) {

            char ch = s.charAt(i);

            if (Character.isDigit(ch)) {
                num = num * 10 + (ch - '0');
            }

            else if (ch == '[') {

                numStack.push(num);
                strStack.push(curr);

                num = 0;
                curr = "";

            }

            else if (ch == ']') {

                int repeat = numStack.pop();
                String prev = strStack.pop();

                for (int j = 0; j < repeat; j++) {
                    prev += curr;
                }

                curr = prev;
            }

            else {

                curr += ch;

            }
        }

        System.out.println(curr);
    }
}