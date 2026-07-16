package sdesheet;

class Solution {
    public List<List<Integer>> threeSum(int[] nums) {

    /*
        Set<List<Integer>> list=new HashSet<>();
        int n=nums.length;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){      
                for(int k=j+1;k<n;k++){
                    int tar=nums[i]+nums[j]+nums[k];
                    if(tar==0){ 
                         List<Integer> temp=new ArrayList<>(Arrays.asList(nums[i],nums[j],nums[k]));
                         Collections.sort(temp);
                         list.add(temp);                 
                    }
                    
                }
            }
        }
        return new ArrayList<>(list);

        */
         Arrays.sort(nums);
        List<List<Integer>> list=new ArrayList<>();
        int n=nums.length;
        for(int i=0;i<n;i++){
            int l=i+1;
            int r=n-1;
            if(i>0 && nums[i]==nums[i-1]){
                continue;
            }
            while(l<r){
            int tar=nums[i]+nums[l]+nums[r];
            if(tar==0){
               List<Integer> temp=new ArrayList<>(Arrays.asList(nums[i],nums[l],nums[r]));
               list.add(temp);
            
           
            l++;
            r--;
            while(l<r && nums[l]==nums[l-1]){
                l++;
            }
            while(l<r && nums[r]==nums[r+1]){
                r--;
            }

            }
            else if(tar<0){
                l++;
            }
            else{
                r--;
            }
            
        }
        }
        return list;
    }
}
