package sdesheet;

class Solution {
    public int longestSubarray(int[] arr, int k) {
        
        if (arr.length==0) {
            return 0;
        }
        /*
        int left=0;
        int right=0;
        int maxlen=1;
        long sum=arr[0];
        int n=arr.length;
        while(right<n){
            while(left<=right && sum>k){
                sum-=arr[left];
                left++;
            }
            if(sum==k){
                maxlen=Math.max(maxlen,right-left+1);
            }
            right++;
            if(right<n){
                sum+=arr[right];
            }
            
        }
        return maxlen;
        */
        
        HashMap<Integer,Integer> map=new HashMap<>();
        int maxlen=0;
        int sum=0;
        for(int i=0;i<arr.length;i++){
            sum+=arr[i];
            if(sum==k){
                maxlen=Math.max(maxlen,i+1);
            }
            int presum=sum-k;
            if(map.containsKey(presum)){
                maxlen=Math.max(maxlen,i-map.get(presum));
                
            }
            if(!map.containsKey(sum)){
                map.put(sum,i);
            }
        }
        return maxlen;
        
    }
}

