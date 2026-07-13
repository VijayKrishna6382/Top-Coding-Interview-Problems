package zoho;
import java.util.*;
public class Valid_expression {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		Stack<Character> st=new Stack<>();
		for(int i=0;i<s.length();i++) {
			char ch=s.charAt(i);
			if(ch=='(') {
				st.push(ch);
				if(i+1<s.length()) {
					int next=s.charAt(i+1);
					if(next=='+'||next=='-'||next=='/'||next=='*'||next==')') {
						System.out.print("invalid");
						return;
					}
				}
			}
			else if(ch==')') {
				if(st.isEmpty()) {
					System.out.print("invalid");
					return;
				}
				if(i>0) {
					int prev=s.charAt(i-1);
					
					if(prev=='+'||prev=='-'||prev=='/'||prev=='*'||prev=='(') {
						System.out.print("invalid");
						return;
					}
				}
				st.pop();
			}
			else if(ch=='+'||ch=='-'||ch=='/'||ch=='*') {
				
				if(i==0 || i==s.length()-1) {
					System.out.print("invalid");
					return;
				}
				else {
					char next=s.charAt(i+1);
					char prev=s.charAt(i-1);
					if(prev=='+'||prev=='-'||prev=='/'||prev=='*'||prev=='(') {
						System.out.print("invalid");
						return;
					}
					if(next=='+'||next=='-'||next=='/'||next=='*'||next==')') {
						System.out.print("invalid");
						return;
					}
				}
			}
		}
		if(!st.isEmpty()) {
			System.out.print("invalid");
		}
		else {
			System.out.print("valid");
		}

	}

}
