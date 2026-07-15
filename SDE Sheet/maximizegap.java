package sdesheet;
import java.util.*;
public class maximizegap {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int k=sc.nextInt();
		int[][] arr=new int[n][2];
		for(int i=0;i<n;i++) {
			arr[i][0]=sc.nextInt();
			arr[i][1]=sc.nextInt();
		}	
		Arrays.sort(arr,(a,b)->(a[1]-b[1]));
        int low=1;
        int ans=-1;
        int high=arr[n-1][1]-arr[0][0];
        while(low<=high){
            int mid=low+(high-low)/2;
            if(issafe(arr,k,mid)){
                ans=mid;
                low=mid+1;
            }
            else{
                high=mid-1;
            }
            
        }
        System.out.print(high);
    }
    public static boolean issafe(int[][] arr,int k,int dist){
        int cnt=1;
        int last=arr[0][1];
        for(int i=1;i<arr.length;i++){
            if(arr[i][0]-last>=dist){
                last=arr[i][1];
                cnt++;
            }
            if(cnt>=k){
                return true;
            }
        }
        return false;

	}

}
