package Recursion;
import java.util.*;
public class Subset_Sums {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] arr=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		List<Integer> ans=new ArrayList<>();
		subsetsum(0,0,arr,ans);
		for(int i=0;i<ans.size();i++) {
			System.out.print(ans.get(i)+" ");
		}

	}
	public static void subsetsum(int ind,int sum,int[] arr,List<Integer> ans) {
		if(ind==arr.length) {
			ans.add(sum);
			return;
		}
		subsetsum(ind+1,sum+arr[ind],arr,ans);
		subsetsum(ind+1,sum,arr,ans);
		
	}

}
