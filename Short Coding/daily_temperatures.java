package zoho;
import java.util.*;
public class daily_temperatures {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] arr=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		Stack<Integer> st=new Stack<>();
		int[] res=new int[n];
		for(int i=0;i<n;i++) {
			while(!st.isEmpty() && arr[i]>arr[st.peek()]) {
				int idx=st.pop();
				res[idx]=i-idx;
			}
			st.push(i);
		}
		for(int i=0;i<n;i++) {
			System.out.print(res[i]+" ");
		}

	}

}
