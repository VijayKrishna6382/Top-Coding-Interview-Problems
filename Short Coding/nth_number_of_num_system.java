package zoho;
import java.lang.foreign.AddressLayout;
import java.util.*;
public class nth_number_of_num_system {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		Queue<String> q=new LinkedList<>();
		q.add("3");
		q.add("4");
		String ans="";
		for(int i=1;i<=n;i++) {
			ans=q.poll();
			q.add(ans+"3");
			q.add(ans+"4");
		}
		System.out.print(ans);

	}

}
