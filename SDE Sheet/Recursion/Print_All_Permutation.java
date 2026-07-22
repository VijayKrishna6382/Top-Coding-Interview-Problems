package Recursion;

class Solution {
    public List<List<Integer>> permute(int[] arr) {
        List<List<Integer>> ans=new ArrayList<>();
        List<Integer> ds=new ArrayList<>();
        boolean[] freq=new boolean[arr.length];
        Permutation(arr,freq,ds,ans);
        return ans;
    }
    public void Permutation(int[] arr,boolean[] freq,List<Integer> ds,List<List<Integer>> ans){
        if(ds.size()==arr.length){
            ans.add(new ArrayList<>(ds));
            return;
        }
         for(int i=0;i<arr.length;i++){
            if(!freq[i]){
                freq[i]=true;
                ds.add(arr[i]);
                Permutation(arr,freq,ds,ans);
                ds.remove(ds.size()-1);
                freq[i]=false;
            }
         }
    }
}
