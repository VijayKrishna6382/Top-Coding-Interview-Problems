package sdesheet;

/*
class Solution {
    public int maxSubArray(int[] nums) {
        int curmax=nums[0];
        int max=nums[0];
        for(int i=1;i<nums.length;i++){
            curmax=Math.max(nums[i],curmax+nums[i]);
            max=Math.max(curmax,max);
        }
        return max;
    }
}

*/







//to print maximum Subarray sum.
/*
class Solution {
    public int maxSubArray(int[] nums) {
       int sum=0;
       int max=Integer.MIN_VALUE;
       for(int i=0;i<nums.length;i++){
        sum+=nums[i];
        if(sum>max){
            max=sum;
        }
        if(sum<0){
            sum=0;
        }
       }
       return max;
      
    }
}
*/

// to print the max subarrays elements.
class Solution {
    public  maxSubArray(int[] nums) {
       int sum=0;
       int stidx=0;
       int endidx=0;
       int max=Integer.MIN_VALUE;
       for(int i=0;i<nums.length;i++){
        sum+=nums[i];
        if(sum==0){
           stidx=i;
        }
        if(sum>max){
            max=sum;
            endidx=i;
        }
        if(sum<0){
            sum=0;
        }
       }
       System.out.println(max);
       for(int i=stidx;i<=endidx;i++){
           System.out.print(nums[i]+" ");
       }
       
      
    }
}