package pattern;
import java.util.*;
public class pattern3 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		
		for(int i=0;i<n;i++) {
			
			int col=(2*i)+1;
			//space
			for(int j=n-i;j>=0;j--) {
				System.out.print(" ");
			}
			
			//numbers
			
			int bp=((2*i)+1)/2;
			int cnt=i+1;
			for(int j=1;j<=col;j++) {
				System.out.print(cnt+" ");
				if(j<=bp) {
					cnt--;
				}
				else {
					cnt++;
				}
			}
			
			
			//space
			for(int j=n-i;j>=0;j--) {
				System.out.print(" ");
			}
			System.out.println();
		}

	}

}
