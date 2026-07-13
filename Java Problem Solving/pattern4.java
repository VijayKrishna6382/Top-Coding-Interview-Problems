package pattern;
import java.util.*;
public class pattern4 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		for(int i=0;i<n;i++) {
			int cnt=i;
			//space
			
			for(int j=0;j<n-i;j++) {
				System.out.print(" ");
			}
			
			//number
			int bp=(((2*i)+1)/2)-1;
			for(int j=0;j<(2*i)+1;j++) {
				System.out.print(cnt+" ");
				if(j<=bp) {
					cnt--;
				}
				else {
					cnt++;
				}
			}
			
            //space
			
			for(int j=0;j<n-i;j++) {
				System.out.print(" ");
			}
			System.out.println();
		}
		

	}

}
