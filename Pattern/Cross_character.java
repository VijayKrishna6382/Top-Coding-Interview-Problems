package zoho;
import java.util.*;
public class Cross_character {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		for(int i=0;i<s.length();i++) {
			int j=s.length()-1-i;
			for(int k=0;k<s.length();k++) {
				if(k==i || k==j) {
					System.out.print(s.charAt(k)+" ");
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		
	}

}
