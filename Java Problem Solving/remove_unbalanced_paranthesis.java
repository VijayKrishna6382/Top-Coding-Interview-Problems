package zoho;
import java.util.*;
public class remove_unbalanced_paranthesis {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		Stack<Integer> st=new Stack<>();
		boolean[] bool=new boolean[s.length()];
		for(int i=0;i<s.length();i++) {
			char ch=s.charAt(i);
			if(ch=='(') {
				st.push(i);
			}
			else if(ch==')'){
				if(!st.isEmpty()) {
					st.pop();
				}
				else {
					bool[i]=true;
				}
			}
				
			}
		while(!st.isEmpty()) {
			bool[st.pop()]=true;
		}
		
		for(int i=0;i<s.length();i++) {
			if(!bool[i]) {
				System.out.print(s.charAt(i));
			}
		}

	}

}
