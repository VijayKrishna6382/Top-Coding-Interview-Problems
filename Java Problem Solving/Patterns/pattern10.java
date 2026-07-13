package pattern;
import java.util.*;
public class pattern10 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int cnt=1;
		int cnt2=0;
		for(int i=0;i<n;i++) {
			cnt2=cnt;
			int h=0;
			for(int j=0;j<=i;j++) {
				System.out.print(cnt2+" ");
				cnt2=cnt2-(n-i+h);
				h++;
			}
			cnt+=n-i;
			System.out.println();
		}

	}

}
