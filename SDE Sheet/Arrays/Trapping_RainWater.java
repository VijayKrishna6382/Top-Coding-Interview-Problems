package sdesheet;
public class Trapping_RainWater {
	
	public static void main(String[] args) {
		/*
	       int n=arr.length;
	       int left=0;
	       int right=n-1;
	       int lmax=0;
	       int rmax=0;
	       int tot=0;
	       while(left<=right){
	          if(arr[left]<=arr[right]){
	              if(arr[left]<=lmax){
	                  tot+=lmax-arr[left];
	              }
	              else{
	                lmax=arr[left];
	              }
	              left++;
	          }
	          else{
	            if(arr[right]<=rmax){
	                tot+=rmax-arr[right];
	            }
	            else{
	                rmax=arr[right];
	            }
	            right--;
	          }
	       }
	       return tot;

	*/


	       int n=arr.length;
	       int lmax=0;
	       int rmax=0;
	       int tot=0;
	       int[] leftmax=new int[n];
	       int[] rightmax=new int[n];
	       leftmax[0]=arr[0];
	       for(int i=1;i<n;i++){
	         leftmax[i]=Math.max(leftmax[i-1],arr[i]);
	       }
	       rightmax[n-1]=arr[n-1];
	       for(int i=n-2;i>=0;i--){
	         rightmax[i]=Math.max(rightmax[i+1],arr[i]);
	       }
	       for(int i=0;i<n;i++){
	        lmax=leftmax[i];
	        rmax=rightmax[i];
	        if(arr[i]<lmax && arr[i]<rmax){
	            tot+=Math.min(lmax,rmax)-arr[i]; 
	        }
	       }
	     return tot;

	}

}
