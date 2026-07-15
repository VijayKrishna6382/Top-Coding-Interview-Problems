package sdesheet;

/*
class Solution {
    public int findDuplicate(int[] nums) {
        int n=nums.length;
        int[] hash=new int[n+1];
        for(int i=0;i<n;i++){
            hash[nums[i]]++;
            if(hash[nums[i]]>1){
                return nums[i];
            }
        }
        return -1;

    }
}
*/

class Solution {
    public int findDuplicate(int[] nums) {
        int slow=nums[0];
        int fast=nums[0];
        do{
            slow=nums[slow];
            fast=nums[nums[fast]];
        }
        while(slow!=fast);
        slow=nums[0];
        while(slow!=fast){
            slow=nums[slow];
            fast=nums[fast];
        }
        return slow;
    }
}