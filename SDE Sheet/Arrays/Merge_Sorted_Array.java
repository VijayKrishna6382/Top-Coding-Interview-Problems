package sdesheet;


/*
class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int[] ans=new int[m+n];
        int left=0;
        int right=0;
        int idx=0;
        while(left<m && right<n){
            if(nums1[left]<=nums2[right]){
                ans[idx]=nums1[left];
                left++;
                idx++;
            }
            else{
                ans[idx]=nums2[right];
                right++;
                idx++;
            }
        }
        while(left<m){
            ans[idx]=nums1[left];
            left++;
            idx++;
        }
        while(right<n){
            ans[idx]=nums2[right];
            right++;
            idx++;
        }
        for(int i = 0; i < m + n; i++){
            nums1[i] = ans[i];
        }
        
    }
}

*/

class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int len=n+m;
        int gap=(len/2)+(len%2);
        while(gap>0){
            int left=0;
            int right=left+gap;
            while(right<len){
            if(left<m && right>=m){
                swap(nums1,nums2,left,right-m);
            }
            else if(left>=m){
                swap(nums2,nums2,left-m,right-m);
            }
            else{
                swap(nums1,nums1,left,right);
            }
            left++;
            right++;
            
            }
            if(gap==1){
                break;
            }
            else{
                gap=(gap/2)+(gap%2);
            }
        }
        for (int i = 0; i < n; i++) {
            nums1[m + i] = nums2[i];
        }
    }
    public void swap(int[] nums1,int[] nums2,int l,int r){
        if(nums1[l]>nums2[r]){
        int temp=nums1[l];
        nums1[l]=nums2[r];
        nums2[r]=temp;
        }
    }
}
