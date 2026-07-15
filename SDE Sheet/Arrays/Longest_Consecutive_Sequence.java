package sdesheet;

class Solution {
    public int longestConsecutive(int[] nums) {
       /*
        if(nums.length==0){
            return 0;
        }
        int maxlen=1;
        int n=nums.length;
        for(int i=0;i<n;i++){
            int x=nums[i];
            int cnt=1;
            while(count(nums,n,x+1)==true){
                cnt++;
                x+=1;
            }
            maxlen=Math.max(cnt,maxlen);
            
        }
        return maxlen;
    }
    public boolean count(int[] nums,int n,int x){
        for(int i=0;i<n;i++){
            if(nums[i]==x){
                return true;
            }
        }
        return false;
        */
        
        int n=nums.length;
        int maxlen=1;
        if(nums.length==0){
            return 0;
        }
        int cnt=1;
        HashSet<Integer> map=new HashSet<>();
        for(int i=0;i<n;i++){
            map.add(nums[i]);
        }
        for(int i=0;i<n;i++){
            int x=nums[i];
            if(!map.contains(x-1)){
                cnt=1;
                int num=x;
                while(num!=Integer.MAX_VALUE && map.contains(num+1)){
                    num+=1;
                    cnt++;
                }
            maxlen=Math.max(cnt,maxlen);
            }
            
        }
        return maxlen;

    }
}
