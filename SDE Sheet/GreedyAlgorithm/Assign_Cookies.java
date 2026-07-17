package GreedyAlgorithm;

class Solution {
    public int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);
        int n=g.length;
        int m=s.length;
        int l=0;
        int r=0;
        int cnt=0;
        while(l<n && r<m){
            if(g[l]<=s[r]){
               cnt++;
               l++;
               r++;
            }
            else{
                r++;
            }
        }
        return cnt;
        
    }
}
