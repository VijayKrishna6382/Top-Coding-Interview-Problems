package zoho;
import java.util.*;
public class alternatesorting {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] arr=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		int left=0;
		int right=n-1;
		while(left<right) {
			System.out.print(arr[right]+" ");
			System.out.print(arr[left]+" ");
			left++;
			right--;	
		}
		if (left==right) {
            System.out.print(arr[left]);
        }
		

	}

}
