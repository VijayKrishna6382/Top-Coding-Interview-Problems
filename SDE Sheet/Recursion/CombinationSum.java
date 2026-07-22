package Recursion;

class Solution {
    public List<List<Integer>> combinationSum(int[] arr, int tar) {
        List<List<Integer>> ans=new ArrayList<>();
        Combinationsum(0,arr,new ArrayList<>(),tar,ans);
        return ans;
    }
    public void Combinationsum(int ind,int[] arr,ArrayList<Integer> ds,int tar,List<List<Integer>> ans){
        if(ind==arr.length){
            if(tar==0){
                ans.add(new ArrayList<>(ds));
            }
            return;
        }
        if(arr[ind]<=tar){
            ds.add(arr[ind]);
            Combinationsum(ind,arr,ds,tar-arr[ind],ans);
            ds.remove(ds.size()-1);
        }
        Combinationsum(ind+1,arr,ds,tar,ans);

    }
}