package sdesheet;

class Solution {
    public List<Integer> majorityElement(int[] nums) {
        List<Integer> ans=new ArrayList<>();
        int n=nums.length;
        int cnt1=0;
        int cnt2=0;
        int el1=0;
        int el2=0;
        for(int i=0;i<nums.length;i++){
            if(cnt1==0 && nums[i]!=el2){
                el1=nums[i];
                cnt1=1;
            }
            else if(cnt2==0 && nums[i]!=el1){
                el2=nums[i];
                cnt2=1;
            }
            else if(nums[i]==el1){
                cnt1++;
            }
            else if(nums[i]==el2){
                cnt2++;
            }
            else{
                cnt1--;
                cnt2--;
            }
        }
        cnt1=0;
        cnt2=0;
        for(int i=0;i<nums.length;i++){
            if(el1==nums[i]){
                cnt1++;
            }
            else if(el2==nums[i]){
                cnt2++;
            }

        }
        int times=(n/3)+1;
        if(cnt1>=times){
            ans.add(el1);
        }
        if(cnt2>=times){
            ans.add(el2);
        }
        return ans;
    }
}
