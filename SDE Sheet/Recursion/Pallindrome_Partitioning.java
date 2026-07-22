package Recursion;

class Solution {
    public List<List<String>> partition(String s) {
        List<List<String>> ans=new ArrayList<>();
        List<String> path=new ArrayList<>();
        PallinPartition(0,s,path,ans);
        return ans;
    }
    public void PallinPartition(int ind,String s,List<String> path,List<List<String>> ans){
        if(ind==s.length()){
            ans.add(new ArrayList<>(path));
            return;
        }
        for(int i=ind;i<s.length();i++){
            if(isPallindrome(s,ind,i)){
                path.add(s.substring(ind,i+1));
                PallinPartition(i+1,s,path,ans);
                path.remove(path.size()-1);
            }
        }
    }
    public boolean isPallindrome(String s,int left,int right){
        while(left<=right){
            if(s.charAt(left)!=s.charAt(right)){
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}
