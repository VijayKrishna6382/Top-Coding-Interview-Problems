package sdesheet;

/*
class Solution {
    public void nextPermutation(int[] nums) {
         int ind =-1;
         int n=nums.length;
         for(int i=n-2;i>=0;i--){
            if(nums[i]<nums[i+1]){
                ind=i;
                break;
            }
         }
         if(ind==-1){
            rev(0,nums.length-1,nums);
            return;
         }
         
         for(int i=n-1;i>=0;i--){
            if(nums[i]>nums[ind]){
                  swap(ind,i,nums);
                  break;
            }
         }
         
         rev(ind+1,nums.length-1,nums);
                
    }
    public void swap(int i,int j,int[] nums){
            int temp=nums[i];
            nums[i]=nums[j];
            nums[j]=temp;
         }
    public void rev(int i ,int j,int[] nums){
        int l=i;
        int r=j;
        while(l<r){
            int temp=nums[l];
            nums[l]=nums[r];
            nums[r]=temp;
            l++;
            r--;
        }
    }


}
*/

class Solution {
    public void nextPermutation(int[] nums) {
        int n=nums.length;
        int ind=-1;
        for(int i=n-2;i>=0;i--){
            if(nums[i]<nums[i+1]){
                 ind=i;
                 break;
            }
        }
        if(ind==-1){
            reverse(0,n-1,nums);
            return;
        }
        for(int i=n-1;i>=0;i--){
           if(nums[i]>nums[ind]){
              swap(i,ind,nums);
              break;
           }
        }
        reverse(ind+1,n-1,nums);
    }
    public void swap(int i,int j,int[] nums){
        int temp=nums[i];
        nums[i]=nums[j];
        nums[j]=temp;
    }
    public void reverse(int i,int j,int[] nums){
        int left=i;
        int right=j;
        while(left<right){
            int temp=nums[left];
            nums[left]=nums[right];
            nums[right]=temp;
            left++;
            right--;
        }
        for(int k=0;k<nums.length;k++){
            System.out.print(nums[k]+" ");
        }
        
    }
}
