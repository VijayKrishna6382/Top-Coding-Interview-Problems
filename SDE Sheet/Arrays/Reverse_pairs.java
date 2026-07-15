package sdesheet;

class Solution {
    public int reversePairs(int[] nums) { 
        int n=nums.length;
        int low=0;
        int high=n-1;
        int cnt=mergesort(nums,low,high);
        return cnt;
    }
    public int mergesort(int[] nums,int low,int high){
        int cnt=0;
        if(low>=high){
            return cnt;
        }
        int mid=low+(high-low)/2;
        cnt+=mergesort(nums,low,mid);
        cnt+=mergesort(nums,mid+1,high);
        cnt+=countpairs(nums,low,mid,high);
        merge(nums,low,mid,high);
        return cnt;
    }
    public void merge(int[] nums,int low,int mid,int high){
          int left=low;
          int right=mid+1;
          int[] temp=new int[high-low+1];
          int k=0;
          while(left<=mid && right<=high){
            if(nums[left]<=nums[right]){
                  temp[k++]=nums[left++];
            }
            else{
                temp[k++]=nums[right++];
            }
          }
          while(left<=mid){
            temp[k++]=nums[left++];
          }
          while(right<=high){
            temp[k++]=nums[right++];
          }
          for(int i=low;i<=high;i++){
            nums[i]=temp[i-low];
          }

    }

    public int countpairs(int[] nums,int low,int mid,int high){
        int cnt=0;
        int right=mid+1;
        for(int i=low;i<=mid;i++){
             while(right<=high && nums[i]>2L*nums[right]){
                 right++;
        }
        
        cnt+=right-(mid+1);
        }
        return cnt;
    }
}
