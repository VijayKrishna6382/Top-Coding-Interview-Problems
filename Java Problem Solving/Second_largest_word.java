package zoho;
import java.util.*;
public class Second_largest_word {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		int l=0,r=0;
		int len=0,maxlen=0;
		int st=0,end=0;
		int st1=0,end1=0;
		int secondmax=0;
		while(r<s.length()) {
			if(s.charAt(r)==' ') {
				len=r-l;
				if(len>maxlen) {
				   secondmax=maxlen;
				   st1=st;
				   end1=end;
				   st=l;
				   end=r;
				   maxlen=len;
				}
				else if(len>secondmax && len<maxlen) {
				   secondmax=len;
				   st1=l;
				   end1=r;
				}
				l=r+1;
			}
			r++;
		}
		len=r-l;
		
		if(len>maxlen) {
			   secondmax=maxlen;
			   st1=st;
			   end1=end;
			   st=l;
			   end=r;
			   maxlen=len;
			}
			else if(len>secondmax && len<maxlen) {
			   secondmax=len;
			   st1=l;
			   end1=r;
			}
	
		for(int i=st1;i<end1;i++) {
			System.out.print(s.charAt(i));
		}

	}

}
