package zoho;
import java.util.*;
public class Reverse_words_in_a_String {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		Stack<Character> st=new Stack<>();
		for(int i=0;i<s.length();i++) {
			char ch=s.charAt(i);
			if(st.isEmpty() && ch=='.') {
				continue;
			}
			else {
				st.push(ch);
			}
		}
		String ans="";
		String ss="";
		while(!st.isEmpty()) {
			char ch=st.pop();
			if(ch=='.') {
				ss+=ans+".";
				ans="";
			}
			else {
			  ans=ch+ans;
			  if(st.isEmpty()) {
				  ss+=ans;
			  }
			  
			}
			
		}
		System.out.print(ss);

	}

}


/*
import java.util.*;

public class ReverseWordsDot {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        String[] arr = s.split("\\.");

        ArrayList<String> list = new ArrayList<>();

        for (String str : arr) {
            if (!str.equals("")) {
                list.add(str);
            }
        }

        for (int i = list.size() - 1; i >= 0; i--) {
            System.out.print(list.get(i));

            if (i != 0) {
                System.out.print(".");
            }
        }
    }
}
*/