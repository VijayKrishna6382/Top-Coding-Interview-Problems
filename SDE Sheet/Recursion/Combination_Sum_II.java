package Recursion;

class Solution {
    public List<List<Integer>> combinationSum2(int[] arr, int tar) {
        List<List<Integer>> ans=new ArrayList<>();
        Arrays.sort(arr);
        Combinationsum(0,arr,tar,new ArrayList<>(),ans);
        return ans;
    }
    public void Combinationsum(int ind,int[] arr,int tar,ArrayList<Integer> ds,List<List<Integer>> ans){
        
        if(tar==0){
            ans.add(new ArrayList<>(ds));
            return;
        }

        for(int i=ind;i<arr.length;i++){
            if(i>ind && arr[i]==arr[i-1]){
                continue;
            }
            if(arr[i]>tar){
                break;
            }
            ds.add(arr[i]);
            Combinationsum(i+1,arr,tar-arr[i],ds,ans);
            ds.remove(ds.size()-1);
        }
    }
}