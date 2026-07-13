package pattern;
import java.util.*;

public class pattern8 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int num=2;
		for(int i=0;i<n;i++) {
			int cnt=num-1;
			int inc=2+i;
			for(int j=0;j<n;j++) {
				System.out.print(cnt+" ");
				if(j==1) {
					num=cnt;
				}
				cnt+=inc;
				inc++;
				
			}
			System.out.println();
		}

	}

}
