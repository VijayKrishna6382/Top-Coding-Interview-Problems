package sdesheet;

class Solution {
    public int majorityElement(int[] nums) {
       int n=nums.length;
       /*
        int cnt=0;
        int ans=-1;
        int cc=0;
        for(int i=0;i<n;i++){
            cnt=0;
            for(int j=0;j<n;j++){
                if(nums[i]==nums[j]){
                    cnt++;
                }
            }
            if(cnt>n/2 && cnt>cc){
                cc=cnt;
                ans=nums[i];

            }
        }
        return ans;

        */

    /*    HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<n;i++){
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }
        for(Map.Entry<Integer,Integer> entry: map.entrySet()){
            if(entry.getValue()>n/2){
                return entry.getKey();
            }
        }
        return -1;

        */

        int cnt=0;
        int el=0;
        for(int i=0;i<n;i++){
            if(cnt==0){
                el=nums[i];
                cnt=1;
            }
            else if(nums[i]==el){
                cnt++;
            }
            else{
                cnt--;
            }
        }
        cnt=0;
        for(int i=0;i<n;i++){
            if(nums[i]==el){
                cnt++;
            }
        }
        if(cnt>n/2){
            return el;
        }
        return -1;
    }
}
